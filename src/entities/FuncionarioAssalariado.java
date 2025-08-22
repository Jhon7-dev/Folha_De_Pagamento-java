package entities;

public class FuncionarioAssalariado extends Funcionario{
	
	
	private double salarioSemanal;
	
	public FuncionarioAssalariado() {
		// TODO Auto-generated constructor stub
	}
	
	public FuncionarioAssalariado(double salarioSemanal) {
		super();
		this.salarioSemanal = salarioSemanal;
	}



	public double getSalarioSemanal() {
		return salarioSemanal;
	}



	public void setSalarioSemanal(double salario) {
		if(salario < 0.0) {
			this.salarioSemanal = 0.0;
		}else {
			this.salarioSemanal = salario;
		}
	}



	@Override
	public double ganhos() {
		// TODO Auto-generated method stub
		return getSalarioSemanal();
	}
	
	

	@Override
	public String toString() {
		return String.format("Salario do fucionário:%s\n%s: $%,2f", super.toString(),"Salário semanal", getSalarioSemanal());
	}
	
		
		
}
