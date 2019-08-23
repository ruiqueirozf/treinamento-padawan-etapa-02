package br.com.frwk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio02 {

    public static List<Usuario> usuarios = new ArrayList<Usuario>();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("1 - Cadastrar usuario");

            System.out.println("2 - Fazer login");

            //System.out.println("3 - Mostrar média de comissão dos vendedores");

            System.out.println("0 - Sair");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    cadastrarUsuario();
                    break;
                case 2:
                    loginUsuario();
                    break;
/*                case 3:
                    mediaComissao();
                    break;*/
            }
        } while (opcao != 0);
    }

    public static void cadastrarUsuario(){
        String limpar = sc.nextLine();
        String login;
        String senha;

        System.out.println("Digite o login: ");
        login = sc.nextLine();

        System.out.println("Digite a senha: ");
        senha = sc.nextLine();

        Usuario usuario = new Usuario(login, senha);
        usuarios.add(usuario);
    }

    public static void loginUsuario(){
        String login;
        String senha;

        System.out.println("Digite o login: ");
        login = sc.nextLine();

        System.out.println("Digite a senha: ");
        senha = sc.nextLine();

        boolean logado = false;

        for (Usuario usuario: usuarios) {
            if (login.equals(usuario.getLogin()) && senha.equals(usuario.getSenha())){
                System.out.println("Bem vindo " + login);
                logado = true;
                break;
            }
        }
        if (!logado){
            System.out.println("Usuario não encontrado");
        }
    }
}
