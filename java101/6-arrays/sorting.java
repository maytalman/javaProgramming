package Giris5;

import java.util.*;
public class sorting {
//Kullanıcıdan alınan listeyi sıralama
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		Scanner input = new Scanner (System.in);
		System.out.println("Boyut bilgisi giriniz: ");
		size= input.nextInt();
		
		int [] list= new int[size];
		for(int i=0; i<size; i++) {
			System.out.println(""+(i+1)+". sayıyı giriniz: ");
			list[i] = input.nextInt();
		}
		System.out.println("Girilen dizi:\t"+Arrays.toString(list));
		Arrays.sort(list);
		System.out.println("Sıralanan dizi:\t"+ Arrays.toString(list));
	}

}
