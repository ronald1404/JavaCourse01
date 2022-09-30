package Unidade3;

import java.util.Scanner;

class RaizExata {

	public static void main(String[] args) {
		
		int numero;
		double raiz_exata, maior_valor;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor do numero");
		numero = teclado.nextInt();
		raiz_exata = Math.sqrt(numero);
		maior_valor = Math.round(raiz_exata);
		
		if (raiz_exata == maior_valor)
			System.out.println("Existe raiz exata para o numero "+numero);
		else
			System.out.println("Nao existe raiz exata para o numero "+numero);
		teclado.close();

	}

}
