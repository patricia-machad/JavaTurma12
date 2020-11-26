package Revisao;
import java.util.Scanner;
/*O IMC – Índice de Massa Corporal é um critério da Organização Mundial de Saúde para dar uma indicação sobre a condição de peso de uma pessoa adulta. A fórmula é IMC = peso / ( altura )2
**Elabore um programa que leia o peso e a altura de um adulto e mostre sua condição de acordo com a tabela abaixo.
**IMC em adultos Condição
**Abaixo de 18,5 Abaixo do peso
**Entre 18,5 e 25 Peso normal
**Entre 25 e 30 Acima do peso
**Acima de 30 obeso
*/
public class Exercicio2 {
public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		double peso;
		double altura;
		double IMC;
		
		System.out.println("DIGITE SEU NOME: ");
		nome = leia.nextLine();
		System.out.println("DIGITE SEU PESO: ");
		peso = leia.nextDouble();
		System.out.println("DIGITE SUA ALTURA: ");
		altura = leia.nextDouble();
		
		
		IMC = peso/(altura*altura);
		
		while (IMC > 0 && IMC <18.5 )
		{		
			System.out.println("ABAIXO DO PESO!");	
		}
			
		if (IMC > 18.5 && IMC < 25 ) 
		{
		   System.out.println("PESO NORMAL!");	
		}
		else if (IMC > 25 && IMC < 30 ) 
		{
			   System.out.println("ACIMA DO PESO!");	
		}
		else
		{
			System.out.printf("OBESO!");
		}
	}
}
