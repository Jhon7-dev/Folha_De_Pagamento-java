package application;

import entities.Funcionario;
import entities.FuncionarioAssalariado;

public class Main {
public static void main(String[] args) {	
	
	FuncionarioAssalariado func = new FuncionarioAssalariado();
	func.setNome("joao");
	func.setSobreNome("gomes");
	func.toString();
	
	}
}
