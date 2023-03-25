package estruturasDeControle;

public class DesafioFor {
	public static void main(String[] args) {
		
		//Fazer uma escada de "#" com for sem utilizar números
		
		String hash = "#";
		
		for(;!hash.equals("######"); hash += "#") {
			System.out.println(hash);
		}
		//String hash2 = hash+"#";
		//System.out.println(hash2);
		
		
	}
	
	
}
