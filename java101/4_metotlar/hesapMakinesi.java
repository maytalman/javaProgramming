package Giris4;

import java.lang.*;
import java.util.Scanner;

public class hesapMakinesi {

	static void sum() {
		int a,b;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Birinci sayi: ");
		a = input.nextInt();
		System.out.println("Ýkinci sayi: ");
		b = input.nextInt();
		
		System.out.println("Toplam: "+ (a+b));
		
	}
	static void minus( ) {
		@SuppressWarnings("resource")
		int a,b;
		Scanner input = new Scanner(System.in);
		System.out.println("Birinci sayi: ");
		a = input.nextInt();
		System.out.println("Ýkinci sayi: ");
		b = input.nextInt();
		
		System.out.println("Sonuç: "+ (a-b));
	}
	static void times( ) {
		int a,b;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Birinci sayi: ");
		a = input.nextInt();
		System.out.println("Ýkinci sayi: ");
		b = input.nextInt();
		
		System.out.println("Sonuç: "+ (a*b));
	}
	static void divided( ) {
		int a,b;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Birinci sayi: ");
		a = input.nextInt();
		System.out.println("Ýkinci sayi: ");
		b = input.nextInt();
		if(b == 0)System.out.println("sayýlar 0 'a bölünemez!");
		else
		System.out.println("Sonuç: "+ (a/b));
	}
	static void exp() {
		double a,b;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Birinci sayi: ");
		a = input.nextDouble();
		System.out.println("Ýkinci sayi: ");
		b = input.nextDouble();
		if(b == 0) System.out.println("Sonuç : 1");
		else
		System.out.println("Sonuç: "+ Math.pow(a,b));
	}
	static void fact() {
		int result =1;
		@SuppressWarnings("resource")
		int x;
		Scanner input = new Scanner(System.in);
		System.out.println("Birinci sayi: ");
		x = input.nextInt();
		
		for(int i=x;i>0;i--) {
			result*=i;
		}
		System.out.println("Sonuç: "+ result);
		
		
	}
	static void mod() {
		@SuppressWarnings("resource")
		int a,b;
		Scanner input = new Scanner(System.in);
		System.out.println("Birinci sayi: ");
		a = input.nextInt();
		System.out.println("Ýkinci sayi: ");
		b = input.nextInt();
		
		System.out.println("Sonuç: "+ (a%b));
	}
	static void alan() {
		@SuppressWarnings("resource")
		int a,b;
		Scanner input = new Scanner(System.in);
		System.out.println("Birinci sayi: ");
		a = input.nextInt();
		System.out.println("Ýkinci sayi: ");
		b = input.nextInt();
		
		System.out.println("Sonuç: "+ (a*b));
		
	}
	static void çevre( ) {
		int a,b;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Birinci sayi: ");
		a = input.nextInt();
		System.out.println("Ýkinci sayi: ");
		b = input.nextInt();
		
		System.out.println("Sonuç: "+ (2*a*b));;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int select;
		
		Scanner input = new Scanner(System.in);
		System.out.println("1-Toplama\n2-Çýkarma\n3-Çarpma\n4-Bölme\n5-Üslü Sayý Hesaplama\r\n"
				+ "6-Faktoriyel Hesaplama\r\n"
				+ "7-Mod Alma\r\n"
				+ "8-Dikdörtgen Alan ve Çevre Hesabý\nSeçiminiz? ");
		select =input.nextInt();
		
		switch(select) {
		case 1 : 
			sum();
			break;
		case 2 :
			minus();
			break;
		case 3 :
			times();
			break;
		case 4 : 
			divided();
			break;
		case 5: 
			exp();
			break;
		case 6: 
			fact();
			break;
		case 7:
			 mod();
			 break;
		case 8:
			alan();
			break;
		}

	}

}
