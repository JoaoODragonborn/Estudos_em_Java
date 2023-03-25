package fundamentos.operadores;

public class DesafioAritmético {
	public static void main(String[] args) {
		
		int a = 2 + 3 * 4;
		int b = (int)Math.pow(a, 3); // Math.pow retorna uma valor em double
		System.out.println(b);
		
		var conta1 = Math.pow(6*(3+2), 2)/(3*2);
		
		var conta2 = Math.pow(((1-5)*(2-7))/2, 2);
		
		var conta3 = Math.pow(10, 3);
		
		var resultado = (int)(Math.pow(conta1 - conta2 ,3)/conta3);
		
		System.out.println(resultado);
		
	}
}
