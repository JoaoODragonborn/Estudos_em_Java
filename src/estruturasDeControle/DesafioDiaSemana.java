package estruturasDeControle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		
		// Domingo -> 1
		// Quarta -> 4
		
		System.out.println("Digite que dia é hoje:");
		Scanner entrada = new Scanner(System.in);
		String dia = entrada.next();
		entrada.close();
		
		
		if ("domingo".equalsIgnoreCase(dia)) {
			System.out.println("1");
		} 
		else if ("segunda".equalsIgnoreCase(dia)) {
			System.out.println("2!");
		} 
		else if ("terça".equalsIgnoreCase(dia)) {
			System.out.println("3");
		} 
		else if ("quarta".equalsIgnoreCase(dia)) {
			System.out.println("4");
		} 
		else if ("quinta".equalsIgnoreCase(dia)) {
			System.out.println("5");
		} 
		else if ("sexta".equalsIgnoreCase(dia)) {
			System.out.println("6");
		} 
		else if ("sabado".equalsIgnoreCase(dia) || 
				"sábado".equalsIgnoreCase(dia)) {
			System.out.println("7");
		} 
		else {
			System.out.printf("%s não é um dia válido!", dia);
		}
	}	
}
