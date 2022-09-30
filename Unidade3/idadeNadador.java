package Unidade3;

import java.util.Scanner;

class IdadeNadador {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Qual a idade do atleta?");
		var idade = in.nextInt();

		if ((idade >= 0) && (idade <= 100)) {
			if (idade <= 5)
				System.out.println("Infantil A");
			else if (idade <= 8)
				System.out.println("Infantil B");
			else if (idade <= 11)
				System.out.println("Infantil C");
			else if (idade <= 13)
				System.out.println("Juvenil A");
			else if (idade <= 17)
				System.out.println("Juvenil B");
			else
				System.out.println("Adulto");
		} else {
			System.out.println("Idade inválida!");
			AvaliacaoNota.main(null);
		}
		in.close();
	}

}
