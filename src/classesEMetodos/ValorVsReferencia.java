package classesEMetodos;

public class ValorVsReferencia {
	public static void main(String[] args) {
		int a = 5;
		int b = a;
		
		a++;
		b--;
		
		System.out.printf("A = %d, B = %d.\n", a, b);
		
		Data d1 = new Data(34,567,2345);
		Data d2 = d1;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		d2.dia = 23;
		d1.mes = 8;
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		retornarParaDataInicial(d2);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		int c = 4;
		
		modificarPrimitivo(c);
		
		System.out.println(c);
	}
	
	static void retornarParaDataInicial(Data d){
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	static void modificarPrimitivo(int a){
		a++;
	}
	
}
