package Unidade2;

import javax.swing.JOptionPane;

public class JantarPizza {

	public static void main(String[] args) {
		
		double valorJantar = Double.parseDouble(JOptionPane.showInputDialog("Informar o valor do Jantar"));
		int numeroClientes = Integer.parseInt((JOptionPane.showInputDialog("Informar o nu30mero de clientes")));
		double valorIndividual = valorJantar/numeroClientes;
		JOptionPane.showMessageDialog(null,valorIndividual+" para cada cliente");
		
	}

}
