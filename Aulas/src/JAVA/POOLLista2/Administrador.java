package POOLista2;


public class Administrador extends Pessoa {
		
		private double ajudaDeCusto;
		
		public Administrador(String nome) {
			this.nome = nome;
			
		}

		public double getAjudaDeCusto() {
			return ajudaDeCusto;
		}
		public void setAjudaDeCusto(double ajudaDeCusto){
			this.ajudaDeCusto = ajudaDeCusto;
		}
}

