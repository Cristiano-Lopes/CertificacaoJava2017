package br.com.cursoj.javaBasico;

public class Fabrica {
	float carro = 0; // variavel de instancia ou variavel global pertence ao objeto e não a classe
	static float totalDeCarros;//variavel statica ou variavel de classe pertence a classe 

	void fabricarCarro() {
		// float carro // variavel Local
		carro++;
		totalDeCarros++;
	}

}
