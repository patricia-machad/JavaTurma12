package ExercicioLista2;
import java.util.Scanner;
/*Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
	*Infantil A = 5 a 7 anos
	*Infantil B = 8 a 11 anos
	*Juvenil A = 12 a 13 anos
	*uvenil B = 14 a 17 anos
	*Adultos = Maiores de 18 anos
*/
public class Exercicio6 {
	public static void main(String[] args) 
	{
		
		int idade;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("DIGITE A IDADE DO NADADOR: ");
		idade = leia.nextInt();
		
		if (idade <5) 
		{
	    System.out.println("DESCULPE, NÃO ATENDEMOS ESTA IDADE");	
	    }
		else if (idade>=5 && idade <=7)
		{
	    System.out.println("INFANTIL A");
	    }
		else if (idade >=8 && idade <=11)
		{
		System.out.println("INFANTIL B");
		}
		else if (idade >=12 && idade <=13)
		{
		System.out.println("JUVENIL A");
	    }
		else if(idade >=14 && idade <=17)
		{
	    System.out.println("JUVENIL B");
	    }
		else
		{
	    System.out.println("ADULTOS");
	    }
	}

}
