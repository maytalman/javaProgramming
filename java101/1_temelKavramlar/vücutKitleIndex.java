package Giris;
import java.util.Scanner;
import java.lang.*;

//V�cut kitle indeksi hesaplama 
public class v�cutKitleIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double boy, kilo,index;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Boyunuzu girin:");
		boy = input.nextDouble();
		System.out.println("Kilonuzu girin:");
		kilo = input.nextDouble();
		
		index = kilo /(boy * boy) ;
		System.out.println("V�cut Kitle indeksiniz "+ index);
		 
	}

}
