package POOLista1;

public class ProdutoEletronico {
	public static String nomedoproduto;
	public static int numeroprotocolo;
	public static String defeito;
	public static double valorapagar;

	public void objetoprodutoeletronico ( String nomedoproduto, String defeito) {
		this.nomedoproduto = nomedoproduto;
		this.defeito = defeito;
		
	}
	public void objetoprodutoeletronico (int numeroprotocolo ) {
		
		this.numeroprotocolo = numeroprotocolo;
	}
	public void objetoprodutoeletronico (double valorapagar ) {
		this.valorapagar = valorapagar;
	}

}
