// 3) Escreva um programa que imprima a tabuada (de 1 a 10). O usuário deve digitar o número (de 1 a 10) para o qual deseja ver a tabuada.

import java.util.Scanner;

public class questao3 {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // digite o numero para ver a tabuada
        System.out.print("Digite um número de 1 a 10 para ver a tabuada:");
        int numero = scanner.nextInt();

        // parâmetro para receber apenas numeros de 1 a 10
        if (numero < 1 || numero > 10) {
            // resposta caso se o numero NÃO for de 1 a 10
            System.out.println("Número inválido. Por favor, digite um número de 1 a 10:");
        }else{
            // resposta da tabuada do numero escolhido
            System.out.println("Tabuada do número" +numero+ ".");

            // codigo para calcular a tabuada
            for (int i = 1; i <= 10; i++){
                int resultado = numero * i;
                System.out.println(numero + "x" + i + "=" + resultado);
            }
        }
    }
}