package Unidade2;

import javax.swing.JOptionPane;

public class Numero{

	public static void main(String[] args) 
	{
		int n = Integer.parseInt((JOptionPane.showInputDialog("Digite o numero")));
		int antecessor = n-1;
		int sucessor = n+1;
		JOptionPane.showMessageDialog(null, "Antecessor = "+antecessor+"\n"+"Posterior = "+sucessor);
	}
}
