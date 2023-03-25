package fundamentos;

import java.util.Scanner;

public class Testes {
	public static void main(String[] args) {
		System.out.println("Digite um valor inteiro: ");
		Scanner entrada = new Scanner(System.in);
		
		String valor = entrada.nextLine()
				.replace("," , ".");
		double valorduplo = Double.parseDouble(valor);
		
		System.out.println(valorduplo);
		entrada.close();

		
		
		/* Anotação formatador string:
			
			%d -> int;
			%s -> String;
			%f -> float;
			%c -> char;
		*/
	
	}
}
