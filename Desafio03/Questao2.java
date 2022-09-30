package Desafio03;

public class Questao2 {

	public static void main(String[] args) {
		char alfabeto[] = new char[27];
		int count = 0;
		for (int i = 97; i <= 122; i++) {
			alfabeto[count] = (char) i;
			count++;
		}
		System.out.println(alfabeto);

		char y;
		count = 1;
		char letra;
		for (int i = 0; i < 26; i++) {
			if ((int) (alfabeto[i] + count) > 122) {
				y = (char) ((alfabeto[i] + count) - 122);
				letra = (char) (96 + y);
				alfabeto[i] = letra;
			} else {
				letra = (char) (alfabeto[i] + count);
				alfabeto[i] = letra;
			}
			count++;
		}
		System.out.println(alfabeto);

	}
}
