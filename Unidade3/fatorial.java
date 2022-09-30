package Unidade3;

public class fatorial {
	public static int fat(int n) {
		int fat;
		if (n == 1) 
			return n;
		fat = n * fat(n-1); 
		return fat;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fat(3));

	}

}
