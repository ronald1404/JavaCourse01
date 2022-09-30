package Unidade4;

import java.util.Scanner;

public class CalculaMediav2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Digite o valor");
		var valor = in.nextInt();

		var soma_valor = 0;
		var cont = 0;

		do {
			if (valor != -1) {
				soma_valor = soma_valor + valor;
				cont++;
				System.out.println("Digite o valor");
				valor = in.nextInt();
			}
		} while (valor != -1);

		if (cont != 0)
			System.out.println("Media=" + soma_valor / cont);
		in.close();
	}

}
