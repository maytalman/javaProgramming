package Giris2;

import java.util.*;

public class zodyakHesaplama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year,zodyak;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Do�um y�l�n�z� girin : ");
		year = input.nextInt();
		
		zodyak = year%12;
		switch(zodyak) {
			case 0: System.out.println("Maymun");break;
			case 1: System.out.println("Horoz");break;
			case 2: System.out.println("K�pek");break;
			case 3: System.out.println("Domuz");break;
			case 4: System.out.println("Fare");break;
			case 5: System.out.println("�k�z");break;
			case 6: System.out.println("Kaplan");break;
			case 7: System.out.println("Tav�an");break;
			case 8: System.out.println("Ejderha");break;
			case 9: System.out.println("Y�lan");break;
			case 10: System.out.println("At");break;
			case 11: System.out.println("Koyun");break;
			}
	}

}
