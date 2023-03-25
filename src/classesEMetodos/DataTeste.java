package classesEMetodos;

public class DataTeste {
	
	public static void main(String[] args) {
	
		Data data = new Data();
		data.dia = 15;
		data.mes = 06;
		data.ano = 2023;
		
		Data data2 = new Data(16 ,05,4050);
		
		Data data3 = new Data();
		
		//System.out.println(data.obterDataFormatada());
		data.imprimirDataFormatada();
		data2.imprimirDataFormatada();
		data3.imprimirDataFormatada();
		
		//Data.dia = 2;
		//System.out.println(Data.dia);
		
		Data.qualquerCoisa();
		
		
	}
}
