package Giris2;

import java.util.Scanner;
//Basit Hesap Makinesi
public class pratik1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2,select;
		Scanner input = new Scanner(System.in);
		System.out.println("1-Toplama\n2-Çýkarma\n3-Çarpma\n4-Bölme\nSeçiminiz? ");
		select =input.nextInt();
		
		System.out.println("Birinci sayi: ");
		n1 = input.nextInt();
		System.out.println("Ýkinci sayi: ");
		n2 = input.nextInt();
		double bolum = n1/n2;
		switch(select) {
		case 1 : System.out.println("Toplam: "+ (n1+n2));break;
		case 2 : System.out.println("Fark: "+ (n1-n2));break;
		case 3 : System.out.println("Çarpým: "+ n1*n2);break;
		case 4 : 
			if(n2 == 0)System.out.println("sayýlar 0 'a bölünemez!");
			else System.out.println("Bölüm: "+bolum);
			break;
		}
		
	}

}
