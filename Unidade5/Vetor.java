package Unidade5;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A[] = new int[10];
		int B[] = new int[10];
		
		for(int i = 0;i<10;i++) {
			A[i] = in.nextInt();
		}
		for(int i = 0;i<10;i++) {
			B[i] = A[i] % 2 == 0 ? 2*A[i]:A[i]/2;
		}
		for(int i = 0;i<10;i++) {
			System.out.println("O valor de B["+i+"] = "+B[i]);
		}
		
		
		in.close();
	}

}
