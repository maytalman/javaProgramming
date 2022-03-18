package Giris4;
import java.util.*;
public class deseneUygunMetot {

	 static void metot(int sayi) {
	        System.out.print(sayi + " ");
	        if (sayi <= 0) return;
	        metot(sayi - 5);
	        System.out.print(sayi + " ");
	    }

	    public static void main(String[] args) {
	        int sayi;
	        Scanner giris = new Scanner(System.in);
	        System.out.printf("Bir sayý giriniz : ");
	        sayi = giris.nextInt();
	        metot(sayi);
	    }

}
