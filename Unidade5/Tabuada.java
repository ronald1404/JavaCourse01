package Unidade5;

public class Tabuada {
	public static void tabuada(int x) {
		for(int i = 1; i<=10; i++) {
			System.out.println("A soma de " +x+ "+" +i+ " = " +(x+i));
		}
		for(int i = 1; i<=10; i++) {
			System.out.println("A diferença de " +x+ "-" +i+ " = " +(x-i));
		}
		for(int i = 1; i<=10; i++) {
			System.out.println("O produto de " +x+ "*" +i+ " = " +(x*i));
		}
		for(int i = 1; i<=10; i++) {
			System.out.println("O quociente de " +x+ "/" +i+ " = " +(x/i));
		}
	}
	public static void main(String[] args) {
		tabuada(10);
	}

}
