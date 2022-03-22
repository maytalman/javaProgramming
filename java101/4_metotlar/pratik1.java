
package Giris4;
//Palindrom sayıları kontrol eden program kodu
import java.util.*;
public class pratik1 {//2563
	static boolean isPalindrom(int Num) {
		int temp=Num,reversNum=0,lastNum;
		while(temp!=0) {
			lastNum = temp%10;
			reversNum = (reversNum * 10) + lastNum;
			temp = temp/10;
		}
		if(Num == reversNum)	return true;
		else 	return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Num;
		Scanner input = new Scanner(System.in);
		System.out.println("Palindromluk kontrolü yapacaðýnýz sayýyý giriniz: ");
		Num = input.nextInt();
		
		if(true == isPalindrom(Num)) {
			System.out.println("Palindromdur");
		}
		else System.out.println("Palindrom deðildir.");

	}

}
