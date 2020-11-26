programa
{
	
	funcao inicio()
	{
		/*OBJETIVO DO PROGRAMA
		 * Faça um sistema que leia o tempo de duração de um evento 
		 * em uma fábrica expressa em segundos e mostre-o expresso em horas, 
		 * minutos e segundos.
		 
		 OLHAR GRANDEZAS
		 MENOR VALOR - 1 SEGUNGO
		 1 MINUTO - 60 SEGUNDOS
		 1 HORA - 60 MINUTOS - 3600 SEGUNDOS
         
         */
         //declaro as variaveis 
         inteiro duracaoSegundos
         inteiro horas
         inteiro minutos, segundos
        
         
         //entrada
         escreva("Tempo de duração do evento em segundos:")
         leia(duracaoSegundos)

         //processamentos
         horas = duracaoSegundos / 3600
         minutos = (duracaoSegundos % 3600)/60
         segundos = ((duracaoSegundos % 3600)%60)
         escreva("-----------------")
         escreva("\nHoras: "+horas)
         escreva("\nMinutos: "+minutos)
         escreva("\nSegundos: "+segundos)

         
         
         
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 634; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */