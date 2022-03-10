package Giris2;

import java.util.*;

//Uçak bileti fiyatý hesaplama programý
public class ucakBiletiFiyati {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mesafe, yas,yolculukTipi;
		double kmFiyat = 0.1;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Mesafeyi km cinsinden giriniz : ");
		mesafe = input.nextInt();
		if(mesafe<0) System.out.println("yanlýþ deðer girdiniz!");
		
		System.out.println("Yaþýnýzý giriniz : ");
		yas = input.nextInt();
		if(yas<0) System.out.println("yanlýþ deðer girdiniz!");
		
		System.out.println("Yolculuk tipiniz Gidiþ-Dönüþ ise 1, Tek yön ise 2 giriniz : ");
		yolculukTipi = input.nextInt();
		if(yolculukTipi!=1 && yolculukTipi !=2) System.out.println("yanlýþ deðer girdiniz!");
		
		double tam,yasIndirim=0.0, tipIndirim=0.0,toplamFiyat=0.0;
		tam =mesafe*kmFiyat;
		System.out.println("Normal tutar : "+tam+ " TL");
		
		if(yas<12) {
			yasIndirim = tam*0.5;
			System.out.println("yas indirimi "+ yasIndirim);
		}
		else if(yas>12 && yas<24) {
			yasIndirim =tam*0.1;
			System.out.println("yas indirimi "+ yasIndirim);
			}
		
		else if(yas>65) {
			yasIndirim =tam * 0.3;
			System.out.println("yas indirimi "+ yasIndirim);
		}
		if(yolculukTipi == 1) {
			tipIndirim = tam*0.2;
			System.out.println("Yolculuk tipi indirimi "+ tipIndirim);
		}
		
		toplamFiyat = tam-yasIndirim-tipIndirim;
		
		System.out.println(toplamFiyat);
		
	}

}
