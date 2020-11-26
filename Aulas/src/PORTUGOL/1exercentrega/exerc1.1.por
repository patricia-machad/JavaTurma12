programa
{
	
	funcao inicio()
	{
		
real:dia 
real mes
real mesDias
real ano
real anoDias
real idade
real idadeDias

  escreva ("Digite o DIA do seu nascimento\n")
  leia (dia)
  escreva ("Digite o MÊS do seu nascimento\n")
  leia (mes)
  escreva ("Digite o ANO de seu nascimento\n")
  leia (ano)
  
  idade = (2020 - ano)
  mesDias= (mes * 30)
  anoDias = (idade * 365)
  idadeDias= (dia + mes + anoDias)
  escreva("---------------\n")
  escreva ("Sua idade em dias é:", idadeDias, " dias")    

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 296; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */