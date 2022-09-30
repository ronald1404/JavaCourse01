package Unidade5;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class arquivos {

	public static void main(String[] args) throws IOException {
		String nomes[] = {"Carlos", "jose", "Antonio"};
		String fones[] = {"1111-1111","2222-2222","3333-3333"};
		String cidades[] = {"Mossóro","Apodi","Assu"};
		FileWriter arq = new FileWriter("contatos.txt");
		PrintWriter gravaarq = new PrintWriter(arq);
		gravaarq.println("========================");
		gravaarq.println("Nomes||Telefones||Cidades");
		for(int i = 0; i< nomes.length;i++) {
			gravaarq.println("========================");
			gravaarq.print(nomes[i]+"||");
			gravaarq.print(fones[i]+"||");
			gravaarq.println(cidades[i]);
		}
		gravaarq.println("========================");
		arq.close();
		gravaarq.close();
	}

}
