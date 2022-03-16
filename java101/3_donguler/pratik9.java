package Giris3;

import java.util.*;
public class pratik9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName, password;
        Scanner input = new Scanner(System.in);
        int sayac = 3;
        int bakiye = 1500;
        int select;
        while (sayac > 0) {
            System.out.print("Kullanýcý Adýnýz :");
            userName = input.nextLine();
            System.out.print("Parolanýz : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("111")) {
                System.out.println("Merhaba, Kodluyoruz Bankasýna Hoþgeldiniz!");
                
                    System.out.println("1-Para yatýrma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çýkýþ Yap");
                    System.out.print("Lütfen yapmak istediðiniz iþlemi seçiniz : ");
                    select = input.nextInt();
                    int price;
                    switch(select) {
                    case 1:
                    	 System.out.print("Para miktarý : ");
                         price = input.nextInt();
                         bakiye += price;
                    	 break;
                    
                    
                    case 2:  
                        System.out.print("Para miktarý : ");
                        price = input.nextInt();
                        if (price > bakiye) 
                            System.out.println("Bakiye yetersiz.");
                        else 
                            bakiye -= price;
                        break;
                    case 3 :
                        System.out.println("Bakiyeniz : " + bakiye);
                        break;
                    case 4: 
                    	System.out.println("Tekrar görüþmek üzere.");
                    	break;
            }
        }
           else {
                sayac--;
                System.out.println("Hatalý kullanýcý adý veya þifre. Tekrar deneyiniz.");
                if (sayac == 0) 
                    System.out.println("Hesabýnýz bloke olmuþtur lütfen banka ile iletiþime geçiniz.");
                else 
                    System.out.println("Kalan Hakkýnýz : " + sayac);
                
            }
        
    }
	}

}
