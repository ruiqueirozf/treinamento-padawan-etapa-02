package br.com.frwk;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        // Escreva um programa onde usuário irá informar
        // seu peso e altura.
        // Calcule o IMC (Índice de Massa Corporal).
        // O IMC é calculado dividindo o peso pela altura elevada ao quadrado.
        // Em seguida exiba o status de acordo com a tabela abaixo:

        Double peso;
        Double altura;

        Scanner sc = new Scanner(System.in);
        System.out.println("Usuário, informe seu peso: ");
        peso = sc.nextDouble();

        System.out.println("Usuário, informe sua altura: ");
        altura = sc.nextDouble();

        calcularImc(peso, altura);

    }

    // O IMC é calculado dividindo o peso pela altura elevada ao quadrado.
    public static double calcularImc(Double peso, Double altura){
        Double imc = (peso)/(altura*altura);
        System.out.println("Seu imc é: " + imc);

        if (imc < 17){
            System.out.println("Muito abaixo do peso.");
        }
        else if (imc >= 17 && imc <= 18.49){
            System.out.println("Abaixo do peso.");
        }
        else if (imc >= 18.5 && imc <= 24.99){
            System.out.println("Peso normal");
        }
        else if (imc >= 25 && imc <= 29.99){
            System.out.println("Acima do peso.");
        }
        else if (imc >= 30 && imc <= 34.99){
            System.out.println("Obesidade I");
        }
        else if (imc >= 35 && imc <= 39.99){
            System.out.println("Obesidade II");
        }
        else if (imc > 40){
            System.out.println("Obesidade III");
        }

        return imc;
    }
}
