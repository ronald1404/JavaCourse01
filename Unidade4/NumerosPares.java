package Unidade4;

import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Digite o numero A");
		int a = in.nextInt();
		System.out.println("Digiter o numero B");
		int b = in.nextInt();

		for (int i = a; i <= b; i++) {
			if (i % 2 == 0)
				System.out.println("O número:" + i + " e par!");
		}
		in.close();
	}
}
