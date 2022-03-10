package Giris2;

import java.util.*;
//Çin Zodyağı Hesaplama
public class zodyakHesaplama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year,zodyak;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Dođum yýlýnýzý girin : ");
		year = input.nextInt();
		
		zodyak = year%12;
		switch(zodyak) {
			case 0: System.out.println("Maymun");break;
			case 1: System.out.println("Horoz");break;
			case 2: System.out.println("Köpek");break;
			case 3: System.out.println("Domuz");break;
			case 4: System.out.println("Fare");break;
			case 5: System.out.println("Öküz");break;
			case 6: System.out.println("Kaplan");break;
			case 7: System.out.println("Tavţan");break;
			case 8: System.out.println("Ejderha");break;
			case 9: System.out.println("Yýlan");break;
			case 10: System.out.println("At");break;
			case 11: System.out.println("Koyun");break;
			}
	}

}
