package Giris3;

import java.util.*;
public class pratik7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		double start=0.0;
		Scanner input=new Scanner(System.in);
		
		System.out.println("n sayýsýný girin: ");
		n = input.nextInt();
		
		for(int i=1;i<=n;i++) {
			start = (1.0/i)+ start;
		}
		System.out.println(start);
	}

}
