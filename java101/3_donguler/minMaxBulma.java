package Giris3;
import java.util.*;
public class minMaxBulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,min=0,max=0,i=0,num;
		Scanner input=new Scanner(System.in);
		
		System.out.println("ka� adet say� girilecek?");
		n=input.nextInt();
		
		while(i<n) {
			System.out.println("say� giriniz: ");
			num = input.nextInt();
			if(num> max) {
				max=num;
			}
			else if(num<min) {
				min=num;
			}
			i++;
		}
		System.out.println("min: "+min+ "\nmax: "+max);
	}

}
