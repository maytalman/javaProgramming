package Giris5;

import java.util.*;
public class palindrom {
	
	
	static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word;
		Scanner input=new Scanner(System.in);
		System.out.println("Bir kelime giriniz: ");
		word = input.next();
		
		if(isPalindrome(word)) {
			System.out.println("Palindrom kelimedir.");
		}
		else {
			System.out.println("Palindrom değildir.");
		}
	}

}
