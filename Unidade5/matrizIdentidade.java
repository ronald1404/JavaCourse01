package Unidade5;

public class matrizIdentidade {
	public static void main(String[] args) {
		int vetor[][] = new int[3][3];
		
		for(int i = 0; i<3;i++) {
			for(int j = 0; j<3;j++) {
				vetor[i][j] = j == i ? 1:0;
			}
		}

		for(int i = 0; i<3;i++) {
			System.out.println();
			for(int j = 0; j<3;j++) {
				System.out.print(vetor[i][j]+" ");
			}
		}
	}
}
