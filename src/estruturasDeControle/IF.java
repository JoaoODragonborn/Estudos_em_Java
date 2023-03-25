package estruturasDeControle;

import java.util.Scanner;

public class IF {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a média: ");
		double media= entrada.nextDouble();
		
		entrada.close();
		
		if (media >= 7) {
			System.out.println("Aprovado.");
		} else if (media>=5 && media < 7){
			System.out.println("Em recuperação.");
		} else {
			System.out.println("Reprovado.");
		}
		
	}
}
