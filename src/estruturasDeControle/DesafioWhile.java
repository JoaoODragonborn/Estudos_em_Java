package estruturasDeControle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int qtdNota = 0;
		double nota = 0;
		double notaTotal = 0;
		double media;
		
		while(nota != -1) {
			System.out.println("Digite uma nota ou \"-1\" para sair");
			nota = entrada.nextDouble();
			
			
			if (nota == -1) {
			// Bloco vazio para sair da etrutura if/else sem precisar mencionar que a nota é inválida
			}
			else if (nota < 0 || nota > 10) {			
				System.out.println("Digite uma nota válida. Uma nota válida está entre 0 a 10.");
			} 
			else {
				notaTotal += nota;
				qtdNota ++;
			}
		}

		entrada.close();
		
		media = notaTotal/qtdNota;
		System.out.printf("A nota total é: %.2f \nA quantidade de notas é: %d \nA média é: %.2f \n", notaTotal, qtdNota, media);

	}
}
