package Unidade3;
import java.util.Scanner;

public class AvaliaçãoNota {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		float nota;
		System.out.println("Digite o valor da nota");
		nota = in.nextFloat();
		
		if(nota > 100 || nota < 0){
			System.out.println("Nota incorreta");
		}
		else if (nota >= 90) {
			System.out.println("Nota excelente");
		}
		else if (nota >= 70) {
			System.out.println("Nota boa");
		}
		else if (nota >= 50) {
			System.out.println("Nota regular");
		}
		else if (nota >= 0 && nota < 50) {
			System.out.println("Nota insuficiente");
		}
		else {
			System.out.println("Nota incorreta");
		}
		in.close();
	}

}
