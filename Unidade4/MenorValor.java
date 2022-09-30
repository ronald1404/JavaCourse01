package Unidade4;

import java.util.Scanner;

public class MenorValor {

	public static void main(String[] args) {

		int valor, menor, maior;

		Scanner in = new Scanner(System.in);
		System.out.println("Digite o valor");
		valor = in.nextInt();
		menor = valor;
		maior = valor;

		while (valor != 0) {
			if (valor < menor)
				menor = valor;
			else if (valor > maior)
				maior = valor;
			System.out.println("Digite o valor");
			valor = in.nextInt();
		}

		System.out.println("O menor valor e:" + menor);
		System.out.println("O maior valor e:" + maior);
		in.close();
	}

}
