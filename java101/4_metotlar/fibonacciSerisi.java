package Giris4;

public class fibonacciSerisi {
	 public static int getFibonacci(int n) {
		    
	        if (n == 0) 
	            return 0;
	        else if (n == 1) {
	            return 1;
	            }
	        else {
	        	return getFibonacci(n - 1) + getFibonacci(n - 2);
	        }
	        	
	            
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int fibonacciNumber = getFibonacci(3);
	        System.out.println(fibonacciNumber);
	    }

	   

}
