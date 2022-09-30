package Desafio05;

import javax.swing.JOptionPane;

public class Questao01 {

	public static void main(String[] args) {
		int notas100, notas200, notas50;

		int resto, saque;
		saque = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor"));
		if (saque % 50 == 0) {
			notas200 = (int) Math.floor(saque / 200);
			resto = saque % 200;
			notas100 = (int) Math.floor(resto / 100);
			resto = resto % 100;
			notas50 = (int) Math.floor(resto / 50);

			if (notas200 > 0)
				JOptionPane.showMessageDialog(null, "Notas de duzentos = " + notas200);
			if (notas100 > 0)
				JOptionPane.showMessageDialog(null, "Notas de cem = " + notas100);
			if (notas50 > 0)
				JOptionPane.showMessageDialog(null, "Notas de cinquenta = " + notas50);
		} else
			JOptionPane.showMessageDialog(null, "Valor incorreto");
	}
}
