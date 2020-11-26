package ExercicioLista2;
import java.util.Scanner;

/*Desenvolva um sistema em que:
	*Leia 4 (quatro) números;
*Calcule o quadrado de cada um;
*Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
*Caso contrário, imprima os valores lidos e seus respectivos quadrados.
*/

public class Exercicio3 {
	public static void main(String[] args) 
	   {

		Scanner leia = new Scanner(System.in);
		
		double n1, num1;
		double n2, num2;
		double n3, num3;
		double n4, num4;
		
		System.out.print("DIGITE UM NUMERO, N1:");
		num1 = leia.nextDouble();
		System.out.print("DIGITE UM NUMERO, N2:");
		num2 = leia.nextDouble();
		System.out.print("DIGITE UM NUMERO, N3:");
		num3 = leia.nextDouble();
		System.out.print("DIGITE UM NUMERO, N4:");
		num4 = leia.nextDouble();

		
		n1 = (num1*num1);
		n2 = (num2*num2);
		n3 = (num3*num3);
		n4 = (num4*num4);
		
		if (n3>=1000)
		{
			System.out.printf("FINALIZE");
		}
		else if (n3 <1000)
		{
			System.out.printf("O quadrado de %.2f  é igual %.2f", num1, n1);
			System.out.printf("\nO quadrado de %.2f  é igual %.2f", num2, n2);
			System.out.printf("\nO quadrado de %.2f  é igual %.2f", num3, n3);
			System.out.printf("\nO quadrado de %.2f é igual %.2f", num4, n4);
		}
	   
	   }
	   
}
