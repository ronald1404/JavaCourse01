package Unidade3;

import javax.swing.JOptionPane;

public class Moeda {

	public static void main(String[] args) {

		double valor, valor_convertido;
		int tipo_moeda;

		valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser convertido"));
		tipo_moeda = Integer
				.parseInt(JOptionPane.showInputDialog("Favor informar o tipo de moeda [1-Libra][2-D�lar][3-Euro]"));

		switch (tipo_moeda) {
		case 1: {
			valor_convertido = valor / 5;
			JOptionPane.showMessageDialog(null, "O valor convertido em Libras e de " + valor_convertido);
			break;
		}
		case 2: {
			valor_convertido = valor / 4;
			JOptionPane.showMessageDialog(null, "O valor convertido em Dolar e de " + valor_convertido);
			break;
		}
		case 3: {
			valor_convertido = valor / 4.4;
			JOptionPane.showMessageDialog(null, "O valor do em Euro e de " + valor_convertido);
			break;
		}
		default:
			JOptionPane.showMessageDialog(null, "Oocao incorreta");

		}
	}
}
