package Giris3;

import java.util.*;
public class mukemmelSayi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,sum=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Sayi giriniz: ");
		num=input.nextInt();
		
		for(int i =1;i<num;i++) {
			if(num%i==0) sum+=i;
				
		}
		if(sum== num)
		System.out.println(num+"  mükemmel sayidir ");
		else System.out.println(num+"  mükemmel sayi deðildir. ");
	}

}
