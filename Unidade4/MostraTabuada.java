package Unidade4;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MostraTabuada {

	public static void main(String[] args) {
		
		int numero, res = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Favor informar o numero");
		numero = in.nextInt();
		
		for(int i = 1; i <= 10;i++) {
			res = numero * i;
			System.out.println("O produto de "+numero+"*"+i+" = "+ res);
		}
	}
}
