package Giris2;

import java.util.*;
//Sýcaklýk durumuna göre aktivite belirten kod
public class pratik4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int heat;
		System.out.println("Sýcaklýðý girin: ");
		heat = input.nextInt();
		
		if(heat <5) System.out.println("Kayaða gidebilirsiniz.");
		else if(heat>= 5 && heat<15) System.out.println("Sinemaya gidebilirsiniz.");
		else if(heat>= 15 && heat<25) System.out.println("Pikniðe gidebilirsiniz.");
		else if(heat>=25) System.out.println("Yüzme gidebilirsiniz.");
		
	}

}
