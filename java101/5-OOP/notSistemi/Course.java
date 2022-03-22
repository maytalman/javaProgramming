package notSistemi;

public class Course {
	String name;
	String code;
	String prefix;
	
	Teacher teacher;
	
	int note;
	
		public Course (String name, String code, String prefix){
			this.name = name;
			this.code = code;
			this.prefix = prefix;
			this.note =0;
			
		}
		
		
		public void printTeacher() {
			if(teacher != null) {
				System.out.println(this.name+ " dersinin hocas� "+ this.teacher);
			}
			else {
				System.out.println(this.name+ " dersi i�in bir hoca atanmam��t�r.");
			}
		}
		
}
