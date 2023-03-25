package classesEMetodos;

public class Produto {
	String nome;
	double preco;
	static double desconto;
	
	Produto(){
		
	}
	
	Produto(String nomeInicial, double precoInicial, 
			double descontoInicial){
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
	}
	
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	double precoComDesconto(double descontoGerente) {
		return preco * (1 - (desconto + descontoGerente));
	}
}
