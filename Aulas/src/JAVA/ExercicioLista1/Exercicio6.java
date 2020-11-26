package ExercicioLista1;
import java.util.Scanner;
public class Exercicio6 {
	 public static void main(String[] args){
			
		    double x1, x2;
		    double y1, y2;
		    double d, d1;
		    	
			Scanner leia = new Scanner(System.in);
			
			System.out.println("Digite o valor de x1:");
			x1 = leia.nextDouble();
			System.out.println("Digite o valor de x2:");
			x2 = leia.nextDouble();
			System.out.println("Digite o valor de y1:");
			y1 = leia.nextDouble();
			System.out.println("Digite o valor de y2:");
			y2 = leia.nextDouble();
			
			d1=((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
			System.out.printf("O VALOR DE P1 E P2 é: %f", d1);
			}
}
