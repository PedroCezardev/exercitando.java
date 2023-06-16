// 4) Faça um programa que solicita ao usuário um número inteiro positivo e, em seguida, calcula e exibir o fatorial do número digitado.

import java.util.Scanner;

public class questao4 {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new  Scanner(System.in);
        
        // digitar o valor positivo
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        // caso o usuário digitar o valor negativo
        if(numero < 0) {
            System.out.println("Número inválido. Por favor, digite um número positivo");
            
            }else{
                long fatorial = calcFatorial(numero); 

                // calcula o fatorial do numero digitado
                System.out.println("O fatorial de " +numero+ " é: " + fatorial);
                }

                }

                public static long calcFatorial (int numero){

                    // se o número digitado for 0 ou 1 vai ser devolvido o valor imediatamente pois o fatorial dos dois numeros é 1
                    if (numero == 0 || numero == 1) {
                        return 1;
                    }

                    // vai multiplicar o valor guardado no i
                    else {
                        long resultado = 1;
                        for ( int i = 1; i <= numero; i++) {
                            resultado *= i;
                        }

                        return resultado;
                    }
                    
                }
            }
            
        

