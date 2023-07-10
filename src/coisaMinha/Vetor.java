package coisaMinha;

public class Vetor {
	
	public static void main(String[] args) {
		
		final int top = 3;
		int[] nums = {2, 3, 8, 7, 6, 4, 1, 9, 5, 0};
		
		/*for(int i = 0; i < 10; i++){
			nums[i] = 0;
		}*/
		
		
		for(int i = 0; i < top; i++) {
			for(int c = 0; c < 10; c++) {
				if (nums[i] < nums[c]) {
					nums[i] = nums[c];
				}
			}//Fim do for c
			
		}//Fim do for i
		
		for(int i = 0; i < 10; i++) {
			System.out.print(nums[i] + " ");
			
		}//Fim do metodo Main
		
	}//Fim da classe Vetor
	
	
}
