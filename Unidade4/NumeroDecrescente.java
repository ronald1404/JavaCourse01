package Unidade4;

import java.util.Scanner;

public class NumeroDecrescente {

	public static void main(String[] args) {

		int numero;

		Scanner in = new Scanner(System.in);
		System.out.println("Digite o numero");
		numero = in.nextInt();

		for (int i = numero; i >= 1; i = i - 1)
			System.out.println("Numero=" + i);
		in.close();
	}
}
