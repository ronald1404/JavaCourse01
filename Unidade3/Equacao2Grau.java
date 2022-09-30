package Unidade3;

import java.util.Scanner;

public class Equacao2Grau {

	public static void main(String[] args) {
		int a, b, c;
		double delta, x1, x2;

		Scanner in = new Scanner(System.in);
		System.out.println("Digite o valor de A");
		a = in.nextInt();
		System.out.println("Digite o valor de B");
		b = in.nextInt();
		System.out.println("Digite o valor de C");
		c = in.nextInt();

		delta = b * b - 4 * a * c;

		if (delta >= 0) {
			x1 = -b - (Math.sqrt(delta)) / 2 * a;
			x2 = -b + (Math.sqrt(delta)) / 2 * a;
			System.out.println("x1=" + x1);
			System.out.println("x2=" + x2);
		} else
			System.out.println("Não possui raiz real");
		in.close();
	}
}
