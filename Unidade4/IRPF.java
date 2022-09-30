package Unidade4;

import javax.swing.JOptionPane;

public class IRPF {

	public static void main(String[] args) {

		double irpf, renda_mensal, salario_liquido;
		int numero_dependentes, numero_contribuintes = 1;
		String nome;

		while (numero_contribuintes <= 3) {
			nome = JOptionPane.showInputDialog("Digite o seu Nome");
			JOptionPane.showInputDialog("Digite o seu Cpf");
			numero_dependentes = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de dependentes"));
			renda_mensal = Double.parseDouble(JOptionPane.showInputDialog("Digite o sua renda mensal"));

			salario_liquido = renda_mensal - (numero_dependentes * 189.59) - 0.11 * renda_mensal;

			if (salario_liquido <= 1903.98) {
				irpf = 0;
				JOptionPane.showMessageDialog(null, "O contribuinte " + nome + " e isento");
			} else if ((salario_liquido >= 1903.99) && (salario_liquido <= 2826.65)) {
				irpf = 0.075 * salario_liquido - 142.80;
				JOptionPane.showMessageDialog(null, "O IRPF do contribuinte " + nome + "e isento" + irpf);
			} else if ((salario_liquido >= 2826.66) && (salario_liquido <= 3751.05)) {
				irpf = 0.15 * salario_liquido - 354.80;
				JOptionPane.showMessageDialog(null, "O IRPF do contribuinte " + nome + " e isento" + irpf);
			} else if ((salario_liquido >= 3751.06) && (salario_liquido <= 4664.68)) {
				irpf = 0.225 * salario_liquido - 636.13;
				JOptionPane.showMessageDialog(null, "O IRPF do contribuinte " + nome + "e isento" + irpf);
			} else {
				irpf = 0.275 * salario_liquido - 869.36;
				JOptionPane.showMessageDialog(null, "O IRPF do contribuinte " + nome + "e de R$" + irpf);
			}
		}
	}
}
