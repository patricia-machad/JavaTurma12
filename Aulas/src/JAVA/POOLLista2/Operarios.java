package POOLista2;

public class Operarios extends Pessoa {
	
	private double valorProducao;
	private double comissao;
	
	public Operarios(String nome) {
		this.nome = nome;
	}

	public Operarios(double valorProducao, double comissao) {
		super();
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}
	public double getValorProducao() {
		return valorProducao;
	}
	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	public double vencimentoBase() {
		return (valorProducao * comissao)/100;
	}
}
