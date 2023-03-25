package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matrizes {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o número de alunos:");
		int qtdAlunos = entrada.nextInt();
		System.out.println("Digite a quantidade de notas para cada aluno:");
		int qtdNotas = entrada.nextInt();
		
		double[][] notasAlunos = new double[qtdAlunos][qtdNotas];
		double[] mediaAlunos = new double[qtdAlunos];
		
		for(int i = 0; i < notasAlunos.length; i++) {
			for (int c = 0; c < notasAlunos[i].length; c++) {
				
				System.out.printf("Informe a nota %d do aluno %d: ", c + 1, i + 1);
				
				notasAlunos[i][c] = entrada.nextDouble();
			}
		}
		entrada.close();
		
		for (int i = 0; i < notasAlunos[i]; i++) {
			
		}
		
		/*
		for (int i = 0; i < notasAlunos.length; i++) {
			for (int c = 0; c < notasAlunos[i].length; c++) {
				System.out.printf("[%.2f] ", notasAlunos[i][c]);
			}
			System.out.println();
		}
		*/
	}
}
