package collections;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		
		ArrayList<Usuario> personagensVivos = new ArrayList<Usuario>();
		
		Usuario u1 = new Usuario("Neo");
		
		personagensVivos.add(u1);
		personagensVivos.add(new Usuario("Trinity"));
		personagensVivos.add(new Usuario("Morpheus"));
		personagensVivos.add(new Usuario("Tank"));
		personagensVivos.add(new Usuario("Switch"));
		personagensVivos.add(new Usuario("Apoc"));
		
		
		System.out.println(personagensVivos.get(1).nome);

		System.out.println(">>>>>" + personagensVivos.remove(5));
		System.out.println(personagensVivos.remove(new Usuario("Switch")));
		
		System.out.println("Tem? " + personagensVivos.contains(new Usuario("Mouse")));
		
		
		for(Usuario u: personagensVivos) {
			System.out.println(u);
		}
		
	}
}
