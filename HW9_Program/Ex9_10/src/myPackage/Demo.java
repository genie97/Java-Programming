package myPackage;

public class Demo {

	public static void main(String[] args) {
		Person[] p = new Person[3];
		p[0] = new Employee("Cotty, Manny", 4910, "Naver");
		p[1] = new Staff("Kick, Anita", 9931, "Gachon", 1000000000);
		p[2] = new Faculty("DeBanque, Fraud", 8000, "Google", "GG");
		
		for(Person people : p){
			people.writeOutput();
			System.out.println();
		}
	}

}
