package Unidade5;

import javax.swing.JOptionPane;

public class Aluno {
	public static void main(String[] args) {
		String alunos[] = new String[5];
		int i;
		
		for(i = 0; i<5; i++) {
			alunos[i] = JOptionPane.showInputDialog("Insira o nome do "+(i+1)+"º aluno");
		}
		/*
		for(i = 0; i<5; i++) {
			System.out.println(alunos[i]);
		}*/
		JOptionPane.showMessageDialog(null,
				alunos[0]+"\n"+
				alunos[1]+"\n"+
				alunos[2]+"\n"+
				alunos[3]+"\n"+
				alunos[4]+"\n");
	}
}
