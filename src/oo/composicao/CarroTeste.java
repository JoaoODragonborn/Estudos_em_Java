package oo.composicao;

public class CarroTeste {
	
	public static void main (String[] args) {
		
		Carro c1 = new Carro();
		
		System.out.println(c1.estaLigado());
		c1.ligar();
		
		System.out.println(c1.estaLigado());
		
		for(int c = 0; c < 4; c++) {
			c1.acelerar();
		}
		
		System.out.println(c1.motor.giros());
		
		for(int c = 0; c < 2; c++) {
			c1.frear();
		}
		
		
		System.out.println(c1.motor.giros());
		
		//Faltou encapsulamento!;
		//c1.motor.FatorInjecao -= 30;
		
	}
	
}
