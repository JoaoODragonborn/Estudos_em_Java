package fundamentos;

import java.util.Date;

public class Tipo_String {
	public static void main(String[] args) {
		
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa Tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa tarde"));
		
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		System.out.println(s.equalsIgnoreCase("BOA TARDE"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12450.69;
		
		String maisUmaFrase = "Nome: " + nome + 
				"\nSobrenome: " + sobrenome + 
				"\nIdade: " + idade + 
				"\nSalário: " + salario;
		System.out.println(maisUmaFrase);
		
		System.out.printf("O senhor %s %s tem %d anos e recebe R$ %.2f", 
				nome, sobrenome, idade, salario);
		String frase = String.format("\nO senhor %s %s tem %d anos e recebe R$ %.2f", 
				nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		String texto = "Frase qualquer";
		
		System.out.println(texto.contains("qual"));
		System.out.println(texto.indexOf("qual"));
		System.out.println(texto.substring(5));
		System.out.println(texto.substring(4, 8));
		
		Date data = new Date();
		System.out.println(data);
		System.out.println(data.getHours());
		System.out.println(data.getClass().getSimpleName());
		
		
		int hora = new Date().getHours();
		
		if (hora <= 11 && hora >= 6) {
			System.out.println("Bom dia!");
		} else if (hora >= 12 && hora <= 17) {
			System.out.println("Boa Tarde");
		} else if (hora >= 18 && hora <= 24) {
			System.out.println("Boa Noite");
		} else {
			System.out.println("Boa Madruga");
		}
	}
}
