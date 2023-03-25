package classesEMetodos.comidasEPessoas;

public class Jantar {
	public static void main(String[] args) {
		
		Pessoa joao = new Pessoa ("Joao", 70);
		Pessoa carlos = new Pessoa ("Carlos", 80);
		Pessoa nina = new Pessoa ("nina", 5);
		
		Comida arroz = new Comida ("Arroz", 0.25);
		Comida feijao = new Comida ("Feijao", 0.2);
		Comida abobora = new Comida ("Abobora", 0.15);
		Comida carne = new Comida ("carne", 0.2);
		
		
		
		joao.comer(arroz);
		joao.comer(feijao);
		joao.comer(carne);
		carlos.comer(arroz);
		carlos.comer(abobora);
		carlos.comer(feijao);
		nina.comer(carne);
		
		
	}
}
