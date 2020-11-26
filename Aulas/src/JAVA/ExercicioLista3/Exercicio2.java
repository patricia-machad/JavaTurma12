package ExercicioLista3;
import java.util.Scanner;
/*Obtenha um número digitado pelo usuário e repita a operação 
**e multiplicar ele por três  (imprimindo o novo valor) até que 
**ele seja maior do que 100. Ex.: se o usuário digita 5,  
**deveremos observar na tela a seguinte sequência: 5 15 45 135.
*/             //EXERCICIO.ENQUANTO.2
public class Exercicio2 {
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);

		int numero;
		int numeroNovo;
		
		System.out.println("Digite um numero: ");
		numero = leia.nextInt();

		numeroNovo = numero;
		while(numeroNovo <=100)
		{
			if(numero == numeroNovo)
			{
				System.out.println(numeroNovo );
			}
			numeroNovo = (numeroNovo*3);
			System.out.println( numeroNovo);
		}
	}

}
