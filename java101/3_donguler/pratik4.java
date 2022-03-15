package Giris3;

import java.util.*;

public class pratik4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
//C(n,r) = n! / (r! * (n-r)!)
		int n,r,payda,n1=1,r1=1;
		double sonuc;
		System.out.println("C(n, r) : ");
		n= input.nextInt();
		r = input.nextInt();
		payda = n-r;
		
		for(int i =1; i<=n ; i++) {
			n1=n1*i;
		}
			
			for(int j =1; j<=r ; j++) {
				r1=r1*j;
			}
				
				for(int k =1; k<=payda; k++) {
					payda=payda*k;
				}
				payda = r1*payda;
				sonuc = n1 /payda;
				System.out.println("C(n,r) = "+ sonuc);	
		
			

	}

}
