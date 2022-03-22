package notSistemi;

public class Student {
	
	String name;
	String stuNo;
	int classes;
	
	Course mat;
	Course fizik;
	Course tarih;
	
	double avarage;
	boolean isPass;

	
	public Student(String name, int classes, String stuNo, Course mat,Course fizik, Course tarih) {
		this.name = name;
		this.stuNo = stuNo;
		this.classes = classes;
		this.mat = mat;
		this.fizik = fizik;
		this.tarih = tarih;
		
		this.isPass = false;
	}
	


	public void addExamNote(int mat,int fizik, int tarih) {
		this.mat.note= mat;
		this.fizik.note= fizik;
		this.tarih.note= tarih;
		
	}
	
	public void isPass() {
		printNote();
		if(calculateAvg() > 55) {
			System.out.println("Sýnýfý Geçtiniz!");
		}
		else {
			System.out.println("Sýnýfý Geçemediniz!");
		}
		
	}
	public double calculateAvg() {
		return (this.mat.note+ this.fizik.note+ this.tarih.note)/3 ;
	}
	
	public void printNote() {
		System.out.println("Öðrenci adý: \t"+ this.name);
		System.out.println("Matematik notu: \t"+ this.mat.note);
		System.out.println("Fizik notu: \t"+ this.fizik.note);
		System.out.println("Tarih notu: \t"+ this.tarih.note);
	}
	
}
