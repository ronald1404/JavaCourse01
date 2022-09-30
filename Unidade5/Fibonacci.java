package Unidade5;

import javax.swing.JOptionPane;

public class Fibonacci {
	public static int fibo(int n) {
		if (n == 1) return 1;
		int a = 0, b = 1, aux = 0;
		for(int i = 1;i < n;i++ ) {
			aux = a+b;
			a = b;
			b = aux;
		}
		return aux;
	}
	public static void main(String[] args) {
		int n = Integer.parseInt( JOptionPane.showInputDialog("Digite um número"));
		JOptionPane.showMessageDialog(null, "Na posição "+n+
				" se encontra "+fibo(n) + " da sequencia de fibonacci");
	}

}
