package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("bom");
		System.out.print(" dia");
		
		System.out.println("Bom");
		System.out.println("dia");
		
		System.out.printf("Megasena: %d %d %d %d %d %d\n",
				1, 2, 3, 4, 5, 6);
		System.out.printf("Salário: %.1f\n", 123.153);
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o seu nome: ");
		String nome = entrada.nextLine();
		System.out.println(nome);
		System.out.println("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		System.out.println("Digite a sua idade: ");
		int idade = entrada.nextInt();
		entrada.nextLine();
		System.out.printf("%s %s tem %d anos.", nome, sobrenome, idade);
		entrada.close();
	}
}
