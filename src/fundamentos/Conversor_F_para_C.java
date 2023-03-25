package fundamentos;

public class Conversor_F_para_C {
	public static void main(String[] args) {
		int fah = 0;
		final int numero = 32;
		final double divisao = 5.0/9.0;
		double celsius = (fah - numero)*divisao;
		System.out.println(fah + "°F é igual a " + celsius + "°C");
	}
}
