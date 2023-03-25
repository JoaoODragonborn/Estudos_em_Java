package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		
		double media = 8;
		
		String resultadoParcial = media >= 5 ? 
				"em recuperação":"reprovado";
		
		String resultadoFinal = media >= 7 ? 
				"aprovado" : resultadoParcial;
		
		boolean bomComportamento = false;
		boolean temDesconto = media>= 7 && bomComportamento;
		String desconto = temDesconto ? 
				" e recebe desconto." : " e não recebe desconto.";
		
		System.out.println("O aluno está " 
		+ resultadoFinal + desconto);
		
	}
}
