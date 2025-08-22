package application;

import entities.ComissaoFuncionario;
import entities.ComissaoPlus;
import entities.Funcionario;
import entities.FuncionarioAssalariado;
import entities.FuncionarioPorHora;
import entities.TrabalhadorPorPeca;

public class Main {
public static void main(String[] args) {	
	
	 FuncionarioAssalariado funcionarioAssalariado = new FuncionarioAssalariado("JOAO ", "VICTOR "," 999.000.747-77 ", 800.00);
	 FuncionarioPorHora funcionarioPorHora = new FuncionarioPorHora("Bruna ","Fernanda"," 020.888.777-72 ", 45.00, 6);
	 ComissaoFuncionario comissaoFuncionario = new ComissaoFuncionario("Ozimar ","De Souza"," 777.900.888-89", 1000.0, .06);
	 ComissaoPlus comissaoPlus = new ComissaoPlus("Lennon ", "De Souza", " 880.098.747-20", 20.000, 1000.0,.04);
	 TrabalhadorPorPeca trabalhadorPorPeca = new TrabalhadorPorPeca("Joao ","Lenon","197.907.507-73",1000.0,10);
	 
	 
	 System.out.println("Funcionários Processados Individualmente:\n");
	 System.out.println(funcionarioAssalariado);
	 System.out.println("Ganhos: " + funcionarioAssalariado.ganhos());
	 
	 System.out.println(funcionarioPorHora);
	 System.out.println("Ganhos: " + funcionarioPorHora.ganhos());

	 
	 System.out.println(comissaoFuncionario);
	 System.out.println("Ganhos: " + comissaoFuncionario.ganhos());

	 System.out.println(comissaoPlus);
	 System.out.println("Ganhos: " + comissaoPlus.ganhos());
	 
	 Funcionario [] funcionarios = new Funcionario [5];
	 funcionarios[0] = funcionarioAssalariado;
	 funcionarios[1] = funcionarioPorHora;
	 funcionarios[2] = comissaoFuncionario;
	 funcionarios[3] = comissaoPlus;
	 funcionarios[4] = trabalhadorPorPeca;
 	 
	 System.out.println("Funcionários Processados com polimorfismo \n");
	 
	 for(Funcionario func : funcionarios) {
		 System.out.println(func);
		 if(func instanceof ComissaoPlus) {
			 ComissaoPlus funcionario = (ComissaoPlus) func;
			 funcionario.setSalarioBase(1.10 * funcionario.getSalarioBase());
			 System.out.println("Nova base salarial: " + funcionario.getSalarioBase());
		 }
		 System.out.println("Ganhos: " + func.ganhos());
	 }
		  
	 for (int j = 0; j < funcionarios.length; j++) {
		    System.out.printf("Funcionário %d é um %s\n",
		            j,
		            funcionarios[j].getClass().getSimpleName());
		}

	 
	}
}
