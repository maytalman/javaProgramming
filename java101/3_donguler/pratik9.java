package Giris3;

import java.util.*;
public class pratik9 {
//Tek kişilik ATM programı
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName, password;
        Scanner input = new Scanner(System.in);
        int sayac = 3;
        int bakiye = 1500;
        int select;
        while (sayac > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("111")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    int price;
                    switch(select) {
                    case 1:
                    	 System.out.print("Para miktarı : ");
                         price = input.nextInt();
                         bakiye += price;
                    	 break;
                    
                    
                    case 2:  
                        System.out.print("Para miktarı : ");
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
                    	System.out.println("Tekrar görüşmek üzere.");
                    	break;
            }
        }
           else {
                sayac--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (sayac == 0) 
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                else 
                    System.out.println("Kalan Hakkınız : " + sayac);
                
            }
        
    }
	}

}
