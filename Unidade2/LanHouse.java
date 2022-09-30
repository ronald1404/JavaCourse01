package Unidade2;

import javax.swing.JOptionPane;

public class LanHouse {

	public static void main(String[] args) {
		
		final int VALOR15MINUTOS = 2;
		
		double horas = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero de horas:"));
		double minutos = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero de minutos:"));
		
		double totalMin = horas*60 + minutos;
		double total= Math.ceil((totalMin/15))*VALOR15MINUTOS;
		
		JOptionPane.showMessageDialog(null, "O valor a pagar � de R$"+total);
		

	}

}
