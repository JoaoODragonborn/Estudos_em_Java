package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		//Offer e add adicionam elementos a lista;
		//Porém offer checa se é possível fazer isso;
		//E add tenta add os elementos, pode dar erro.
		
		fila.add("James Stewart");
		fila.offer("Jon Rogawski");
		fila.add("Anton Howard");
		fila.offer("Thomas H.B.");
		fila.add("Swokowski");
		fila.offer("Leithold");
		
		// Peek e Element pegam o primeiro elemento da fila
		// Peek verifica, Element faz à força
		
		System.out.println(fila.peek()); 
		System.out.println(fila.peek());
		
		System.out.println(fila.element());
		System.out.println(fila.element());
		
		// Pool e Remove obtém e remove o primeiro elemento
		// Pool verifica e Remove faz à força
		
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
		// fila.size();
		// fila.clear();
		// fila.isEmpty();
		// fila.contains();
		
	}
}
