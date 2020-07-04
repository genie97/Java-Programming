package myPackage;

public class Person {
	private String name;
	private int age;
	
	Person(){
		name="No name yet";
		age=0;
	}
	
	Person(String name, int age){
		this.name=name;
		this.age=age;		
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public void setName(String first,String last){
		name = first + " " + last; 
	}
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public static Person createToddler(){
		Person p = new Person();
		p.setName("A toddler");
		p.setAge(2);
		return p;
	}
	public static Person createPreschooler(){
		Person p = new Person();
		p.setName("A preschooler");
		p.setAge(5);
		return p;
	}
	public static Person createAdolescent(){
		Person p = new Person();
		p.setName("An adolescent");
		p.setAge(9);
		return p;
	}
	public static Person createTeenager(){
		Person p = new Person();
		p.setName("A teenager");
		p.setAge(15);
		return p;
	}
	public static Person createAdult(){
		Person p = new Person("An adult",21);
		return p;
	}
}
