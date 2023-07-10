package arrays;

public class Teste {
    public static void main(String[] Args){
        System.out.println("nananana");

        double[] nums = new double[10];
        
        nums[0] = 1;
        nums[1] = 0.5;
        nums[2] = 0.25;
        
        for(int i = 0; i < 10; i++) {
        	nums[i] = (double) 1/(i+1);
        }
        
        for(double i: nums) {
        	System.out.println(i);
        }
    }
}
