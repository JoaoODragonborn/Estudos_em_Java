package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	
	//Isso não é uma boa prática e foi feito apenas pra saber que existe
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("O tamanho é: " + conjunto.size());
		
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("O tamanho é: " + conjunto.size());

		conjunto.remove("Teste");
		
		System.out.println("O tamanho é: " + conjunto.size());
		
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains("Teste"));
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		conjunto.addAll(nums);
		
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
		
		
	}
}
