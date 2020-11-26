package Entidades;

public class Produto {
	public String nome;
	public double medida;
	public int quantidade;
	public double valorUnitario;
	
	
		public Produto() {
		
		}
		public Produto(String nome) {
		this.nome = nome;
		}
		
		public Produto(String nome, double medida, int quantidade, double valorUnitario) {
		
			this.nome = nome;
			this.medida = medida;
			this.quantidade = quantidade;
			this.valorUnitario = valorUnitario;
	}
}
