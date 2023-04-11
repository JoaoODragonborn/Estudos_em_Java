package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	public static void main(String[] args) {
		
		
		//Aceita ordenação:
		SortedSet<String> listaAprovados = new TreeSet<String>();
		
		listaAprovados.add("Carlos");
		listaAprovados.add("João");
		listaAprovados.add("Nina");
		listaAprovados.add("Birb");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		
		//Não aceita ordenação:
		Set<Integer> nums = new HashSet<>();
		nums.add(23);
		nums.add(57);
		nums.add(3);
		nums.add(2);
		
		for (int n: nums) {
			System.out.println(n);
		}
		
	}
}
