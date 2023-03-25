package coisaMinha;

import java.util.Scanner;

public class Seculo {
	public static void main(String[] args) {
		
		//Esse programa imprime o século do ano recebido
		//a partir do ano 1000 até o ano 9999
		
		System.out.println("Digite o ano: ");
		Scanner entrada = new Scanner(System.in);
		int ano = entrada.nextInt();
		entrada.close();
		String textoAno = Integer.toString(ano);
		
		//System.out.println(primeirosNumeros(textoAno));
		//System.out.println(ultimosNumeros(textoAno));
		
		int seculo = primeirosNumeros(textoAno);
		
		if (ultimosNumeros(textoAno) != 00) {
			seculo ++;
		}
		System.out.printf("Século: %d", seculo);
		}
	static int primeirosNumeros(String a) {
		String resultado = "";
		for(int i = 0; i < 2; i++) {
			char primeiroValor = a.charAt(i);
			resultado += primeiroValor; 
		}
		int resultadoInt = Integer.parseInt(resultado);
		return resultadoInt;
	}	
	static int ultimosNumeros(String a) {
		String resultado = "";
		for(int i = 2; i > 0; i--) {
			char ultimoValor = a.charAt(a.length()-i);
			resultado += ultimoValor; 
		}
		int resultadoInt = Integer.parseInt(resultado);
		return resultadoInt;
	}
}
