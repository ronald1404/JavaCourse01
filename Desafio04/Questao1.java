package Desafio04;

import java.util.Random;

public class Questao1 {

	public static void main(String[] args) {
		Random random = new Random();
		int matriz[][] = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matriz[i][j] = random.nextInt(30);
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
		int maior, menor;
		
		maior = matriz[0][0];
		menor =  matriz[0][0];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				
				if (matriz[i][j] > maior) maior = matriz[i][j];
				if (matriz[i][j] < menor) menor = matriz[i][j];
			}
		}
		System.out.println("O maior numero da matriz é " + maior);
		System.out.println("O menor numero da matriz é " + menor);
	}

}
