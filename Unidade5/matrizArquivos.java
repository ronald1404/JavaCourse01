package Unidade5;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class matrizArquivos {

	public static void main(String[] args) throws IOException {
		int matriz[][] = new int[3][3];

        for(int i = 0; i<3; i++){
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = i == j ? 1:0;
            }
        }
        FileWriter file = new FileWriter("Matriz.txt");
        PrintWriter printarq = new PrintWriter(file);

        for(int i = 0; i<3; i++){
            for (int j = 0; j < 3; j++) {
                printarq.print(matriz[i][j]+ " ");
            }
            printarq.println();;
        }
        file.close();
        printarq.close();
	}

}
