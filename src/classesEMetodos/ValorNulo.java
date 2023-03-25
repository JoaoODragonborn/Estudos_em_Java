package classesEMetodos;

public class ValorNulo {
	public static void main(String[] args) {
		
		String s1 = "";
		System.out.println(s1.concat("!!!"));
		
		Data d1 = Math.random() > 0.5 ? new Data() : null;
		
		if (d1 != null) {
			System.out.println(d1.obterDataFormatada());
		}
		
		String d2 = Math.random() > 0.5 ? "Opa" : null;
		if (d2 != null) {
			System.out.println(d2.concat("???"));			
		}
		
	}
}
