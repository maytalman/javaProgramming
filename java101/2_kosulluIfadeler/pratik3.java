package Giris2;

import java.util.Scanner;

public class pratik3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int turkce,mat,fizik,kimya,biyo;
		double avg;
		
		System.out.println("Türkçe notunuzu girin : ");
		turkce = input.nextInt();

		System.out.println("Matematik notunuzu girin : ");
		mat = input.nextInt();
		
		System.out.println("Fizik notunuzu girin : ");
		fizik = input.nextInt();

		System.out.println("Kimya notunuzu girin : ");
		kimya = input.nextInt();
		
		System.out.println("Biyoloji notunuzu girin : ");
		biyo = input.nextInt();
		
		avg =(mat+ turkce+ fizik+ kimya+ biyo)/5;
	    System.out.println("ortama : "+avg);
	}

}
