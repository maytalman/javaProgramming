package Giris;

import java.util.Scanner;

public class pratik2 {
//KDV tutarı hesaplama kodu
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tutar=0;
		double kdv=0,kdvli;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Bir tutar giriniz: ");
		tutar = input.nextInt();
		
		if(tutar<1000) {
			kdv=0.18;
			kdvli =tutar + (tutar* kdv);
			
		}
		else {
			kdv=0.08;
			kdvli = tutar + (tutar* kdv);
		}
		System.out.println("KDV'siz tutar: "+tutar);
		System.out.println("KDV miktari: "+kdv);
		System.out.println("KDV'li tutar: "+kdvli);
	}

}
