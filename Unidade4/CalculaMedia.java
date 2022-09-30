package Unidade4;

import java.util.Scanner;

public class CalculaMedia {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Favor informar o valor");
		var valor = in.nextInt();

		var soma_valor = 0;
		var cont = 0;

		while (valor != -1) {
			soma_valor = soma_valor + valor;
			cont++;

			System.out.println("Favor informar o valor");
			valor = in.nextInt();
		}
		System.out.println("Media=" + soma_valor / cont);
		in.close();
	}

}
