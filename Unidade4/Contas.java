package Unidade4;

import javax.swing.JOptionPane;

public class Contas {

	public static void main(String[] args) {
		
		int numero_contas = 0;
		double valor, valor_total = 0;
		String descricao_conta;
		
		descricao_conta = JOptionPane.showInputDialog("Informe a Conta");
		valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o Valor"));
	
		while(valor>0)
		{
			JOptionPane.showMessageDialog(null, "A Conta "+descricao_conta+" tem o valor de "+valor);
			numero_contas++;
			valor_total = valor_total + valor;
			
			descricao_conta = JOptionPane.showInputDialog("Informe a Conta");
			valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o Valor"));		
		}
		JOptionPane.showMessageDialog(null, "O numero de contas="+numero_contas+" tem o valor total de "+valor_total);
	}	
}
