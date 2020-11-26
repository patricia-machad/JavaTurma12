package ExercicioLista1;
import java.util.Scanner;
public class Exercicio1 {
	public static void main(String[] args) {
		int anos, meses, dias;
		int idadeDias;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("DIGITE A IDADE EM ANOS: ");
		anos = leitor.nextInt();
		System.out.println("DIGITE A IDADE EM MESES: ");
		meses = leitor.nextInt();
		System.out.println("DIGITE A IDADE EM DIAS: ");
		dias = leitor.nextInt();
		
		idadeDias = anos * 365 + meses * 30 + dias;
		System.out.println("IDADE EM DIAS: " + idadeDias);
		
	}
}
