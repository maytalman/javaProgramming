package Giris2;

import java.util.*;
//S�cakl�k durumuna g�re aktivite belirten kod
public class pratik4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int heat;
		System.out.println("S�cakl��� girin: ");
		heat = input.nextInt();
		
		if(heat <5) System.out.println("Kaya�a gidebilirsiniz.");
		else if(heat>= 5 && heat<15) System.out.println("Sinemaya gidebilirsiniz.");
		else if(heat>= 15 && heat<25) System.out.println("Pikni�e gidebilirsiniz.");
		else if(heat>=25) System.out.println("Y�zme gidebilirsiniz.");
		
	}

}
