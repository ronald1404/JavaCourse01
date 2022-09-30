package Unidade3;

import javax.swing.JOptionPane;

class PesoIdeal {

	public static void main(String[] args) {

		double altura, peso_ideal_homem, peso_ideal_mulher;
		String sexo;

		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
		sexo = JOptionPane.showInputDialog("Digite o sexo");

		if (sexo.equalsIgnoreCase("M")) {
			peso_ideal_homem = (altura * 72.7) - 58;
			System.out.println("O peso ideal do homem e de " + peso_ideal_homem);
		} else {
			peso_ideal_mulher = (altura * 62.1) - 44.7;
			System.out.println("O peso ideal da mulher e de " + peso_ideal_mulher);
		}

	}

}
