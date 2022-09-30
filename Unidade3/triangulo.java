package Unidade3;

import java.util.Scanner;

class Triangulo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o lado A do triangulo");
		var a = teclado.nextInt();

		System.out.println("Digite o lado B do triangulo");
		var b = teclado.nextInt();

		System.out.println("Digite o lado C do triangulo");
		var c = teclado.nextInt();

		if ((a < b + c) && (b < a + c) && (c < a + b)) {
			if ((a == b) && (b == c))
				System.out.println("Triangulo Equilatero!");
			else {
				if ((a == b) || (b == c))
					System.out.println("Triangulo isoceles!");
				else
					System.out.println("Triangulo Escaleno!");

			}
		} else
			System.out.println("Os lados nao formam um triangulo!");
		teclado.close();
	}

}
