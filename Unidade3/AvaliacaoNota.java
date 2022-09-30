package Unidade3;

import java.util.Scanner;

public class AvaliacaoNota {

	public static void main(String[] args) {
		String conceito = null;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor da nota");
		var nota = teclado.nextInt();

		if ((nota >= 0) && (nota <= 100)) {
			if (nota >= 90) conceito = "Excelente";
			else if (nota >= 70) conceito = "Bom";
			else if (nota >= 50) conceito = "Regular";
			else conceito = "Insuficiente";
		} else {
			System.out.println("Nota invalida!");
			AvaliacaoNota.main(null);
		}
		System.out.println("Conceito = " + conceito);
		teclado.close();
	}
}
