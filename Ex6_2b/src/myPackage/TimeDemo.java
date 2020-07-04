package myPackage;

public class TimeDemo {

	public static void main(String[] args) {

		Time time1 = new Time();
		
		time1.setTime(20,20);
		System.out.println(time1.getTime24());
		System.out.println(time1.getTime12());
	}

}
