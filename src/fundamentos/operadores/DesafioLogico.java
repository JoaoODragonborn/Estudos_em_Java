package fundamentos.operadores;

import java.util.Scanner;

public class DesafioLogico {
	public static void main(String[] args) {
		
		// Com o método do professor:
		
		boolean tterca = false;
		boolean tquinta = false;
		
		boolean comprouTv50 = tterca && tquinta;
		boolean comprouTv32 = tterca ^ tquinta;
		boolean nComprou = !tterca && !tquinta;
		//boolean toumouSvt = tterca || tquinta;
		
		
		System.out.println("Compramos a TV de 50\": " + comprouTv50);
		System.out.println("Compramos a TV de 32\": " + comprouTv32);
		System.out.println("Não compramos uma TV: " + nComprou);
		System.out.println("Tomamos sorvete: " + !nComprou);
		System.out.println("Não tomamos sorvete: " + nComprou);
		
		
		// Meu método com if:
		
		Scanner trabalhou = new Scanner(System.in);
		
		System.out.println("Trabalhou na terça?");
		boolean terca = trabalhou.nextBoolean();
		
		System.out.println("Trabalhou na quinta?");
		boolean quinta = trabalhou.nextBoolean();
		
		trabalhou.close();
		
		String svtvdd = "e tomamos sorvete.";
		String svtfls = "e não tomamos sorvete.";
		

		if (terca && quinta == true) {
			System.out.println("Compramos uma TV de 50 polegadas " + svtvdd);
		} 
		else if ((terca && quinta) == false) {
			if (terca == false && quinta == false) {
				System.out.println("Não compramos uma TV " + svtfls);
			} else if (quinta == false || terca== false) {
				System.out.println("Compramos uma TV de 32 polegadas " + svtvdd);
			}
		}
	}
}
