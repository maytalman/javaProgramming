package Giris5;

import java.util.Arrays;

public class pratik2 {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {56, 34, 1, 8, 101, -2, -33};
	
		Arrays.sort(arr);
		
		for (int i =0 ; i< arr.length;i++) {
			if(i ==0 ) {
				System.out.println("Min :\t"+arr[i]);
			}
			else if(i==arr.length-1) {
				System.out.println("Max:\t"+arr[i]);
			}
			
		}
	}

}
