package Giris3;

public class tersUcgen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=10-1;i>=1;i--)
		{
			for(int j=1;j<=10-i;j++)
				System.out.print(" ");
			
			for(int j=1;j<=2*i-1;j++)
				System.out.print("*");
		
			System.out.println();
		}
		
	}

}
