package Giris3;

import java.util.*;
//Kullanıcı tek sayı girene kadar sayı alan ve alınan sayılardan 2'ye ve 4'e bölünenleri toplayan program
public class pratik2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0,count=0;
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("Sayý giriniz: ");
			n = input.nextInt();
			if(n%2==0 && n%4 ==0 ) {
				sum+=n;
			}
		}while(n % 2 ==0);
		System.out.println("toplam "+sum);
	}

}
