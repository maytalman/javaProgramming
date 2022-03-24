package Giris5;

import java.util.*;

public class tahminOyunu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int num = rand.nextInt(100);
		int selected,right=0,i=0;
		int [] prediction = new int[6];
		Scanner input = new Scanner(System.in);
		
		while(right <= 5) {
			System.out.println("Tahmininizi girin:\t");
			selected= input.nextInt();
			prediction[i]=selected;
			if(selected >100 || selected <0 ) {
				System.out.println("Lütfen 0-100 aralığında bir sayı giriniz!");
				right++;
			}
			else {
				if(selected > num) {
					System.out.println("Büyük bir tahminde bulundunuz.Kalan tahmin hakkınız: "+(5-right));
					right++;
				}
				else if(selected <num){
					System.out.println("Küçük bir tahminde bulundunuz.Kalan tahmin hakkınız: "+(5-right));
					right++;
				}
				else {
					System.out.println("Tebrikler, Doğru bildiniz!");
					break;
				}
			}
			i++;
		}
		if(right>=6) {
			System.out.println("Tahmin edemediniz!\nTahminleriniz:");
			System.out.println(Arrays.toString(prediction));
		}
		
	}

}
