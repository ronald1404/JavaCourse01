package Unidade4;

import java.util.Scanner;

class CadastraAluno {

	public static void main(String[] args) {
		String nome, endereco, telefone;
		int matricula, cont = 0;

		Scanner in = new Scanner(System.in);
		System.out.println("Favor informar a matricula");
		matricula = in.nextInt();

		do {
			if (matricula != 0) {
				System.out.println("Favor informar o nome");
				nome = in.next();
				System.out.println("Favor informar o endereco");
				endereco = in.next();
				System.out.println("Favor informar o telefone");
				telefone = in.next();
				cont++;
				System.out.println("Favor informar a matricula do proximo aluno");
				matricula = in.nextInt();
			}
		} while (matricula != 0);
		in.close();
	}

}
