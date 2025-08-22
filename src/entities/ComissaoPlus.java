package entities;

public class ComissaoPlus extends ComissaoFuncionario{
	private double salarioBase;
	public ComissaoPlus() {
		// TODO Auto-generated constructor stub
	}
	
	public ComissaoPlus(String primeiro,String segundo,String cpf,double salario,double vendas,double taxas) {
		super(primeiro,segundo,cpf,vendas,taxas);
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
		return  "Salário-base: " + super.toString() +
		           "\nSalario Base: " + getSalarioBase();
	}
}
