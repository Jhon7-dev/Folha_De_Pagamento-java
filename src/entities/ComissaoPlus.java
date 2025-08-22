package entities;

public class ComissaoPlus extends ComissaoFuncionario{
	private double salarioBase;
	public ComissaoPlus() {
		// TODO Auto-generated constructor stub
	}
	
	public ComissaoPlus(double salario) {
		super();
		setSalarioBase(salario);
	}

	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salario ) {
		if(salario<0.0) {
			salarioBase = 0.0;
		}else {
			salarioBase = salario;
		}
	}
	@Override
	public double ganhos() {
		return getSalarioBase() * super.ganhos();
	}
	@Override
	public String toString() {
		return String.format("%s %s; %s: $%, .2f",
				"Salário-base ", super.toString(),
				"Base salary ", getSalarioBase());
	}
}
