package entities;

public abstract class Funcionario {
		private String nome;
		private String sobreNome;
		private String numeroSeguroSocial;
		
		public Funcionario() {
			// TODO Auto-generated constructor stub
		}

		public Funcionario(String nome, String sobreNome, String numeroSeguroSocial) {
		    
			this.nome = nome;
			this.sobreNome = sobreNome;
			this.numeroSeguroSocial = numeroSeguroSocial;
		}
		
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getSobreNome() {
			return sobreNome;
		}

		public void setSobreNome(String sobreNome) {
			this.sobreNome = sobreNome;
		}

		public String getNumeroSeguroSocial() {
			return numeroSeguroSocial;
		}

		public void setNumeroSeguroSocial(String numeroSeguroSocial) {
			this.numeroSeguroSocial = numeroSeguroSocial;
		}
		
		public String toString() {
			return (getNome() + getSobreNome() + getNumeroSeguroSocial());
		}
		public abstract double ganhos();
}
