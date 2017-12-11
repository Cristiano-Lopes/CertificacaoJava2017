package br.com.cursoj.javaBasico;

public class Funcionario {
	String nome;
	int idade;
	int cpf;

	Funcionario(String nome, int idade, int cpf) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}

	protected Funcionario(String novoNome) {
		this.nome = novoNome;
		this.idade = 26;
		this.cpf = 1234567;
	}

}
