package Giris;

import java.util.Scanner;

//Kullanýcýlarýn manavdan almýþ olduklarý ürünlerin kilogram deðerlerine göre toplam tutarýný ekrana yazdýran kod
public class manavKasaProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double armutFiyat =2.14, elmaFiyat= 3.67, domatesFiyat= 1.11, muzFiyat= 0.95 ;
		double armutKilo,elmaKilo,muzKilo,domatesKilo, toplam =0 ;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Armut kaç kilo ? ");   armutKilo = input.nextDouble();
		System.out.println("Elma kaç kilo ? ");    elmaKilo = input.nextDouble();
		System.out.println("Muz kaç kilo ? ");     muzKilo = input.nextDouble();
		System.out.println("Domates kaç kilo ? "); domatesKilo = input.nextDouble();
		
		toplam = (armutFiyat* armutKilo )+ (elmaFiyat* elmaKilo )+(muzFiyat* muzKilo)+(domatesFiyat* domatesKilo );
		System.out.println("Ödemeniz gereken ücret : "+toplam);
	}

}
