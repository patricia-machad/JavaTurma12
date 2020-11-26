package Revisao;
import java.util.Scanner;

public class Exercicio4 {
public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double x = 1.0;
		double y;
		double div = 0.0;
		double soma = 0.0;
		
		for (y=1.0; y<=50; y++) {
			div = x/y;
			soma = soma + div;
			
			x = x + 2;
			System.out.println("A SOMA DO TOTAL É: "+ soma + "\n");
			
		}
		
	}
}
