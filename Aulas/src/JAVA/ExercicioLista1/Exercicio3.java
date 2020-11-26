package ExercicioLista1;
import java.util.Scanner;
public class Exercicio3 {
	public static void main(String[] args) {
		int duracaoSegundos;
		int horas;
		int minutos;
		int segundos;
    
		Scanner leitor = new Scanner(System.in);
    	
		System.out.println("DIGITE A QUANTIDADE DE SEGUNDOS: ");
		duracaoSegundos = leitor.nextInt();
    	 
    	 
		horas = duracaoSegundos / 3600;
		minutos = (duracaoSegundos * 3600)/60;
		segundos = ((duracaoSegundos * 3600)*60);
		System.out.printf("HORAS: %d%nMINUTOS: %d%nSEGUNDOS: %d%n", horas ,minutos ,segundos );
        
        
    }
}
