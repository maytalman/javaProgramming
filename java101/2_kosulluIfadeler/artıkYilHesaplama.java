package Giris2;

import java.util.*;

//Art�k Y�l Hesaplama
public class art�kYilHesaplama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int yil;
		System.out.println("Y�l giriniz: ");
		yil = input.nextInt();
		
		if(yil %4 ==0) {
			System.out.println("Art�k y�ld�r!");
		}
		else if(yil%400 ==0) System.out.println("Art�k y�ld�r!");
		else System.out.println("Art�k bir y�l de�ildir!");
		
		
	}

}
