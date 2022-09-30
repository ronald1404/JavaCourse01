package Unidade4;

import java.util.Scanner;

public class Fatorialv2 {

	public static void main(String[] args) {
		
		double fatorial = 1;
		int numero, i;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Favor informar o n�mero");
		numero = teclado.nextInt();
		i = numero;
		do
		{
			fatorial = fatorial * i;
			i--; // numero = numero - 1;
		} while (i >=1);
		System.out.println("O fatorial do n�mero:"+numero+"="+fatorial);
		teclado.close();
	}
}
