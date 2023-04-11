package oo.composicao;

public class Motor {
	
	boolean ligado = false;;
	double fatorInjecao = 1.20005;
	
	double giros() {
		if(!ligado) {
			return 0;
		} else {
			return (int) Math.round(fatorInjecao * 3000);
		}
	}
}
