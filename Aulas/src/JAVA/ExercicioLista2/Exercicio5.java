package ExercicioLista2;
import java.util.Scanner;
/**A Secretaria de Meio Ambiente que controla o índice de poluição
  *mantém 3 grupos de indústrias que são altamente poluentes do meio ambiente.
  *O índice de poluição aceitável varia de 0,05 até 0,25. 
  *Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a suspenderem
  *suas atividades, se o índice crescer para 0,4 as industrias do 1º e 2º grupo são 
  *intimadas a suspenderem suas atividades, se o índice atingir 0,5 todos os grupos devem ser
  *notificados a paralisarem suas atividades. Faça um sistema que leia o índice de poluição 
  *medido e emita a notificação adequada aos diferentes grupos de empresas.
**/
public class Exercicio5 {
	public static void main(String[] args) 
	{
		
		double indice;
		
		Scanner leia = new Scanner(System.in);
		System.out.print("DIGITE O ÍNDICE DE POLUIÇÃO: ");
		indice = leia.nextDouble();
		
		if (indice>0.05 && indice<= 0.25) 
		{
			System.out.printf("DENTRO DO PERMITIDO!");
		}
		else if (indice == 0.3) 
		{
			System.out.printf("GRUPO1, SUSPENDAM SUAS ATIVIDADES!");
		}
		else if (indice <= 0.4) 
		{
			System.out.printf("GRUPO1 e GRUPO2, SUSPENDAM SUAS ATIVIDADES!");
		}
		else  
		{
			System.out.printf("TODOS OS GRUPOS, SUSPENDAM SUAS ATIVIDADES!");
	    }
		
	}
	
}
