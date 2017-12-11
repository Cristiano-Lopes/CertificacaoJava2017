package br.com.cursoj.javaBasico;

public class FabricaTest {

	public static void main(String[] args) {
		Fabrica mark = new Fabrica();
		mark.fabricarCarro();
		mark.fabricarCarro();
		mark.fabricarCarro();
		System.out.println("O funcionário mark fabricou " + mark.carro);
		
		Fabrica lucio = new Fabrica();
		lucio.fabricarCarro();
		lucio.fabricarCarro();
		System.out.println("O funcionario lucio fabricou "+lucio.carro);
		
		
		
		System.out.println("O total de Carros fabricados é: "+Fabrica.totalDeCarros);

	}

}
