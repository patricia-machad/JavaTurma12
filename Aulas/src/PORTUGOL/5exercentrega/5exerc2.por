programa
{
	
	funcao inicio()
	    /*Elabore um programa que leia o peso e a altura de um adulto 
	     * e mostre sua condição de acordo com a tabela abaixo.
		*IMC em adultos Condição
		*Abaixo de 18,5 Abaixo do peso
		*Entre 18,5 e 25 Peso normal
		*Entre 25 e 30 Acima do peso	
		*Acima de 30 obeso
		*/

	{
		cadeia nome
		real peso
		real altura
		real IMC
		escreva ("DIGITE SEU NOME: ")
		leia(nome)
		escreva("DIGITE SEU PESO: ")
		leia(peso)
		escreva("DIGITE SUA ALTURA: ")
		leia(altura)
		
		IMC = (peso/(altura*altura))
		se (IMC<18.5)
		{
			escreva(nome,", VOCÊ ESTA ABAIXO DO PESO!")
		}senao se(IMC>18.5 e IMC<25)
		{
			escreva(nome,",  VOCÊ ESTA NO PESO NORMAL!")
		}senao se (IMC>25 e IMC<30)
		{
			escreva(nome,", VOCÊ ESTA ACIMA DO PESO!")
		}se(IMC>30)
		{
			escreva(nome,", VOCÊ ESTA OBESO!")
		}
		
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 337; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */