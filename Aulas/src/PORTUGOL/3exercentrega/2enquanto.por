programa
{/*
	Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por três  
	(imprimindo o novo valor) até que ele seja maior do que 100. 
	Ex.: se o usuário digita 5,  deveremos observar na tela a seguinte sequência: 5 15 45 135.
	*/
   
	
	funcao inicio()
	{
		inteiro numero
		inteiro numeroNovo

		escreva("Digite um numero: ")
		leia(numero)

		numeroNovo = numero
		enquanto(numeroNovo <=100)
		{
			se(numero == numeroNovo)
			{
				escreva(numeroNovo, " ")
			}
			numeroNovo = numeroNovo*3
			escreva(numeroNovo, " ")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 397; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */