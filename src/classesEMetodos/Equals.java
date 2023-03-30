package classesEMetodos;

public class Equals {

	public static void main(String[] args) {
		
		// Apesar de possuir os mesmos atributos, se compararmos os dois 
		// objetos seja com "==" ou com "equals", o java não reconhecerá
		// esses objetos como iguais pq o endereço de memória dos objetos 
		// é diferente. Para driblar essa situação podemos fazer com que o 
		// método equals compara cada atributo. Ver classe "Usuario".
		
		Usuario u1 = new Usuario();
		u1.nome = "Pedro Silva";
		u1.email = "pedro.silva@ezemail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Pedro Silva";
		u2.email = "pedro.silva@ezemail.com";
		
		System.out.println(u1==u2);
		System.out.println(u1.equals(u2));
		
		// Se compararmos os atributos dos objetos diretamente, o resultado 
		// será sempre verdadeiro, mas o método equals já foi alterado para
		// fazer isso e retornar se o objeto realmente é igual.  
		
		System.out.println(u1.nome == u2.nome);
		System.out.println(u1.nome.equals(u2.nome));
		
		System.out.println(u1.hashCode());
		
	}
}
