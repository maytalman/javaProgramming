package Giris2;

import java.util.*;
public class pratik5 {
// Girilen üç sayýyý büyükten küçüðe sýralayan kod
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,enBuyuk=0,ikinci=0,ucuncu=0;
		Scanner input = new Scanner(System.in);
		System.out.println("3 Sayý girin: ");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		if(a >b && a>c) {
			enBuyuk = a;
			if(b>c) {
				ikinci = b;
				ucuncu = c;
				}
			
			else {
				ikinci = c;
				ucuncu = b;
			}
		}
		else if(b >c && b>a) {
			enBuyuk = b;
			if(c>a) {
				ikinci = c;
				ucuncu = a;
				}
			
			else {
				ikinci = a;
				ucuncu = c;
			}
		}
		else if(c >b && c>a) {
			enBuyuk = c;
			if(b>a) {
				ikinci = b;
				ucuncu = a;
				}
			
			else {
				ikinci = a;
				ucuncu = b;
			}
		}
		System.out.println("  "+enBuyuk+ "  "+ ikinci + "  "+ucuncu);
	}

	}


