package arrays;

public class Foreach {
	public static void main(String[] args) {
		
		int[] inteiros = {21, 563, 144, 656};
		for(int i = 0; i < inteiros.length; i++) {
			System.out.print(inteiros[i] + " ");
		}
		System.out.println();
		for (int indice: inteiros) {
			System.out.print(indice + " ");
		}
		
		
	}
}
