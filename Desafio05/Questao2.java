package Desafio05;

import javax.swing.JOptionPane;

public class Questao2 {

	public static void main(String[] args) {
		int notas100, notas200, notas50, notas2;

		int resto, saque;
		saque = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor"));
		if (saque % 2 == 0) {
			notas200 = (int) Math.floor(saque / 200);
			resto = saque % 200;
			notas100 = (int) Math.floor(resto / 100);
			resto = resto % 100;
			notas50 = (int) Math.floor(resto / 50);
			notas2 = (int) Math.floorDiv(resto, 2);
			if (notas200 > 0) {
				Object[] option1 = { 
						"Notas de [R$200][R$100][R$50],",
						"Notas de [R$100][R$50][R$10]",
						"Notas de [R$50][R$10][R$2]" };
				JOptionPane.showInputDialog(null, "Todas as opções Listadas abaixo estão disponíveis",
						"Caixa Eletrônico", JOptionPane.DEFAULT_OPTION, null, option1, option1[0]);
			}
			
			else if (notas100 > 0) {
				Object[] option2 = { 
						"Notas de [R$100][R$50][R$10]",
				"Notas de [R$50][R$10][R$2]" };
				JOptionPane.showInputDialog(null, "Todas as opções Listadas abaixo estão disponíveis",
						"Caixa Eletrônico", JOptionPane.DEFAULT_OPTION, null, option2, option2[0]);
			}
			
			else if (notas50 > 0 || notas2 > 0) {
				Object[] option3 = { "Notas de [R$50][R$10][R$2]" };
				JOptionPane.showInputDialog(null, "Unica opção disponível", "Caixa Eletrônico",
						JOptionPane.DEFAULT_OPTION, null, option3, option3[0]);
		}
		}
		else JOptionPane.showMessageDialog(null, "Valor minimo de 2");
	}
}