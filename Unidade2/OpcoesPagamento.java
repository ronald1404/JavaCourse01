package Unidade2;

import javax.swing.JOptionPane;

public class OpcoesPagamento{

	public static void main(String[] args) {
		
		double produto = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Produto"));
		double aVista = produto * 0.9;
		double parcelado = produto/3;
		
		JOptionPane.showMessageDialog(null,
				"O produto pode ser comprado a vista com 10% de desconto: "+ aVista+
				" ou\nO produto pode ser parcelado em 3x de "+ parcelado);
		

	}

}
