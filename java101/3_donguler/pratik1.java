package Giris3;

import java.util.Scanner;

public class pratik1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int number,sum=0,count=0;
		double avg;
		
		System.out.println("Say� giriniz : ");
		number = input.nextInt();
		
		for(int i=0;i<number; i++) {
			if(i%3 == 0 && i%4 == 0) {
				System.out.println(" "+i);
				count++;
				sum +=i;
			}
		}
		avg = sum/count;
		System.out.println("��e ve D�rde B�l�nen say�lar�n ortalamas�: "+ avg);
	}

}
