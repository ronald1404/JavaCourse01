package Unidade4;

import java.util.Scanner;

public class CalculaMedia50Alunos {

	public static void main(String[] args) {
		
		final double numero_avaliacoes = 4;
		double nota1, nota2, nota3, nota4;
		double media, media50alunos = 0;
		int i;
		
		try (Scanner in = new Scanner(System.in)) {
			for(i =1; i<=5; i++)
			{
				System.out.println("Favor informar a nota 1");
				nota1 = in.nextDouble();
				System.out.println("Favor informar a nota 2");
				nota2 = in.nextDouble();
				System.out.println("Favor informar a nota 3");
				nota3 = in.nextDouble();
				System.out.println("Favor informar a nota 4");
				nota4 = in.nextDouble();
			
				media = (nota1+nota2+nota3+nota4)/numero_avaliacoes;
				media50alunos = media50alunos + media;
			}
			media50alunos = media50alunos/i;
			System.out.println("Media dos 5 alunos="+media50alunos);
			in.close();
		}
	}
}
