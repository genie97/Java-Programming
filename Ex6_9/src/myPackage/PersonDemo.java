package myPackage;

public class PersonDemo {

	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println("<Testing default constructor>");
		System.out.println("Name is " + p1.getName() + " and age is " + p1.getAge());
		System.out.println("");
		
		System.out.println("<Testing new instances>");
		Person p2 = new Person();
		p2 = Person.createToddler();
		System.out.println("Toddler name " + p2.getName() + " and age " + p2.getAge());
		p2 = Person.createPreschooler();
		System.out.println("Preschooler name " + p2.getName() + " and age " + p2.getAge());
		p2 = Person.createAdolescent();
		System.out.println("Adolescent name " + p2.getName() + " and age " + p2.getAge());
		p2 = Person.createTeenager();
		System.out.println("Teenager name " + p2.getName() + " and age " + p2.getAge());
		p2 = Person.createAdult();
		System.out.println("Adult name " + p2.getName() + " and age " + p2.getAge());
		System.out.println("");
			   
		System.out.println("<Testing set method>");
		p2.setName("Jenny");
		p2.setAge(8);
			   
		System.out.println("Name is " + p2.getName() + " and age is " + p2.getAge());
			    
		p2.setName("Jenny","Lee");
		p2.setAge(8);
		System.out.println("Name is " + p2.getName() + " and age is " + p2.getAge());
			    
	    
	}
}
