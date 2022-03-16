package Giris3;

import java.util.*;
public class pratik8 {
	//Elmas deseni çizen program

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        System.out.println("Bir Sayý Giriniz :");
        int n = input.nextInt();
        
        int yariyukseklik=(int)(n/2)+1;
		
		for(int i=1;i<=yariyukseklik;i++)
		{
			for(int j=1;j<=yariyukseklik-i;j++)
				System.out.print(" ");
			
			for(int j=1;j<=2*i-1;j++)
				System.out.print("*");
			
			System.out.println();
		}

		for(int i=yariyukseklik-1;i>=1;i--)
		{
			for(int j=1;j<=yariyukseklik-i;j++)
				System.out.print(" ");
			
			for(int j=1;j<=2*i-1;j++)
				System.out.print("*");
		
			System.out.println();
		}
		
	}
}

