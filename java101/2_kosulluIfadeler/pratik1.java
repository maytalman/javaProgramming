package Giris2;

import java.util.Scanner;
//Basit Hesap Makinesi
public class pratik1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1, n2,select;
		Scanner input = new Scanner(System.in);
		System.out.println("1-Toplama\n2-��karma\n3-�arpma\n4-B�lme\nSe�iminiz? ");
		select =input.nextInt();
		
		System.out.println("Birinci sayi: ");
		n1 = input.nextInt();
		System.out.println("�kinci sayi: ");
		n2 = input.nextInt();
		double bolum = n1/n2;
		switch(select) {
		case 1 : System.out.println("Toplam: "+ (n1+n2));break;
		case 2 : System.out.println("Fark: "+ (n1-n2));break;
		case 3 : System.out.println("�arp�m: "+ n1*n2);break;
		case 4 : 
			if(n2 == 0)System.out.println("say�lar 0 'a b�l�nemez!");
			else System.out.println("B�l�m: "+bolum);
			break;
		}
		
	}

}
