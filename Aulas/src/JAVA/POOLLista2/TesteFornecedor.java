package POOLista2;

import java.util.Scanner;

public class TesteFornecedor extends Pessoa {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		
		Fornecedor fornecedor1 = new Fornecedor("PATRICIA");
		
		System.out.println("DIGITE SEU TELEFONE: ");
		fornecedor1.setTelefone(leia.next());
		
		System.out.println("DIGITE O VALOR DO CREDITO: ");
		fornecedor1.setValorCredito(leia.nextDouble());
		
		System.out.println("DIGITE O VALOR DA DIVIDA: ");
		fornecedor1.setValorDivida(leia.nextDouble());
		
		System.out.println("VALOR DIVIDA DA " + fornecedor1.getNome());
		
		
		System.out.println(fornecedor1.obterSaldo());	
		
	}

}
