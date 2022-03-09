package Giris;

import java.util.Scanner;
import java.lang.*;
public class pratik3 {
//Üç kenarý girilen üçgenin alanýný hesaplayan kod
	static int cevreBul(int a,int b,int c) {
		return a+b+c;
	}
	public static double alanBul(int a,int b,int c) {
		double alan;
		float u=cevreBul(a,b,c)/2;
		
		alan =u* (u-a)* (u-b) * (u-c) ;
		alan = Math.sqrt(alan);
		return alan;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int kenar1=0, kenar2=0, kenar3=0;
		
		System.out.println("1.kenarý giriniz: ");
		kenar1 = input.nextInt();
		
		System.out.println("2.kenarý giriniz: ");
		kenar2 = input.nextInt();
		
		System.out.println("3.kenarý giriniz: ");
		kenar3 = input.nextInt();
		
		System.out.println("Üçgen alaný : "+ alanBul(kenar1,kenar2,kenar3));
		
		}

}
