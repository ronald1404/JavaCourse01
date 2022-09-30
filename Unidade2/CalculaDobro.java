package Unidade2;

import javax.swing.JOptionPane;

public class CalculaDobro {

	public static void main(String[] args) {
		double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
		JOptionPane.showMessageDialog(null, "O dobro do n�mero e "+numero * 2);
		
	}
}
