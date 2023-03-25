package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		
		// Número para String
		Integer num1 = 1000;
		System.out.println(num1.toString().length());
		
		int num2 = 3000;
		System.out.println(Integer.toString(num2/2));
		
		// System.out.println("" + num2); // Não vale a pena usar
		
		// String para número
		
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro número: ");
		System.out.println(valor1);
		
		double duplo1 = Double.parseDouble(valor1);
		System.out.println(duplo1);
	}
}
