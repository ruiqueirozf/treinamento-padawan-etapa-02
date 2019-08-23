package br.com.frwk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio01 {
    /*
        Escreva um programa que peça ao usuário para informar
        o nome do vendedor e
        seu total de comissões,
        em seguida pergunte ao usuário se deseja informar a comissão de outro vendedor.
        Se sim, repita o processo,
        Senão:
        Exiba nome e total de comissão do vendedor que teve a maior comissão
        e do que teve a menor.
        Mostre também o valor médio de comissão.
    */
    public static List<Vendedor> vendedores = new ArrayList<Vendedor>();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("1 - Cadastrar vendedor");
            
            System.out.println("2 - Mostrar vendedor com maior e menor comissão");

            System.out.println("3 - Mostrar média de comissão dos vendedores");

            System.out.println("0 - Sair");
            opcao = sc.nextInt();
            
            switch (opcao){
                case 1:
                    cadastrarVendedor();
                    break;
                case 2:
                    mostrarVendedorMaiorEMenorComissao();
                    break;
                case 3:
                    mediaComissao();
                    break;
            }
        } while (opcao != 0);
    }

    public static void cadastrarVendedor() {
        String limpar = sc.nextLine();
        String nomeVendedor;
        Double totalComissao;

        System.out.println("Digite o nome do vendedor: ");
        nomeVendedor = sc.nextLine();

        System.out.println("Qual o valor total da comissao? ");
        totalComissao = sc.nextDouble();

        //instanciar classe vendedor e adicionar vendedor a lista
        Vendedor vendedor = new Vendedor(nomeVendedor, totalComissao);
        vendedores.add(vendedor);
    }
    
    public static void mostrarVendedorMaiorEMenorComissao(){
        String nomeVendMaiorComissao = "";
        Double maiorComissao = 0.0;
        String nomeVendMenorComissao = vendedores.get(0).getNomeVendedor();
        Double menorComissao = vendedores.get(0).getTotalComissao();

        //for para maior comissão
        for (Vendedor vendedor: vendedores) {
            if (maiorComissao < vendedor.getTotalComissao()){
                maiorComissao = vendedor.getTotalComissao();
                nomeVendMaiorComissao = vendedor.getNomeVendedor();
            }
        }

        //for para menor comissão
        for (Vendedor vendedor: vendedores) {
            if (menorComissao > vendedor.getTotalComissao()){
                menorComissao = vendedor.getTotalComissao();
                nomeVendMenorComissao = vendedor.getNomeVendedor();
            }
        }

        System.out.println("### Maior Comissão ###");
        System.out.println("O vendedor com maior comissao é: " + nomeVendMaiorComissao);
        System.out.println("O Valor da comissao é: " + maiorComissao);
        System.out.println("### Menor Comissão ###");
        System.out.println("O vendedor com menor comissao é: " + nomeVendMenorComissao);
        System.out.println("O Valor da comissao é: " + menorComissao);
    }

    public static Double mediaComissao(){
        Double somaComissao = 0.0;
        Double media = 0.0;

        for (Vendedor vendedor: vendedores) {
            somaComissao += vendedor.getTotalComissao();
        }
        media = (somaComissao / vendedores.size());

        System.out.println("O valor da média de comissão dos vendedores é: " + media + "\n");

        return media;
    }
}
