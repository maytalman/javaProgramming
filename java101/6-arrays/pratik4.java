package Giris5;

public class pratik4 {
//Dizide tekrar eden sayýlarý bulan kod
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {56, 34, 1,9, 8, 101, -2,8, -33,8,9,34,8};
		int count =0;
		for(int i=0 ; i< arr.length; i++) {
			for(int k =i+1 ;k< arr.length;k++) {
				if(arr[i] == arr[k]) {
					count++;
				}
			
			}
			if(count != 0)	System.out.println(arr[i]+"\t");
			count =0;
				
		}
	}

}
