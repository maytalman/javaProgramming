package Giris5;

import java.util.Arrays;
//Dizi elemanlarının frekanslarını bulan kod
public class frekansDizi {
	static boolean kontrol(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] list = {10, 20, 20, 10, 10, 20, 5, 20};
		 int[] list2 = new int[list.length];
	        int count = 0;
	        int startIndex = 0;
	        for (int i = 0; i < list.length; i++) {
	            for (int j = 0; j < list.length; j++) {
	                if (list[i] == list[j]) {
	                    count++;
	                }
	            }if (!kontrol(list2,list[i])){
	                list2[startIndex++] = list[i];
	                System.out.println(list[i] + " sayisi " +  count + " kere tekrar edildi");
	            }
	            count = 0;
	        }

}
}
