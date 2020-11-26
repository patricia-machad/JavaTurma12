package ExercicioLista2;
import java.util.Scanner; 
/*
**Receber valores de base e altura de um triângulo e verificar 
**se são valores válidos (positivos maiores que zero). 
**Em caso afirmativo, calcular a área do triângulo.
**/
public class Exercicio7 {
	public static void main(String[] args)
	{
						
		Scanner leia = new Scanner(System.in); 
		double base=0.0, altura=0.0, area=0.0; 
		System.out.print("Digite a base:"); 
		base = leia.nextDouble(); 
		System.out.print("Digite a altura: "); 
		altura = leia.nextDouble(); 
				
				//usando tenario
		System.out.println( (base > 0 && altura > 0 )? "A area do triangulo é "+((base * altura)/2):"Vc não digitou valores validos!!!" );
				
				//usando if normal
		if (base > 0 && altura > 0 )
		{
		System.out.printf("A area do triangulo é %.2f", ((base * altura)/2));
		}
		else
		{
		System.out.println("Vc não digitou valores validos!!!");
		}
					
		
	}

}
