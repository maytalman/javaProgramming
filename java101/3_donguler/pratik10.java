package Giris3;

import java.util.*;
public class pratik10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//EKOK = (n1*n2) / EBOB
		int num1,num2,count=0,i=1,minNum,ebob=0,ekok=0;
		System.out.println("Birinci ve ikinci sayıyı girin : ");
		num1=input.nextInt();
		num2=input.nextInt();
		
		if(num1>num2)	minNum=num2;
		else 	minNum=num1;
		
		while(i<=minNum) {
			if(num1% i == 0 && num2%i == 0 ) {
				ebob = i;
			}
			i++;
		}
		ekok = (num1*num2) /ebob;
		System.out.println("İki sayının EBOB değeri: "+ebob);
		System.out.println("İki sayının EKOK değeri: "+ekok);

	}

}
