package br.com.cursoj.javaBasico;

public class Calculo implements ValorDePI,Soma {
	
	double soma;

	public static void main(String[] args) {
		Calculo c = new Calculo();
		c.exibeValorDePI();
		c.exibeSoma(5, 10);
		
	}

	@Override
	public void exibeValorDePI() {
		System.out.println(ValorDePI.PI);

	}

	@Override
	public void exibeSoma(double num1, double num2) {
		this.soma = num1 + num2;
		System.out.println(this.soma);
	}

}
