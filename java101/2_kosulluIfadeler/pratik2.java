package Giris2;

import java.util.Scanner;
//Kullan�c� ad� ve �ifre giri�i, yeni �ifre olu�turma kodu
public class pratik2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Scanner inp = new Scanner(System.in);
		int select;
		String userName,password,newPassword;
		System.out.println("Kullan�c� Ad�: ");
		userName =input.nextLine();
		
		System.out.println("�ifre: ");
		password =input.nextLine();
		
		if(userName.equals("patika") && password.equals("1234")) {
			System.out.println("Giri� yapt�n�z!");
		}
		else {
			System.out.println("Giri� ba�ar�s�z �ifrenizi s�f�rlamak isterseniz 1'i tu�lay�n�z.");
			select = input.nextInt();
			if(select == 1) {
				System.out.println("Yeni �ifreniz : ");
				newPassword = inp.nextLine();
				
				if(newPassword.equals("1234"))
					System.out.println("�ifreniz eskisiyle ayn� olamaz!");
				else
					System.out.println("�ifreniz de�i�tirildi!");
			}
		}
	}

}
