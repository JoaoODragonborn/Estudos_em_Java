package estruturasDeControle;

public class For1 {
	public static void main(String[] args) {
		
		for (int count = 0; count <= 10; count++) {
			System.out.printf("i = %d\n", count);
		}
		
		int count2 = 12;
		for (;count2 <= 20;) {
			System.out.printf("i = %d\n", count2);
			count2 += 2;
		}
	}
}
