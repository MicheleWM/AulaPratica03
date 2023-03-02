package br.com.descomplica.live03;

import javax.swing.JOptionPane;

public class Exemplo01 {

	public static void main(String[] args) {
		int [] num = new int [10];
		int contPos = 0, contNeg = 0, contNulo = 0;
		//entrada de dados e processamento:
//		for (int i= 0; i < num.length; i ++) {
		for (int i= 0; i < 10; i ++) {
			num[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i+1) + " o. número"));
			if (num[i] > 0)
				contPos++;
			else if (num[i] < 0)
				contNeg++;
			else
				contNulo++;
		}
		//saída:
		String mostra = "Números digitados:\n";
//		for (int i =0; i < 10; i++) {
//		mostra+= num[i]+ " ";
//		}
		for (int numero: num) {
			mostra+= numero+ " ";
		}
		mostra+="\nPositivos: " + contPos +
				"\nNegativos: " + contNeg +
				"\nNulos: " + contNulo;
		JOptionPane.showMessageDialog(null, mostra);

	}

}
