programa
{
	
	
	      funcao inicio()
	{    
		//variavel
		
		real n1, num1
		real n2, num2
		real n3, num3
		real n4, num4
		
		//entrada
		escreva("Digite quatro numeros\n")
		leia(num1)
		leia(num2)
		leia(num3)
		leia(num4)

		n1 = (num1*num1)
		n2 = (num2*num2)
		n3 = (num3*num3)
		n4 = (num4*num4)

		se (n3 >=100)
		{
			escreva ("FINALIZE")	
		}
		senao se (n3 <100)
          {
          	escreva("O quadrado de ", num1, " é igual ", n1)
          	escreva("\nO quadrado de ", num2, " é igual ", n2)
          	escreva("\nO quadrado de ", num3, " é igual ", n3)
          	escreva("\nO quadrado de ", num4, "é igual ", n4)
          }
          
	
		}
		
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 108; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */