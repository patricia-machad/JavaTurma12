package POOLista2;

import java.util.Scanner;

public class TesteEmpregado extends Pessoa {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		Empregado empregado1 = new Empregado("PATRICIA");
		
		System.out.println("DIGITE O NOME DO OPERARIO");
		empregado1.setNome(leia.next());
		
		System.out.println("DIGITE O VALOR DO SALARIO: ");
		empregado1.setSalarioBase(leia.nextDouble());
		
		System.out.println("VALOR DO SALARIO DA " + empregado1.getNome());
		System.out.println(empregado1.calcularSalario());
		
		

	}
}