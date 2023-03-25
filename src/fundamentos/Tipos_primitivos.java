package fundamentos;

public class Tipos_primitivos {
	
	public static void main(String[] args) {
		
	//Dados de um funcionário
	
	//Tipos numéricos inteiros
	byte anosDeEmpresa = 23;
	short numeroDeVoos = 542;
	int id = 56789;
	long pontosAcumulados = 3234645223L; // 3.234.645.223
	// Precisa colocar o L no final do valor acimade 2.000.000.000
	
	//Tipos numéricos reais
	float salario = 11443.44F;
	double vendasAcumuladas = 2_991_797_103.01;
	
	//Tipo booleano
	boolean estaDeFerias = false; //true;
	
	//tipo caractere
	char status = 'A'; //ativo
	
	//Dias de empresa
	System.out.println(anosDeEmpresa * 365);
	
	//Número de viagens
	System.out.println(numeroDeVoos * 0.5);
	
	//Pontos por real
	System.out.println(pontosAcumulados/vendasAcumuladas);
	
	System.out.println(id +": ganha " + salario);
	System.out.println("Férias: " + estaDeFerias);
	System.out.println("Status: " + status);
	}
}
