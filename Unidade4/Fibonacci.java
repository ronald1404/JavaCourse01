package Unidade4;

public class Fibonacci {

	public static void main(String[] args) {
		int s,s1,s2;
		int termo9 = 0,termo10 = 0,t100 = 0,t1000 = 0;
		s1 = 1;
		s2 = 1;
		for(int i =3; i<=10000; i++) {
			s = s1 + s2;
			s1 = s2;
			s2 = s;
			if (i == 9) termo9 = s;
			else if (i == 10) termo10 = s;
			else if (i == 100) t100 = s;
			else if (i == 10000) t1000 = s;			
		}
		System.out.println("9º termo ="+termo9);
		System.out.println("10° termo ="+termo10);
		System.out.println("100° termo="+t100);
		System.out.println("10000° termo="+t1000);
	}
}
