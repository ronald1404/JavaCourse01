package Unidade5;

import javax.swing.JOptionPane;

public class NotasAlunos {

	public static void main(String[] args) {
		int i, n = 5, aprovados = 0, reprovados = 0;
		String nomeAlunos[] = new String[n];
		double nota;//[] = new double[n];
		String situacao[] = new String[n];
		double media[] = new double[n];
		
		
		
		for(i = 0; i<n; i++) {
			nomeAlunos[i] = JOptionPane.showInputDialog("Insira o nome do "+(i+1)+"º aluno");
			media[i] = 0;
			for(int j = 0; j <=3; j++) {
				nota = Double.parseDouble(JOptionPane.showInputDialog("Qual a " +(j+1)+" nota do aluno"));
				media[i] += nota;//[j];
			}
			media[i] = media[i]/4;
			situacao[i] = media[i] >= 5 ? "Aprovado": "reprovado";
			if (media[i]>5) aprovados++;
			else reprovados++;
		}
		
		for(i = 0; i<n; i++) {
			System.out.println("Aluno "+nomeAlunos[i] +" teve media "+media[i]+" e esta " + situacao[i]);
		}
		System.out.println("Aprovados = " + aprovados);
		System.out.println("Reprovados = " + reprovados);
	}

}
