package Giris3;

import java.util.*;

public class pratik2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0,count=0;
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("Say� giriniz: ");
			n = input.nextInt();
			if(n%2==0 && n%4 ==0 ) {
				sum+=n;
			}
		}while(n % 2 ==0);
		System.out.println("toplam "+sum);
	}

}
