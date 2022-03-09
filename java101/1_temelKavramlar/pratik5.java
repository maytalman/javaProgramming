package Giris;

import java.util.Scanner;
import java.lang.*;

public class pratik5 {

//Yarý çapý girilen dairenin alanýný ve çevresini hesaplayan kod
	//Yarýçapý r, merkez açýsýnýn ölçüsü a olan daire diliminin alaný bulan program
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
		
		System.out.println("Yarýçapý ve merkez açý ölçüsünü giriniz: ");
		r = input.nextInt()	;
		a = input.nextInt();
		
		System.out.println("Dairenin çevresi: "+ cevreHesapla(r)+"\nDairenin Alaný : "+alanHesapla(r));
		System.out.println("Daire Diliminin ALaný : "+ daireDilimiHesapla(r,a));
		
	}

}
