package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("Calculo com Geometria Analítica");
		livros.push("Calculo Volume 2");
		livros.push("Probabilidade e Estatística para Engenharia e Cièncias");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		//System.out.println(livros.remove());
		//System.out.println(livros.pop());
		
		System.out.println(livros.size());
		
	}
}
