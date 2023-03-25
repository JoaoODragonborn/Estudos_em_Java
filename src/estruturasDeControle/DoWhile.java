package estruturasDeControle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String entrada;
		
		do {
			System.out.println("Diga afs palavras magicas:");
			System.out.println("Quer sair?");
			entrada = teclado.nextLine();
			
		} while (!entrada.equalsIgnoreCase("por favor"));
		System.out.println("Saiu!");
		teclado.close();
	}
}
