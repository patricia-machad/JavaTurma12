package ExercicioLista4;
import java.util.Scanner;
/*Faça um programa que crie um vetor por leitura com 5 valores 
 *de pontuação de uma atividade e o escreva em seguida. 
 *Encontre após a maior pontuação e a apresente.
 */
public class Exercicio1 {
public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double ponto;
		double valorM = 0;
		
		
		for(int x = 0; x<5; x++) 
		{
			System.out.println("DIGITE UM NUMERO:  ");
			leia.next();
			if (x>valorM) 
			{
			valorM = x;
			}
		}System.out.printf("A MAIOR PONTUAÇÃO FOI: "+ valorM);

	}
}
