💼 Sistema de Folha de Pagamento em Java

Este projeto implementa um sistema de folha de pagamento para diferentes tipos de funcionários, utilizando Programação Orientada a Objetos (POO) em Java.

O sistema demonstra conceitos importantes como herança, polimorfismo, sobrescrita de métodos e uso de arrays de objetos.

🚀 Funcionalidades

Cadastro e processamento de diferentes tipos de funcionários:

Funcionário Assalariado (salário fixo semanal)

Funcionário por Hora (horas normais e horas extras)

Funcionário com Comissão (salário baseado em vendas e taxa de comissão)

Funcionário com Comissão Plus (salário base + comissão)

Trabalhador por Peça (pagamento por unidade produzida)

Exibição individual dos funcionários e seus ganhos.

Processamento polimórfico de todos os funcionários armazenados em um array.

Atualização de salários base para funcionários com comissão plus.

Identificação do tipo de cada funcionário com getClass().getSimpleName().

📂 Estrutura das Classes

Funcionario (abstrata)

Atributos: primeiroNome, segundoNome, numeroSeguroSocial

Método abstrato: ganhos()

Métodos: getters/setters e toString()

FuncionarioAssalariado (extends Funcionario)

Atributo: salarioSemanal

Método ganhos() retorna o salário fixo.

FuncionarioPorHora (extends Funcionario)

Atributos: remuneracao, horas

Método ganhos() calcula pagamento normal e horas extras.

ComissaoFuncionario (extends Funcionario)

Atributos: vendasBrutas, taxaDeComissao

Método ganhos() retorna comissão com base nas vendas.

ComissaoPlus (extends ComissaoFuncionario)

Atributo: salarioBase

Método ganhos() combina salário base com comissão.

TrabalhadorPorPeca (extends Funcionario)

Atributos: salarioPorPeca, pecas

Método ganhos() calcula salário pelo número de peças produzidas.

🛠️ Tecnologias Utilizadas

Java 17+

POO (Herança e Polimorfismo)
