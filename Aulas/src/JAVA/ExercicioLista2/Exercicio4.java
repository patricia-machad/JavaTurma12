package ExercicioLista2;
import java.util.Scanner;
/*Faça um sistema que leia um número inteiro e mostre uma mensagem 
	* indicando se este número é par ou ímpar, e se é positivo ou negativo.
	*/
public class Exercicio4 {
	public static void main (String[] args) 
	{
		int numero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("DIGITE UM NUMERO:");
		numero = leia.nextInt();
		if (numero>=0) 
		{
			System.out.println("NUMERO POSITIVO");
		}
		else
		{
			System.out.println("NUMERO NEGATIVO");
		}
			
	}

}
