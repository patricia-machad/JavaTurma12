package ExercicioLista1;
import java.util.Scanner;
public class Exercicio5 {
	 public static void main (String[] args) {
			float N1, N2, N3; 
			float MEDIA;
			
			Scanner leitor = new Scanner(System.in);
			
			System.out.println("DIGITE A NOTA 1: ");
			N1 =  leitor.nextInt();
			System.out.println("DIGITE A NOTA 2: ");
			N2 =  leitor.nextInt();
			System.out.println("DIGITE A NOTA 3: ");
			N3 =  leitor.nextInt();
			
			MEDIA = ((N1*2) + (N2*3) + (N3*5))/10;
			System.out.printf(" A media Ponderada é "+ MEDIA);	
			
		}
		
		
}
