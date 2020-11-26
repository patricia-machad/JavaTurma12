package ExercicioLista1;
import java.util.Scanner;
public class Exercicio2 {
	 public static void main(String[] args){
			int anos, meses, dias, quant;
			
			Scanner leia= new Scanner(System.in);
			
			System.out.print("DIGITE A QUANTIDADE DE DIAS: ");
			quant = leia.nextInt();
			System.out.println();
			anos = quant/365; 
			meses =(quant % 365)/ 30;
			dias =(quant % 365)% 30;
			System.out.printf("\n %d ano(s) %d mese(s) e %d dia(s) ", anos, meses , dias);
		}
}
