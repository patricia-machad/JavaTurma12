package Desafios;
import java.util.Scanner;
public class Paulistinha {
	public static void main(String[]args) {

		Scanner leia = new Scanner(System.in);
		String times[] = {"CORINTHIANS", "PALMEIRAS", "SANTOS", "SPFC"};
		int pontos[][] = new int[4][4];
		int linha=0, coluna=0;
		int x=0;
		char opcao;
		int soma[]=new int [4];
		
		System.out.println("NOME DO TIME");
		System.out.println("------------");
		for (x=0; x<4; x++)
		{
			System.out.println(times[x]);
		}
		
		for(coluna=0; coluna<4; coluna++)
		{
			
			System.out.println("RODADA "+(coluna+1));
			
			for (linha=0; linha<4; linha++) 
			{
				System.out.print(times[linha]);
				System.out.print(" G-ganhou, E-empatou ou P-perdeu: ");
				opcao = leia.next().toUpperCase().charAt(0);
				if (opcao=='G') {
					pontos[linha][coluna]=3;
				} else if (opcao=='E') {
					pontos[linha][coluna]=1;
				} else if (opcao=='P') {
					pontos[linha][coluna]=0;
				} else {
					System.out.println("VC N�O ESCOLHEU DIREITO, PERDEU");
					pontos[linha][coluna]=0;
				}
				
				soma[linha]=soma[linha] + pontos[linha][coluna];
			}
			
			}
		for(linha=0;linha<4;linha++) {
			System.out.printf("%s:%d\t", times[linha], soma[linha]);
			
		}
		
		
		}
}