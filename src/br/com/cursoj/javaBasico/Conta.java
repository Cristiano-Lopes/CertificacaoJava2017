package br.com.cursoj.javaBasico;

public class Conta {
	String cliente;
	double saldo;

	void exibeSaldo() {
		System.out.println(this.cliente + " Seu Saldo é R$ " + this.saldo);
	}

	void saca(double valor) {
		if (this.saldo > valor) {
			this.saldo -= valor;
			System.out.println(this.cliente + " seu saque foi efetuado com sucesso.");
		} else {
			System.out.println("Você não tem o limite disponivel para o saque");
		}
	}
	
	void deposito(double valor) {		
		this.saldo += valor;
		System.out.println("Seu deposito foi efetuado com sucesso.");
	}

	public static void main(String... args) {
		Conta c1 = new Conta();
		c1.cliente = "Mark";
		c1.saldo = 10000;
		c1.exibeSaldo();
		c1.saca(450);
		c1.exibeSaldo();
		c1.deposito(1500);
		c1.exibeSaldo();
	}

}
