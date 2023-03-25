package arrays;

import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a quantidade "
				+ "de notas a serem registradas:");
		
		int indice = entrada.nextInt();
		double[] notasAluno = new double[indice];
		double notaTotal = 0;
		
		for (int i = 0; i < indice; i++) {
			System.out.printf("Digite a nota n°[%d]\n", i + 1);
			notasAluno[i] = entrada.nextDouble();
		}
		for(double nota: notasAluno) {
			notaTotal += nota;
		}
		entrada.close();
		System.out.printf("A média do aluno é %.2f.\n", notaTotal/indice);
		
	}
}
