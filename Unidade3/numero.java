package Unidade3;

import java.util.Scanner;

class Numero {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Favor informar a nota 1");
		int numero = in.nextInt();

		if (numero%2 == 0) 
			System.out.println("O numero e par!");
		else
			System.out.println("O numero é impar!");
		in.close();
	}

}
