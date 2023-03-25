package classesEMetodos;

public class Data {
	int dia;
	int mes;
	int ano;
	
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	Data(){
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		this(1, 1, 1970);
	}

	String obterDataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		System.out.printf("%d/%d/%d", dia, mes, ano);
		}
	static void qualquerCoisa() {
		Data a = new Data(3,5,8);
		System.out.println(a.dia);
	}
}
