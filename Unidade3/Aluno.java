package Unidade3;

import java.util.Scanner;

public class Aluno {

	public static void main(String[] args) {
		final double numeroAvaliacoes = 4;
		double nota1, nota2, nota3, nota4;
		double media;
		int frequencia;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Favor informar a nota 1");
		nota1 = teclado.nextDouble();
		System.out.println("Favor informar a nota 2");
		nota2 = teclado.nextDouble();
		System.out.println("Favor informar a nota 3");
		nota3 = teclado.nextDouble();
		System.out.println("Favor informar a nota 4");
		nota4 = teclado.nextDouble();

		System.out.println("Favor informar a frequencia");
		frequencia = teclado.nextInt();

		media = (nota1 + nota2 + nota3 + nota4) / numeroAvaliacoes;
		System.out.println("A media aritmetica foi de " + media);
		if ((media < 5) || (frequencia < 75))
			System.out.println("Aluno Reprovado!");
		else
			System.out.println("Aluno Aprovado!");
		teclado.close();
	}

}
