package Unidade2;

import javax.swing.JOptionPane;

public class EscreveVariaveis {

	public static void main(String[] args) {
		
		//
		var fruta = JOptionPane.showInputDialog("Digite a fruta");
		var valor = JOptionPane.showInputDialog("Insira o valor da fruta:");
		JOptionPane.showMessageDialog(null, "O valor da "+fruta+" = "+valor);

	}

}
