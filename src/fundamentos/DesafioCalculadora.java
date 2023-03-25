package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("Digite outro número: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("Digite o símbolo da operação desejada: ");
		String operacao = entrada.next();
		
		entrada.close();
		
		String symbol = "+".equals(operacao) ? 
				"Resultado: " + (num1+num2) : 
					    "-".equals(operacao)?
				"Resultado: " + (num1-num2) :
					    "*".equals(operacao)?
				"Resultado: " + (num1*num2) :
					    "/".equals(operacao)?
				"Resultado: " + (num1/num2) :
				"Resultado: " + (num1%num2) ;
		System.out.println(symbol);
		
	}
}
