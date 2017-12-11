package br.com.cursoj.javaBasico;

import javax.swing.JOptionPane;

public class Curso {
	static float n1, n2;
	static float media;

	static void insiraNota() {
		n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota:"));
		n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a Segunda nota:"));
	}

	static void calculaMedia() {
		media = (n1 + n2) / 2;
	}

	static void exibeMedia() {
		JOptionPane.showMessageDialog(null, "A média é: " + media);
	}

}
