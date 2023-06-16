// 1)Escreva um programa em java para ler o número de estudantes existentes em uma turma e, em seguida, ler as notas destes estudantes, calcular e escrever a média aritmética dessas notas lidas. OBS: Só devem ser aceitos valores válidos durante a leitura (0 a 10) para cada nota.

import java.util.Scanner;

public class questao1 {
     
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // digitar o numero do estudantes
        System.out.print("Digite o número de estudantes: ");
        int numEstudantes = scanner.nextInt();

        // declarando variáveis 
        int[] notas = new int[numEstudantes];
        int soma = 0;

        // codigo para calcular a media dos alunos
        for (int i = 0; i < numEstudantes; i++) {
            int nota;
            do {
                // digitar a nota dos estudantes
                System.out.printf("Digite a nota do estudante %d (0 a 10): ", (i+1));
                nota = scanner.nextInt();
                // codigo para calcular a média aritmérica das notas
            }while (nota < 0 || nota > 10 );

            notas[i] = nota;
            soma += nota;
        }
        // codigo para armazenar a media dos estudantes e mostrar na tela
        double media = (double) soma / numEstudantes;
        System.out.println("A média aritmética das notas é: " + media);

    }
}
