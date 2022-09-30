package Unidade2;

import java.util.Scanner;

public class MediaAritmetica {

	public static void main(String[] args) {
		
		final double avaliacoes = 4;
		double n1, n2, n3, n4;
		double media; 
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informar a nota 1");
		n1 = teclado.nextDouble();
		System.out.println("Informar a nota 2");
		n2 = teclado.nextDouble();
		System.out.println("Informar a nota 3");
		n3 = teclado.nextDouble();
		System.out.println("Informar a nota 4");
		n4 = teclado.nextDouble();
		
		media = (n1+n2+n3+n4)/avaliacoes;
		
		System.out.println("A media aritmetica e "+media);
		teclado.close();

	}

}
