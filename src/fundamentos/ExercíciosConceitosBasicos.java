package fundamentos;

public class ExercíciosConceitosBasicos {
	public static void main(String[] args) {
		
		//Exercícios propostos para o fim do módulo de fundamentos;
		//Decidi não usar Scanner pra não precisar digitar vários 
		//valores toda vez que for testar o último exercício.
		
		//1 - Lê um valor em Fahrenheit e converte para celsius
		int fah = 0;
		final int numero = 32;
		final double divisao = 5.0/9.0;
		double celsius = (fah - numero)*divisao;
		System.out.printf("%d°F é igual a %.1f°C\n", fah, celsius);
		
		
		//2 - Lê um valor em Celsius e converte para Fahrenheit
		int cel = 20;
		double fahr = cel*9/5+32;
		System.out.printf("%d°C é igual a %.1f°F\n", cel, fahr);
		
		
		//3 - Lê o peso e a altura e imprime o IMC
		double peso = 78.5;
		double altura = 1.7;
		double imc = peso/(Math.pow(altura, 2));
		
		System.out.printf("Seu IMC é %.2f Kg/m²", imc);
		
		//4 - Lê um valor e retorna seu quadrado e seu cubo
		var valor = 4;
		System.out.println("\nQuadrado do valor: " + Math.pow(valor, 2) +
		"\nCubo do valor: " + Math.pow(valor, 3));
		
		//5 -  Lê o valor da base e da altura de um triângulo e calcula sua área
		var h = 5; // h == altura, para n confundir com a variável do IMC
		var base = 7.5;
		var area = (h*base)/2;
		System.out.println(area);
		
		//6 - Resolve equações do segundo grau
		var a = 1;
		var b = 12;
		var c = -13;
		var delta = b*b-4*a*c;
		var x1 = (-b + Math.sqrt(delta))/(2*a);
		var x2 = (-b - Math.sqrt(delta))/(2*a);
		System.out.println("X' = " + x1 + ", X\" = " + x2);
	
	}
}
