package Unidade4;

import java.util.Scanner;

public class NumeroEstrelas {

	public static void main(String[] args) {

		int i, numero_linhas;
		String estrela = "*";

		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Digite o numero de linhas");
			numero_linhas = in.nextInt();

			for (i = 1; i <= numero_linhas; i++) {
				System.out.println(estrela);
				estrela = estrela + "*";
			}
			in.close();
		}
	}
}
