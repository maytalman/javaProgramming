package Giris;

import java.util.Scanner;
import java.lang.*;

public class pratik5 {

//Yar� �ap� girilen dairenin alan�n� ve �evresini hesaplayan kod
	//Yar��ap� r, merkez a��s�n�n �l��s� a olan daire diliminin alan� bulan program
	static double cevreHesapla(double r ) {
	      return Math.PI * 2 * r;
	 }
	 public static double alanHesapla(double r) {
	      return Math.PI * Math.pow(r,2);
	 }
	 public static double daireDilimiHesapla(double r,double a) {
		 return (Math.PI* (r* r) * a) / 360;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=0, a =0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Yar��ap� ve merkez a�� �l��s�n� giriniz: ");
		r = input.nextInt()	;
		a = input.nextInt();
		
		System.out.println("Dairenin �evresi: "+ cevreHesapla(r)+"\nDairenin Alan� : "+alanHesapla(r));
		System.out.println("Daire Diliminin ALan� : "+ daireDilimiHesapla(r,a));
		
	}

}
