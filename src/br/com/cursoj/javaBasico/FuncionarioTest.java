package br.com.cursoj.javaBasico;

public class FuncionarioTest {

	public static void main(String[] args) {
		Funcionario mark = new Funcionario("Cristiano", 26, 03740);

		Funcionario murilo = new Funcionario("Murilo", 23, 12345678);

		Funcionario thais = new Funcionario("Thaís");

		System.out.println(thais.nome);
		System.out.println(thais.idade);
		System.out.println(thais.cpf);
	}

}
