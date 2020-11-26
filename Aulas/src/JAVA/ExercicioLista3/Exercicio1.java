package ExercicioLista3;
import java.util.Scanner;
/*Desenvolver um sistema que efetue a soma de todos os números ímpares 
 **que são  múltiplos de três e que se encontram no conjunto dos números de 1 até 500.
 */
  			//EXERCICIO.PARA.2
public class Exercicio1 {
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		int numero = 0;
		int somaMult = (numero + (numero*3));
		
		for (numero=1; numero<=500;numero++)	
		{
		if (numero%2==1) 
			{
				System.out.printf("NUMERO IMPAR: %s\n", numero);
				somaMult=numero*3;
				System.out.printf("A SOMA DOS VALORES SÃO: %s\n", somaMult);
		    }
		      
	
		}
	}
	
}
