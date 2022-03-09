package Giris;
import java.util.Scanner;

public class pratik1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat, fizik, kimya,turkce,tarih;
		Scanner input = new Scanner(System.in);
		
		System.out.println("mat notunuz: ");
		mat = input.nextInt();
		
		System.out.println("turkçe notunuz: ");
		turkce = input.nextInt();
		
		System.out.println("fizik notunuz: ");
		fizik = input.nextInt();
		
		System.out.println("tarih notunuz: ");
		tarih = input.nextInt();
		
		System.out.println("kimya notunuz: ");
		kimya = input.nextInt();
		
		double avg = (mat+ turkce + fizik+ tarih+ kimya) / 5;
		System.out.println("Ortalamanýz : "+ avg);
		
		boolean sonuc = avg>= 60;
		System.out.println(sonuc ? "geçti": "kaldı");
		
	}

}
