package POOLista2;

public class Vendedor extends Pessoa {
private double valorVendas;
private double comissao;


public Vendedor(String nome) {
	this.nome = nome;
	
}
public Vendedor(double valorVendas, double comissao) {
	
	this.valorVendas = valorVendas;
	this.comissao = comissao;
}
public double getValorVendas() {
	return valorVendas;
}
public void setValorVendas(double valorVendas) {
	this.valorVendas = valorVendas;
}
public double getComissao() {
	return comissao;
}
public void setComissao(double comissao) {
	this.comissao = comissao;
}



}
