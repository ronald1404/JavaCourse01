package Desafio02;

import java.util.Scanner;

public class Questao2 {
	//Função soma por recursividade
	
	public static int soma(int n) {
		if (n <= 1) return 1;
		return n+soma(n-1); //recursividade
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		System.out.println("Digite os N numeros");
		n = in.nextInt(); //ler o valor pra soma
		System.out.println(soma(n)); //Imprime a soma chamando a funçao
		in.close();
	}

}
