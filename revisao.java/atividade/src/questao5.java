import java.util.Scanner;

public class questao5 {
    
 public static void main(String[] args) {
    Scanner Frenda = new Scanner(System.in);

   //  digitar o número de familias
   System.out.println("Digite o número de familias: ");
   int numeroFamilias = Frenda.nextInt();
    Frenda.nextLine(); // Consumir a quebra de linha após o número de familias

   //  declarando variáveis
   double somaRenda = 0;
   int somaFilhos = 0;
   double maiorSalario = 0;
   int contadorRendaMenor200 = 0;
 
   // algoritmo para contar e mostrar o numero da ordem das familias
   for(int i=1; i<= numeroFamilias; i++) {
      System.out.println("\nFamilia " + i);

      // digitar o numero da renda das familias
      System.out.println("Digite a renda da familia: ");
       double renda = Frenda.nextDouble();
       Frenda.nextLine(); // Consumir a quebra de linha após a renda   

      //  codigo para calcular a renda da familia
       somaRenda += renda;

     if(renda > maiorSalario) {
        maiorSalario = renda;
    }  
      //  digitar o numero de filhos 
       System.out.println("Digite o número de filhos: ");
       int filhos = Frenda.nextInt();
       Frenda.nextLine(); // Consumir a quebra de linha após números de filhos 

      //  codigo para calcular o numero de filhos
        somaFilhos += filhos;
       if(renda<200){
        contadorRendaMenor200++;

  }
 }
   // calculo das medias
   double rendaMedia = somaRenda / numeroFamilias;
   double mediaFilhos = (double) somaFilhos / numeroFamilias;
   double percentualRendaMenor200 = (double) contadorRendaMenor200 / numeroFamilias*100;

   // output do resultado do calculo
   System.out.println("\nResultados da pesquisa: ");
   System.out.println("Renda média da população: R$" +rendaMedia);
   System.out.println("Média do número de filhos: "+ mediaFilhos);
   System.out.println("Maior salário dos habitantes: R$" + maiorSalario);
   System.out.println("Percental de habitantes com renda menor que R$ 200,00: " + percentualRendaMenor200 + "%");
 }
}
