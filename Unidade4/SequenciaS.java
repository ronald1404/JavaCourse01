package Unidade4;

public class SequenciaS {

	public static void main(String[] args) {

		double s, s9 = 0, s10 = 0, s100 = 0, s10000 = 0;
		s = 1;
		for (int i = 2; i <= 10000; i++) {
			s = s + 3;
			if (i == 9)
				s9 = s;
			else if (i == 10)
				s10 = s;
			else if (i == 100)
				s100 = s;
			else if (i == 10000)
				s10000 = s;
		}
		System.out.println("S9=" + s9);
		System.out.println("S10=" + s10);
		System.out.println("S100=" + s100);
		System.out.println("S10000=" + s10000);
	}
}
