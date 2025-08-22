package entities;

public class FuncionarioAssalariado extends Funcionario{
	
	
	private double salarioSemanal;
	
	public FuncionarioAssalariado() {
		// TODO Auto-generated constructor stub
	}
	
	public FuncionarioAssalariado(String primeiro,String segundo,String cpf,double salario ) {
		super(primeiro,segundo,cpf);
		setSalarioSemanal(salario);
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

		return getSalarioSemanal();
	}
	
	@Override
	public String toString() {
		  return "Funcionário Assalariado: " + super.toString() +
		           "\nSalário semanal: " + getSalarioSemanal();
		}

	}
	
		
		
 