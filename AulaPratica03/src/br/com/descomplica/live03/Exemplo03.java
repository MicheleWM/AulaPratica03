package br.com.descomplica.live03;

import javax.swing.JOptionPane;

public class Exemplo03 {

	public static void main(String[] args) {
		// declaração devariáveis:
		int num, soma = 0;
		do {
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));
			soma+=num;
		} while (num !=0);
		//saída:
		JOptionPane.showMessageDialog(null, "Soma dos números: " + soma);

	}

}
