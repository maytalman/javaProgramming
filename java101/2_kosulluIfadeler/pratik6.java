package Giris2;

import java.util.*;
public class pratik6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int month, day;
		System.out.println("Do�um ay�n�z� girin:");
		month = input.nextInt();
		System.out.println("Do�um g�n�n�z� girin:");
		day = input.nextInt();
		switch(month) {
		case 1 : 
			if(day >=1 && day <=21) System.out.println("O�LAK ");
			else System.out.println("KOVA");
			break;
		case 2 : 
			if(day >=1 && day <=19) System.out.println("KOVA ");
			else System.out.println("BALIK");
			break;
			
		case 3 :
			if(day >=1 && day <=20) System.out.println("BALIK ");
			else System.out.println("KO�");
			break;
		case 4 : 
			if(day >=1 && day <=20) System.out.println("KO� ");
			else System.out.println("BO�A");
			break;
		case 5 : 
			if(day >=1 && day <=21) System.out.println("BO�A ");
			else System.out.println("�K�ZLER");
			break;
		case 6 : 
			if(day >=1 && day <=22) System.out.println("�K�ZLER ");
			else System.out.println("YENGE�");
			break;
		case 7 : 
			if(day >=1 && day <=20) System.out.println("YENGE� ");
			else System.out.println("ASLAN");
			break;
		case 8 : 
			if(day >=1 && day <=22) System.out.println("ASLAN ");
			else System.out.println("BA�AK");
			break;
		case 9 : 
			if(day >=1 && day <=22) System.out.println("BA�AK ");
			else System.out.println("TERAZ�");
			break;
		case 10 : 
			if(day >=1 && day <=22) System.out.println("TERAZ� ");
			else System.out.println("AKREP");
			break;
		case 11 : 
			if(day >=1 && day <=21) System.out.println("AKREP ");
			else System.out.println("YAY");
			break;
		case 12 : 
			if(day >=1 && day <=21) System.out.println("YAY ");
			else System.out.println("O�LAK");
			break;
	}
	}
}
