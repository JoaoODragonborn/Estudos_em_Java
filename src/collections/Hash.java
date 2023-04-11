package collections;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario("Carlos"));
		usuarios.add(new Usuario("João"));
		usuarios.add(new Usuario("Nina"));
		usuarios.add(new Usuario("Birb"));
		
		System.out.println(usuarios.contains(new Usuario("Birb")));
		
	}
}
