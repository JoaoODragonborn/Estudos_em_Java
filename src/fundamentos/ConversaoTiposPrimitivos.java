package fundamentos;

public class ConversaoTiposPrimitivos {
	public static void main(String[] args) {
		double a = 1; //implicita
		System.out.println(a);
		
		float b = (float) 1.123456789; // Explícita (cast)
		System.out.println(b);
		
		int c = 114;
		byte d = (byte)c;
		System.out.println(d);
		
		double e = 1.9999;
		int f = (int) e;
		System.out.println(f);
		
	}
}
