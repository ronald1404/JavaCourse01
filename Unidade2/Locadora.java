package Unidade2;

import javax.swing.JOptionPane;

public class Locadora {

	public static void main(String[] args) {
		
		JOptionPane.showInputDialog("Digite o titulo do filme");
		int Filme_horas = Integer.parseInt((JOptionPane.showInputDialog("Informar o numero de horas do filme")));
		int Filme_minutos = Integer.parseInt((JOptionPane.showInputDialog("Informar o numero de minutos do filme")));
		int total = Filme_horas*60 + Filme_minutos;
		JOptionPane.showMessageDialog(null, "A duracao total do filme em minutos e de  "+total);

	}

}
