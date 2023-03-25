package fundamentos;

import java.util.Scanner;

public class TiposStringsEquals {
	public static void main(String[] args) {
		
		// O ideal é não comparar strings com "==";
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		System.out.println(s1 == "2");
		
		// Para comparar strings o ideal é usar o ".equals"
		
		System.out.println("2".equals(s1));
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.nextLine();
		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2.trim()));
		// Usando "next" ao invés de "nextLine" não 
		// há a necessidade de usar "trim()";
		entrada.close();
	}
}
