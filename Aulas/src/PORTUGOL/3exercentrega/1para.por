programa
{
	
	funcao inicio()
	{
		real salario=0.0, mediaSalarios=0.0, maiorSalario=0.0, totalSalario=0.0
		 inteiro filhos=0, totalFilhos=0
		 real mediaFilhos=0.0
		 inteiro x=0;
		 inteiro QUANTIDADE = 0
		 inteiro menor100 = 0
		 real porcentagem
		 escreva("Digite a quantidade de entrevistados agora:")
		 leia(QUANTIDADE)
		
		 para (x =1 ; x <=QUANTIDADE; x++)
		 {
		 	escreva("Digite o salario do entrevistado: ")
		 	leia(salario)
		 	se (salario <100)
		 	{
		 		menor100 = menor100+1	
		 	}
		 	totalSalario = totalSalario + salario
		 	escreva("Digite o numero de filhos:")
		 	leia(filhos)
		 	
		 	totalFilhos = totalFilhos+filhos
		 	se (maiorSalario < salario)
		 	{
		 		maiorSalario = salario
		 	}
		 	
		 }
		 escreva("\nQUANTIDADE DE ENTREVISTADOS: ", QUANTIDADE)
		 mediaSalarios=totalSalario / QUANTIDADE
		 mediaFilhos = totalFilhos / QUANTIDADE
		 porcentagem = ((menor100 *100) / QUANTIDADE)
		 escreva("\nMedia de salarios: ", mediaSalarios)
		 escreva("\nTotal de filhos :", totalFilhos)
		 escreva("\nMedia de filhos :", mediaFilhos)
		 escreva("\nMaior Salario: ", maiorSalario)
		 escreva("\nPessoas que recebem menos que 100: ", porcentagem"%")
		 )
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 744; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */