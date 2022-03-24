package boksOyunu;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fighter f1 = new Fighter("Ali" , 15 , 100, 90, 0);
	    Fighter f2 = new Fighter("Mehmet" , 10 , 95, 100, 0);
	    Ring r = new Ring(f1,f2 , 90 , 100);
	    r.run();
	}

}
