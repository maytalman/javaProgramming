package Giris4;

import java.util.*;
public class recursivePow {

	static int Pow(int base,int exp) {
		if(exp == 0) return 1;
		else
		return base* Pow(base,exp-1);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base,exp;
		Scanner input = new Scanner(System.in);
		System.out.println("taban ve üst sayýyý girin : ");
		base = input.nextInt();
		exp = input.nextInt();
		System.out.println("Sonuç:  "+Pow(base,exp));
	}

}
