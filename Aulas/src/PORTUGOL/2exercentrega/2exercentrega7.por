programa
{    /*Receber valores de base e altura de um triângulo e verificar se são valores válidos 
	(positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.
	*/
	//variavel
	
	 funcao inicio()
	{
		
	inteiro b
	inteiro a
	inteiro areaTriangulo
	
	//entrada
	escreva("Digite o valor da base do triângulo: ")
	leia(b)
	escreva("Digite o valor da altura do triângulo: ")
	leia(a)

	areaTriangulo = ((b*a)/2)
	
      se (b>0)
     {
     	escreva("a área do triangulo é ", areaTriangulo)
     }
     
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 521; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */