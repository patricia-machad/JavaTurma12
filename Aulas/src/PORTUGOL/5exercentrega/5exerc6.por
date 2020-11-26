programa
{
	inclua biblioteca Util //tras a biblioteca util e lá tem o sorteia
	
	funcao inicio()
	{
			/*
			 * Faça um programa que lê um vetor de 3 elementos e uma matriz de 3 x 3
			 * elementos. Em seguida o programa deve fazer a multiplicação do vetor pelas
			 * colunas da matriz.
			 */
			
			//variaveis
			inteiro vetor[3] //vetor tem tamanho - 0 a 2
			inteiro matriz[3][3] //matriz linha e coluna linha 0 a 2 e a coluna de 0 a 2
			inteiro tamanhoVetor=0, linha=0, coluna=0
			
			//entradas - carregar o vetor com dados e a matriz tb
			//carregando o vetor
			escreva("\nVETOR\n")
			para (tamanhoVetor=0; tamanhoVetor <3; tamanhoVetor++)
			{
				vetor[tamanhoVetor] = Util.sorteia(1,3)
				escreva(vetor[tamanhoVetor])
				escreva(" ")
			}
			escreva("\nMATRIZ\n")
			para (linha = 0; linha<3; linha++)//faz a linha
			{
				para (coluna = 0; coluna<3; coluna++) // faz a coluna
				{
					//aqui a magica acontece
					matriz[linha][coluna]=Util.sorteia(1,3)
					escreva(matriz[linha][coluna])
					escreva(" ")//espaço entre os numeros
					
					
				}
				escreva("\n") //aqui acontece o salto de linha
			}
			// mostrando o calculo
			//escreva vetor[tamanhovetor = coluna]*matriz[linha][coluna]
			escreva("\nRESULTADO DA MULTIPLICACAO\n")
			para (linha = 0; linha<3; linha++)
			{
				// faz a coluna
				para (coluna = 0; coluna<3; coluna++)
				{
					//aqui a magica acontece
					escreva(vetor[coluna]*matriz[linha][coluna]) //coluna =1 linha=0
					escreva(" ")//espaço entre os numeros
					
				}
				escreva("\n") //aqui acontece o salto de linha
			}
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 113; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */