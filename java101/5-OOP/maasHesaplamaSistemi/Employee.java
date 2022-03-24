package maasHesaplamaSistemi;
//Çalışan sınıfı
public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;
	
	public Employee(String name,double salary, int workHours,int hireYear) {
		this.name= name;
		this.salary=salary;
		this.hireYear=hireYear;
		this.workHours=workHours;
		
	}
	
	public double tax() {
		if(this.salary < 1000) {
			return 0.0;
		}
		else {
			return this.salary*3/100;
		}
	}
	
	public double bonus() {
		int fazla;
		if(this.workHours> 40) {
			fazla = this.workHours-40;
			return fazla*30;
		}
		else return 0.0;
	}
	
	public double raiseSalary() {
		int time = this.hireYear- 2021;
		if(time<10 ) {
			return this.salary*5/100;
		}
		else if(time >9 && time<20){
			return this.salary*10/100;
			
		}
		else {
			return this.salary*15/100;
		}
	}
	
	public double totalSalary() {
		return this.salary- tax()+ bonus();
	}
	
	public void printInfo() {
		
		System.out.println("********************");
		System.out.println("Adý:\t"+this.name);
		System.out.println("Maaþý:\t"+this.salary);
		System.out.println("Çalýþma Saati:\t"+this.workHours);
		System.out.println("Baþlangýç Yýlý:\t"+this.hireYear);
		System.out.println("Vergi:\t"+raiseSalary());
		System.out.println("Bonus:\t"+bonus());
		System.out.println("Maaþ Artýþý:\t"+tax());
		System.out.println("Vergi ve Bonuslar ile birlikte maaþ:\t"+totalSalary());
		System.out.println("Toplam Maaþ:\t"+(totalSalary()+ raiseSalary()));
	}
}
