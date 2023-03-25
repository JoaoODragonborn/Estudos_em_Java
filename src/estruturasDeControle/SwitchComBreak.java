package estruturasDeControle;

public class SwitchComBreak {
	public static void main(String[] args) {
		
		int nota = 0;
		String mencao;
		
		switch(nota) {
		case 10: case 9:
			mencao = "SS";
			break;
		case 8:
		case 7:
			mencao = "MS";
			break;
		case 6:
		case 5:
			mencao = "MM";
			break;
		case 4:
		case 3:
			mencao = "MI";
			break;
		case 2:
		case 1:
			mencao = "II";
			break;
		default:
			mencao = "SR";
			break;
			
		}
		System.out.println(mencao);
		
	}
}
