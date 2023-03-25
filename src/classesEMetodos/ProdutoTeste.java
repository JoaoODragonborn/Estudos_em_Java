package classesEMetodos;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 2500, 0.15);
		
		Produto p2 = new Produto("Celular", 3000);
		
		Produto p3 = new Produto("Carro", 60000, 0.2);
		
		Produto.desconto = 0.25;
		
		System.out.println(p1.precoComDesconto());
		System.out.println(p2.precoComDesconto());
		System.out.println(p3.precoComDesconto());
		
		/*
		System.out.println(p1.nome);
		System.out.println(p1.preco);
		System.out.printf("Preço com desconto: R$%.2f\n", precoFinal1); 
		
		System.out.println(p2.nome);
		System.out.println(p2.preco);
		System.out.printf("Preço com desconto: R$%.2f\n", precoFinal2);
		System.out.printf("Preço com desconto: R$%.2f\n", p2.precoComDesconto());
		System.out.printf("Preço com desconto do gerente: R$%.2f\n", p2.precoComDesconto(0.15));
		
		System.out.printf("Total do carrinho: R$%.2f\n", p2.preco + p1.preco);
		*/
		
	}
}
