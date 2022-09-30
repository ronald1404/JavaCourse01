package Unidade2;

import javax.swing.JOptionPane;

public class LeituraEscrita {

	public static void main(String[] args) {
		
		var nome = JOptionPane.showInputDialog("Digite o seu nome");
		JOptionPane.showMessageDialog(null, "Seja bem-vindo "+nome);
		
	}
}
