package Unidade4;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		
		double fatorial = 1;
		int numero, i;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Favor informar o numero");
		numero = in.nextInt();
		i = numero;
		while (i >=1)
		{
			fatorial = fatorial * i;
			i--;
		}
		System.out.println("O fatorial do numero:"+numero+"="+fatorial);
		in.close();
	}
}
