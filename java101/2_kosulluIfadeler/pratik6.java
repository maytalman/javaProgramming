package Giris2;

import java.util.*;
public class pratik6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int month, day;
		System.out.println("Doğum ayınızı girin:");
		month = input.nextInt();
		System.out.println("Doğum gününüzü girin:");
		day = input.nextInt();
		switch(month) {
		case 1 : 
			if(day >=1 && day <=21) System.out.println("OĞLAK ");
			else System.out.println("KOVA");
			break;
		case 2 : 
			if(day >=1 && day <=19) System.out.println("KOVA ");
			else System.out.println("BALIK");
			break;
			
		case 3 :
			if(day >=1 && day <=20) System.out.println("BALIK ");
			else System.out.println("KOÇ");
			break;
		case 4 : 
			if(day >=1 && day <=20) System.out.println("KOÇ ");
			else System.out.println("BOĞA");
			break;
		case 5 : 
			if(day >=1 && day <=21) System.out.println("BOĞA ");
			else System.out.println("İKİZLER");
			break;
		case 6 : 
			if(day >=1 && day <=22) System.out.println("İKİZLER ");
			else System.out.println("YENGEÇ");
			break;
		case 7 : 
			if(day >=1 && day <=20) System.out.println("YENGEÇ ");
			else System.out.println("ASLAN");
			break;
		case 8 : 
			if(day >=1 && day <=22) System.out.println("ASLAN ");
			else System.out.println("BAŞAK");
			break;
		case 9 : 
			if(day >=1 && day <=22) System.out.println("BAŞAK ");
			else System.out.println("TERAZİ");
			break;
		case 10 : 
			if(day >=1 && day <=22) System.out.println("TERAZİ ");
			else System.out.println("AKREP");
			break;
		case 11 : 
			if(day >=1 && day <=21) System.out.println("AKREP ");
			else System.out.println("YAY");
			break;
		case 12 : 
			if(day >=1 && day <=21) System.out.println("YAY ");
			else System.out.println("OĞLAK");
			break;
	}
	}
}
