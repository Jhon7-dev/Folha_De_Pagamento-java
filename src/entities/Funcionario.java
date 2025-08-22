package entities;

public abstract class Funcionario {
		private String primeiroNome;
		private String segundoNome;
		private String numeroSeguroSocial;
		
		public Funcionario() {
			// TODO Auto-generated constructor stub
		}
        
		
		  
		public Funcionario(String primeiro, String segundo, String cpf) {
			super();
			this.primeiroNome = primeiro;
			this.segundoNome = segundo;
			this.numeroSeguroSocial = cpf;
		}
		
		


		public String getPrimeiroNome() {
			return primeiroNome;
		}



		public void setPrimeiroNome(String primeiro) {
			this.primeiroNome = primeiro;
		}



		public String getSegundoNome() {
			return segundoNome;
		}



		public void setSegundoNome(String segundo) {
			this.segundoNome = segundo;
		}

		public String getNumeroSeguroSocial() {
			return numeroSeguroSocial;
		}

		public void setNumeroSeguroSocial(String cpf) {
			this.numeroSeguroSocial = cpf;
		}
		
		public String toString() {
			return "" + getPrimeiroNome() + " " + getSegundoNome() + 
			           "\nNúmero do Seguro Social: " + getNumeroSeguroSocial();
		}
		public abstract double ganhos();
}
