package Desafio04;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) throws IOException {
		
		DecimalFormat df = new DecimalFormat("0.00"); //Para formatar os tipos doubles
		
		Aluno aluno[] = new Aluno[5];//criando vetor de classes alunos para guardar os dados
		
		for(int i = 0; i<5; i++) aluno[i] = new Aluno();//inicializando cada classe
		
		Random random = new Random();//Para gerar os valores aleatoriamente
		
		try (Scanner in = new Scanner(System.in)) {
			double notaAlunos[][] = new double[5][4];//matriz para guardar as notas e fazer os calculos
			int aprovados = 0, reprovados = 0;
			double media;

			for (int i = 0; i < 5; i++) {
				System.out.println("Qual o nome do aluno?");
				aluno[i].setNome(in.next());//ler o nome do aluno
				aluno[i].setFrequencia(random.nextInt(50, 100));//gera frequencia
				
				//mensagens no console
				System.out.println("Aluno " + (i + 1));
				System.out.println("Frequencia do Aluno = " + aluno[i].getFrequencia());
				System.out.println("Notas do " + (i + 1) + " Aluno");			
				media = 0;
				for (int j = 0; j < 4; j++) {
					notaAlunos[i][j] = random.nextFloat(5, 10);//gera notas de 5 a 10
					System.out.print(df.format(notaAlunos[i][j])+ " ");//mostrar as 4 notas no console
					media += (notaAlunos[i][j]) / 4;//soma todas as medias e divide por 4
				}
				aluno[i].setMedia(media);//atribui media a classe aluno
				
				if (aluno[i].getMedia() >= 7.00 && aluno[i].getFrequencia() >= 75) {
					aprovados++;
					aluno[i].setAprovado(true);//aluno aprovado = true
				}
				else {
					reprovados++;
					aluno[i].setAprovado(false);//aluno reprovado = false
				}
				System.out.println();
			}

			//Cria os arquivos e os printers
			FileWriter Aprovados = new FileWriter("Aprovados.txt");
			FileWriter Reprovados = new FileWriter("Reprovados.txt");
			PrintWriter printAprovados = new PrintWriter(Aprovados);
			PrintWriter printReprovados = new PrintWriter(Reprovados);

			//Geras as mensagens para os arquivos txt
			printAprovados.print("Numero de aprovados = " + aprovados+"\nAlunos:\n");
			printReprovados.print("O numero de reprovados = " + reprovados+"\nAlunos:\n");
			for (int i = 0; i < 5; i++) {
				if(aluno[i].isAprovado()) {
					printAprovados.println(aluno[i].getNome() + "-> Frequencia = "+
							aluno[i].getFrequencia()+",  Média = "+df.format(aluno[i].getMedia()));
				}else {
					printReprovados.println(aluno[i].getNome()+ "-> Frequencia = "+
							aluno[i].getFrequencia()+",  Média = "+df.format(aluno[i].getMedia()));
				}
				
			}
			//encerra os arquivos
			Aprovados.close();
			printAprovados.close();
			Reprovados.close();
			printReprovados.close();
		}
	}
}
