package Giris3;
import java.util.*;
public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        int n1=0,n2=1,n3,i,n;
        System.out.print("N Sayýsýný Girin:");
        n = input.nextInt();
        System.out.print(n1+" "+n2);
  
        for(i=2;i<n;++i) {  
        	
		   n3=n1+n2;  
		   System.out.print(" "+n3);  
		   n1=n2;  
		   n2=n3;  
		    }
		 System.out.println();
		    }
	}


