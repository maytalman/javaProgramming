package Giris;

import java.util.Scanner;

// Açılış ücreti 10 TL ve KM başına 2.20 TL alınan bir takside taksimetre tutarını hesaplayan kod
public class pratik4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int acilis=10,mesafe=0;
		double kmFiyat=2.20,toplam;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Mesafe bilgisi giriniz: ");
		mesafe = input.nextInt();
		
		toplam = acilis+ (kmFiyat*mesafe);
		if (toplam <20) toplam =20;
		
		System.out.println("Ödenmesi gereken :"+toplam+" TL");
	}

}
