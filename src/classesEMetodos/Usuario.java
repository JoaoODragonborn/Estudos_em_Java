package classesEMetodos;

public class Usuario {

	String nome;
	String email;
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Usuario) {
			
			Usuario outro = (Usuario) obj;
			
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			
			return nomeIgual && emailIgual;
		} else {
			
			return false;
		}
	}
	
	// Testando esse tal de hashCode
	@Override
	public int hashCode() {
		int codigo = nome.length();
		return codigo;
	}
	
	// O Eclipse tem um método próprio para implementar hashcode e equals
	// muito bolados. Ver "Source" no menu.
	
}
