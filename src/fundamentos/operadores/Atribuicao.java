package fundamentos.operadores;

public class Atribuicao {
	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		
		System.out.println(c);
		
		c += b; // c = c + b;
		c -= b; // c = c - b;
		c *= b; // c = c * b;
		c /= b; // c = c / b;
		c++;    // c = c + 1;
		c %= b; // c = c % b;
		
	}
}
