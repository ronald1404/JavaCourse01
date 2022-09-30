package Unidade2;

import javax.swing.JOptionPane;

public class CalculoHoras {

	public static void main(String[] args) {	
		int dias = Integer.parseInt((JOptionPane.showInputDialog("Insira o numero de viagens:")));
		int horas = Integer.parseInt((JOptionPane.showInputDialog("Horas de viagem:")));
		int totalHoras = (dias*24) + horas;
		
		JOptionPane.showMessageDialog(null, "O valor total da viagem em horas foi de "+totalHoras);
	}

}
