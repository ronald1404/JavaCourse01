package Unidade2;

import javax.swing.JOptionPane;

public class RevendaVeiculos {

	public static void main(String[] args) {
		JOptionPane.showInputDialog("Digite o modelo do carro");
		double preco_carro = Double.parseDouble(JOptionPane.showInputDialog("Qual o preco do carro?"));
		double entrada = 0.5 * preco_carro;
		double restante = (0.5 * preco_carro)/12;
		System.out.println("O valor do carro com 50% de entrada e de "
		+entrada+" com 12 parcelas de "+restante);
		
	}

}
