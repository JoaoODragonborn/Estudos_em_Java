package fundamentos;

public class Notacao_Ponto {
	public static void main(String[] args) {

		String b = "Bom dia X";
		b = b.replace("X", "Senhor(a)");
		b = b.toUpperCase();
		b = b.concat("!!!");
		
		System.out.println(b);
		
		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		String y = "bom dia X"
				.replace("X", "A TODOS")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		//Tipos primitivos não tem o operador ".";
		
	}
}
