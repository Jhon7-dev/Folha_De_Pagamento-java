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



	public void setSalarioSemanal(double salarioSemanal) {
		this.salarioSemanal = salarioSemanal;
	}



	@Override
	public double ganhos() {
		// TODO Auto-generated method stub
		return 0;
	}
		
		
}
