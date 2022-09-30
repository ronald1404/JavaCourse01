package Desafio02;

import java.util.Scanner;

public class Questao1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		System.out.println("Digite os N numeros");
		n = in.nextInt(); // ler o valor de n
		int soma = 0;
		for (int i = 1; i <= n; i++) {
			soma += i; //faz a acumulação por meio de um laço
		}
		System.out.println(soma);
		in.close();
	}
}
