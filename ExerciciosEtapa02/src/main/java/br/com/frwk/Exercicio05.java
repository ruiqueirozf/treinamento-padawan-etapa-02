package br.com.frwk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio05 {

    //5 - Lista de Compras
    //
    //Escreva um programa que apresente quatro opções para o usuário.
    //1 - Adicionar Item a Lista de Compra:
    //2 - Remover Item a Lista de Compra:
    //3 - Consultar Itens na Lista de Compra:
    //4- - Sair
    //
    //Para adicionar, peça que o usuário informe somente o nome do item para ser adicionado.
    //
    //Para remover, peça que informe o número do item, e retire o item da lista.
    //
    //Ao consultar, descreva todos os itens presentes na lista com seu respectivo número de identificação.
    //
    //Ao sair, encerre a execução.

    public static List<String> itens = new ArrayList<String>();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("1 - Adicionar Item a Lista de Compra");

            System.out.println("2 - Remover Item a Lista de Compra");

            System.out.println("3 - Consultar Itens na Lista de Compra");

            System.out.println("0 - Sair");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    String limpar = sc.nextLine();
                    // add item
                    System.out.println("Informe o nome do Item: ");
                    String nomeItem = sc.nextLine();
                    itens.add(nomeItem);
                    break;
                case 2:
                    // remover item
                    System.out.println("Informe o numero do Item: ");
                    int numeroProduto = sc.nextInt();
                    int indice = numeroProduto - 1;
                    itens.remove(indice);
                    break;
                case 3:
                    // listar produto
                    for (int i = 0; i < itens.size(); i++){
                        nomeItem = itens.get(i);
                        int numeroItem = i + 1;
                        System.out.println(numeroItem + " " + nomeItem);
                    }
                    break;
            }
        } while (opcao != 0);
    }
}
