package classesEMetodos.comidasEPessoas;

public class Pessoa {

	String nome;
	double peso;
	
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(Comida rango){
			peso = peso + rango.peso;
			System.out.printf("%s comeu %s"
					+ " e agora está pesando %.2f Kg.\n",
					nome, rango.nome, peso);
		
	}
}
