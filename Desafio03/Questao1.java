package Desafio03;

public class Questao1 {

	public static void main(String[] args) {
		char alfabeto[] = new char[27];
		int aux = 0;
		for(int i = 97; i<=122;i++ ) {
			alfabeto[aux] = (char) i;
			aux++;
		}
		System.out.println(alfabeto);
		
		for(int i = 0;i<26;i++) {
			if(alfabeto[i]== 122) alfabeto[i]=97;
			else
			 alfabeto[i]++;
		 }
		
		System.out.println(alfabeto);
	}

}
