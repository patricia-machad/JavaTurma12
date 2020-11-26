package ExercicioLista2;
import java.util.Scanner;
/**Elabore um sistema que leia as variáveis C e N, 
 *respectivamente código e número de horas trabalhadas de um operário. 
 *E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. 
 *Quando o número de horas exceder a 50 calcule o excesso de pagamento 
 *armazenando-o na variável E, caso contrário zerar tal variável. 
 *A hora excedente de trabalho vale R$ 20,00. 
 *No final do processamento imprimir o salário total e o salário excedente.
**/
public class Exercicio2 {
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
	String C;
	int N = 10;
	int E = 0;
	double salarioTotal, salarioNormal;
	double extra = 20;
	
	//GANHA 10 REAIS A HORA
	//SE AS HORAS PASSAREM DE 50, CALCULAR EXCESSO 
	//HORA EXTRA = 20 REAIS
	
	
	System.out.println("DIGITE O CODIGO DO TRABALHADOR: ");
	C = leia.next();
	System.out.println("DIGITE A QUANTIDADE DE HORAS TRABALHADAS: ");
	N = leia.nextInt();
	
	if (N<=50) 
	{
		salarioNormal = N*10;
		System.out.println("SALARIO NORMAL: "+ salarioNormal);
	}
	else if (N>50) 
	{
		E = (N-50)*20;
		salarioNormal = 50*extra;
		salarioTotal = salarioNormal + E;
		
		System.out.println("SALARIO NORMAL :"+ salarioNormal);
		System.out.println("SALARIO EXCEDENTE: "+ extra);
		System.out.println("SALARIO TOTAL: "+ (salarioNormal + extra));
	
	}
	
	
	}
}
