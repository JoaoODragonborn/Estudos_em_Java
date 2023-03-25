package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor do primeiro salário:");
		String sal1 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite o valor do segundo salário:");
		String sal2 = entrada.nextLine().replace(",", ".");

		System.out.println("Digite o valor do terceiro salário:");
		String sal3 = entrada.nextLine().replace(",", ".");
		
		entrada.close();

		double sal1duplo = Double.parseDouble(sal1);
		double sal2duplo = Double.parseDouble(sal2);
		double sal3duplo = Double.parseDouble(sal3);
		double media = (sal1duplo+sal2duplo+sal3duplo)/3;
		
		System.out.printf("Média salarial dos ultimos três meses:"
				+ " R$ %.2f", media);
		
	}

}
