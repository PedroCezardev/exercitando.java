// 2) Faça um programa que leia 50 valores e no final, escreva o maior e o menor valor lido.

import java.util.Scanner;

public class questao2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // declarando variáveis
        int quantValores = 10;
        int valorMaior = Integer.MIN_VALUE;
        int valorMenor = Integer.MAX_VALUE;

        // codigo para armazenar os valores seguintes
        for (int i = 1; i <= quantValores; i++) {
            // digitar os valores
            System.out.print("Digite o valor " + i + ":");
            int valor = scanner.nextInt();

            // armazenando maior valor
            if(valor > valorMaior) {
                valorMaior = valor;
            }

            // armazenando menor valor
            if (valor < valorMenor) {
                valorMenor = valor;
            }
        }

        // output dos valores inseridos
        System.out.println("O maior valor lido é: " + valorMaior);
        System.out.println("O menor valor lido é: " + valorMenor);

    }
}
