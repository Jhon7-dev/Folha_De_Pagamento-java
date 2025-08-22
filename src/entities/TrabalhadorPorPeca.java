package entities;

public class TrabalhadorPorPeca extends Funcionario {
		private double salarioPorPeca;
		private int pecas;
		 
		public TrabalhadorPorPeca() {
			// TODO Auto-generated constructor stub
		}
		public TrabalhadorPorPeca(String primeiro, String segundo, String cpf,double lucro,int peca  ) {
			super(primeiro,segundo,cpf);
			setSalarioPorPeca(lucro);
			this.pecas = peca;
			 
		}
		
		public double getSalarioPorPeca() {
			return salarioPorPeca;
		}
		public void setSalarioPorPeca(double lucro) {
			if(lucro<0.0) {
				salarioPorPeca = 0.0;
			}else {
				salarioPorPeca = lucro;
			}
		}
		public int getPecas() {
			return pecas;
		}
		public void setPecas(int peca) {
			if(peca<0.0) {
				peca = 0;
			}else {
				pecas = peca;
				 			}
		}
		@Override
		public double ganhos() {
			// TODO Auto-generated method stub
			return getSalarioPorPeca() * getPecas();
		}
		@Override
		public String toString() {
			
		  return "Trabalhador por Peça:" + super.toString() + 
				  "\n Peças vendidas : " + getPecas() +
				  "\n Salário Por Peças: " + getSalarioPorPeca();
				   
		}
}
