package estruturasDeControle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o que você quer fazer:");
		
		String entrada = teclado.next();
		
	
		while (!entrada.equalsIgnoreCase("sair")) {
			System.out.println("Olá, seja muito bem vindo");
			entrada = teclado.next();
		}
		
		teclado.close();
		
		System.out.println("Adeus!");
		
		
	}
}
