package Giris3;

import java.util.*;
public class pratik3 {
//Girilen sayıya kadar 4'ün ve 5'in kuvvetlerini yazdıran program
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int num;
		System.out.println("Bir sayý girin: ");
		num = input.nextInt();
		
		for(int i=1, j=1; i<num && j<num; i*=4, j*=5) {
			System.out.println(i);
			System.out.println(j);
		}

	}

}
