package fundamentos;

public class Wrapper {
	public static void main(String[] args) {
		// Tipos primitivos não podem ser tratados com ".",
		// logo precisamos usar Wrappers para tratá-los dessa forma
		// Wrappers são a "versão classe" dos tipos primitivos.
		
		Byte b = 100; // byte
		Short s = 1000; // short
		Integer i = 10000; // int
		Long l = 1000000L; // long
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i*3);
		System.out.println(l/3);
		
		Float f = 123.123F; // float
		System.out.println(f);
		
		Double d = 1234.12345; // double
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; // char
		System.out.println(c+"...");
		
		
	}

}
