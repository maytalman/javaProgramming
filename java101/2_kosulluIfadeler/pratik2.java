package Giris2;

import java.util.Scanner;
//Kullanýcý adý ve þifre giriþi, yeni þifre oluþturma kodu
public class pratik2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Scanner inp = new Scanner(System.in);
		int select;
		String userName,password,newPassword;
		System.out.println("Kullanýcý Adý: ");
		userName =input.nextLine();
		
		System.out.println("Þifre: ");
		password =input.nextLine();
		
		if(userName.equals("patika") && password.equals("1234")) {
			System.out.println("Giriþ yaptýnýz!");
		}
		else {
			System.out.println("Giriþ baþarýsýz þifrenizi sýfýrlamak isterseniz 1'i tuþlayýnýz.");
			select = input.nextInt();
			if(select == 1) {
				System.out.println("Yeni þifreniz : ");
				newPassword = inp.nextLine();
				
				if(newPassword.equals("1234"))
					System.out.println("Þifreniz eskisiyle ayný olamaz!");
				else
					System.out.println("Þifreniz deðiþtirildi!");
			}
		}
	}

}
