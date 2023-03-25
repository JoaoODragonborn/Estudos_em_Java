package estruturasDeControle;

import java.util.Scanner;

public class IfElseIf {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite uma nota: ");
		Double nota = entrada.nextDouble();
		
		if (nota > 10 || nota < 0) {
			System.out.println("Nota inválida.");
		} else if (nota >= 9) {
			System.out.println("SS");
		} else if (nota >= 7) {
			System.out.println("MS");
		} else if (nota >= 5) {
			System.out.println("MM");
		} else if (nota >= 3) {
			System.out.println("MI");
		} else {
			System.out.println("II");
		}
		
		entrada.close();
	}
}
