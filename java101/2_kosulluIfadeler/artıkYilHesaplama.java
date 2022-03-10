package Giris2;

import java.util.*;

//Artýk Yýl Hesaplama Kodu
public class artýkYilHesaplama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int yil;
		System.out.println("Yýl giriniz: ");
		yil = input.nextInt();
		
		if(yil %4 ==0) {
			System.out.println("Artýk yýldýr!");
		}
		else if(yil%400 ==0) System.out.println("Artýk yýldýr!");
		else System.out.println("Artýk bir yýl deðildir!");
		
		
	}

}
