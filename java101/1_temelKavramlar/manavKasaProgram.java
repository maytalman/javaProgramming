package Giris;

import java.util.Scanner;

//Kullan�c�lar�n manavdan alm�� olduklar� �r�nlerin kilogram de�erlerine g�re toplam tutar�n� ekrana yazd�ran kod
public class manavKasaProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double armutFiyat =2.14, elmaFiyat= 3.67, domatesFiyat= 1.11, muzFiyat= 0.95 ;
		double armutKilo,elmaKilo,muzKilo,domatesKilo, toplam =0 ;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Armut ka� kilo ? ");   armutKilo = input.nextDouble();
		System.out.println("Elma ka� kilo ? ");    elmaKilo = input.nextDouble();
		System.out.println("Muz ka� kilo ? ");     muzKilo = input.nextDouble();
		System.out.println("Domates ka� kilo ? "); domatesKilo = input.nextDouble();
		
		toplam = (armutFiyat* armutKilo )+ (elmaFiyat* elmaKilo )+(muzFiyat* muzKilo)+(domatesFiyat* domatesKilo );
		System.out.println("�demeniz gereken �cret : "+toplam);
	}

}
