package br.com.descomplica.live03;

import javax.swing.JOptionPane;

public class Exemplo02 {

	public static void main(String[] args) {
		// declaração devariáveis:
		int num, soma = 0;
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		while (num !=0) {
			soma+=num;
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));
		}
		//saída:
		JOptionPane.showMessageDialog(null, "Soma dos números: " + soma);

	}

}
