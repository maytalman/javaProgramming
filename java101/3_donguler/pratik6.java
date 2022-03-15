package Giris3;

import java.util.*;
public class pratik6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1645,bin,yuz,on,bir,toplam;
		bin= num / 1000;
		yuz = num/100;
		yuz = yuz%10;
		on= num/10;
		on = on%10;
		bir = num%10;
		toplam = bin+yuz+on+bir;
		System.out.println(toplam);
	}

}
