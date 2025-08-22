package entities;

public class FuncionarioPorHora  extends Funcionario{
	private double remuneracao;
	private double horas;
	
	public FuncionarioPorHora() {
		// TODO Auto-generated constructor stub
	}
	
	 
	public FuncionarioPorHora(String primeiro,String segundo,String cpf,double remuneracaoPorHora, double horasTrabalhadas) {
		super(primeiro,segundo,cpf);
		setRemuneracao(remuneracaoPorHora);
		setHoras(horasTrabalhadas);
	}


	public double getHoras() {
		return horas;
	}


	public void setHoras(double horasTrabalhadas) {
		if (horasTrabalhadas >= 0.0 && horasTrabalhadas <= 168.0) {
		    horas =horasTrabalhadas;
		} else {
		    horas = 0.0;
		}

	}


	public double getRemuneracao() {
		return remuneracao;
	}

	public void setRemuneracao(double remuneracaoPorHora) {
		if(remuneracaoPorHora < 0.0) {
			remuneracao = 0.0;
		}else {
			remuneracao = remuneracaoPorHora;
		}
	}

	@Override
	public double ganhos() {
		// TODO Auto-generated method stub
		if(getHoras()<=40) {;
		return getRemuneracao() * getHoras();
		}else {
			return 40*getRemuneracao() + (getHoras() - 40) * getRemuneracao()*1.5;
		}
	}


	@Override
	public String toString() {
	    return "Funcionário por Hora: " + super.toString() +
	           "\nPagamento por hora: " + getRemuneracao() +
	           "\nHoras trabalhadas: " + getHoras();
	}
}
