package coisaMinha;
import java.util.Scanner;

public class ComparadorDeString {
	
	public static void main(String[] args) {
		
		String a;
		String b;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro indivíduo");
		a = entrada.nextLine();
		System.out.println("Digite o segundo indivíduo");
		b = entrada.nextLine();
		entrada.close();
		
		if (a.equals(b)) {
			System.out.println("É tudo igual.");
		} else {
			System.out.println("É diferente.");
		}
		
	}
	
}
