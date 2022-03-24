package Giris5;

import java.util.*;
public class pratik1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		double start=0.0;
		Scanner input=new Scanner(System.in);
		
		System.out.println("n sayısını girin: ");
		n = input.nextInt();
		
		for(int i=1;i<=n;i++) {
			start = (1.0/i)+ start;
		}
		System.out.println(start);
	}

}
