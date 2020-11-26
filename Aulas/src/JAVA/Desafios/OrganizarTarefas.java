package Desafios;
import java.util.Scanner;
public class OrganizarTarefas {

	public static void main(String[] args) {
	
			Scanner leia = new Scanner (System.in);
			
			
			int dia;
			String diaDaSemana [][]= new String [5][31];
			
			
			
			System.out.println("DIGITE O DIA: ");
			dia = leia.nextInt();
			
			
			for(int x=0; x<5; x++) 
			{
				System.out.println("DIGITE A TAREFA  "+(x+1));
				leia.nextLine();
			  diaDaSemana[x][dia-1]=leia.nextLine();
			  
				
			}
			
			

		}

}


