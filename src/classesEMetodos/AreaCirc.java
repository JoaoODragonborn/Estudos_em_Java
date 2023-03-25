package classesEMetodos;

public class AreaCirc {
	
	final static double pi = Math.PI;
	double raio;
	
	AreaCirc(double novoRaio){
		raio = novoRaio;
	}
	
	double Area() {
		return Math.pow(raio, 2) * pi;
	}
	
	static double area(double raio) {
		return Math.pow(raio, 2) * pi;
	}
	
}
