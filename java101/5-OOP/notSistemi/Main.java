package notSistemi;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course mat = new Course("Matematik","MAT101","MAT");
		Course fizik = new Course("Fizik","FZK101","FZK");
		Course tarih = new Course("Tarih","TRH101","TRH");
		
		Teacher t1 = new Teacher("Ersin Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Sait Hoca", "90550000001", "FZK");
        Teacher t3 = new Teacher("Mustafa Hoca", "90550000002", "KMY");
        
        Student s1 = new Student( "Ebru", 4, "142222", mat, fizik, tarih);
        s1.addExamNote(50,20,100);
        s1.isPass();
        
        Student s2 = new Student( "Merve", 4, "141111", mat, fizik, tarih);
        s1.addExamNote(50,60,40);
        s1.isPass();
        
        Student s3 = new Student( "Ferhat", 4, "140000", mat, fizik, tarih);
        s1.addExamNote(50,20,80);
        s1.isPass();
        

	}

}
