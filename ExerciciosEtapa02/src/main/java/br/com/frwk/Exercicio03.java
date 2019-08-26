package br.com.frwk;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        // Escreva um programa que peça ao usuário que
        // informe um número inteiro qualquer.
        // Em seguida escreva todos números entre
        // zero e o número informado pelo usuário.

        Scanner sc = new Scanner(System.in);
        int numeroQualquer;

        System.out.println("Usuário, informe um número qualquer ? ");
        numeroQualquer = sc.nextInt();

        for (int i = 0; i < numeroQualquer; i++){
            System.out.println(i);
        }
    }
}
