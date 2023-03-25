package estruturasDeControle;

import java.util.Scanner;

public class ExerciciosEstruturasDeControle {
	public static void main(String[] args) {
 
		Scanner entrada = new Scanner(System.in);
		
		//1. Criar um programa que receba um número e 
		//verifique se ele está entre 0 e 10 e é par;]
		
		int num = 0; // Digite aqui o número a ser verificado.
		
		if (num % 2 == 1) {
			System.out.printf("%d é ímpar.", num);
		} else {
			System.out.printf("%d é par.", num);
		}
		
		System.out.println();
		
		// 2. Criar um programa informa se o ano atual é um ano bissexto;
		
		if (num % 4 == 0 && num % 100 != 0) {
			System.out.printf("O ano %d é bissexto.", num);
		} else if(num % 400 == 0){
			System.out.printf("O ano %d é bissexto.", num);
		} else {
			System.out.printf("O ano %d não é bissexto.", num);
		}
		
		System.out.println();
		
		/* 3. Criar um programa que receba duas notas parciais, 
		calcular a média final. Se a nota do aluno for maior ou 
		igual a 7.0 imprime no console "Aprovado", se a nota for 
		menor que 7.0 e maior do que 4.0 imprime no console "Recuperação", 
		caso contrário imprime no console "Reprovado". */
		
		double nota1 = 7;
		double nota2 = 5;
		double media = (nota1 + nota2) / 2;
		
		if(nota1 > 10 || nota1 < 0 || nota2 > 10 || nota2 < 0) {
			System.out.println("Notas inválidas");
		} else if (media >= 7 && media <= 10) {
			System.out.printf("A média é %.2f, e o aluno está aprovado", media);
		} else if (media >= 4 && media < 7) {
			System.out.printf("A média é %.2f, e o aluno está em recuperação.", media);
		} else {
			System.out.printf("A média é %.2f, e o aluno está reprovado.", media);
		}
		System.out.println();
		
		// 4. Criar um programa que receba um número e diga se ele é um número primo.
		// 5. Refatorar o exercício 04, utilizando a estrutura switch.
		// Juntei os dois para não dar muito trabalho e porque eu não sei uma 
		// forma melhor de fazer o exercício 5 sem IFs ou operadores ternários. 
		int nume = 348;
		
		// Pelo Crivo de Eratóstenes:
		String primo;
		
		if (nume <=1) {
			System.out.println("Número inválido.");
			primo = "invalido";
		} else if (nume == 2 || nume == 3 || nume == 5 || nume == 7 ) {
			System.out.printf("O número %d é primo.", nume);
			primo = "verdade";
		} else if(nume % 2 == 0 || nume % 3 == 0 || nume % 5 == 0 || nume % 7 == 0 ) {
			System.out.printf("O número %d não é primo.", nume);
			primo = "falso";
		} else {
			System.out.printf("O número %d é primo.", nume);
			primo = "verdade";
		}
		System.out.println();
		
		switch (primo) {
		
		case "invalido":
			System.out.printf("O número é inválido.");
			break;
			
		case "verdade":
			System.out.printf("O número %d é primo.", nume);
			break;
			
		case "falso":
			System.out.printf("O número %d não é primo.", nume);
		}
		System.out.println();
		
		
		/* 6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. 
		 * Armazene um numero aleatório em uma variável. 
		 * O Jogador tem 10 tentativas para adivinhar o número gerado. 
		 * Ao final de cada tentativa, imprima a quantidade de tentativas
		 * restantes, e imprima se o número inserido é maior ou menor
		 *  do que o número armazenado. */
		
		int aleatorio = 457;
		int palpite = 0;
		int tentativas = 10;
		
		System.out.println("Adivinhe o número da variável escondida");
		
		do {
			//palpite = entrada.nextInt();
			
			if(palpite == aleatorio) {
				System.out.println("Você acertou!");
			} else{
				tentativas--;
				if(tentativas == 1) {
				System.out.printf("Você errou e ainda possui %d tentativa.", tentativas);
				} else if( tentativas != 0) {
					System.out.printf("Você errou e ainda possui %d tentativas.", tentativas);
				} else {
					System.out.printf("Você perdeu, você é um fracassado!");
				}
			}
		} while(palpite != aleatorio && tentativas != 0);
		
		System.out.println();
		
		/* 7. Criar um programa que enquanto estiver recebendo números positivos, 
		 * imprime no console a soma dos números inseridos, caso receba um número
		 * negativo, encerre o programa. Tente utilizar a estrutura do while. */
		System.out.println("Digite um número");
		int soma = 0;
		int valor;
		do {
			valor = -1; // entrada.nextInt();
 			if (valor >= 0) {
				soma += valor;
			} else {				
				System.out.printf("Fim do programa, a soma das entradas é %d", soma);
			}
		} while(valor >= 0);
		
		System.out.println();

		// 8. Criar um programa que receba uma palavra e imprime no console letra por letra.
		
		String texto = "Cavalo";
		int largura = texto.length();
		
		for(int value = 0 ; value < largura; value++) {
			System.out.println(texto.charAt(value));
			
		}
		
		// 9. Crie um programa que recebe 10 valores e ao final imprima o maior número.
		int numb = entrada.nextInt();
		
		for(int dez = 0; dez < 9; dez++) {
			int numb2 = entrada.nextInt();
			if (numb2 > numb) {
				numb = numb2;
			}
		}
		
		System.out.printf("O maior número é: %d", numb);
		entrada.close();		
	}
}
