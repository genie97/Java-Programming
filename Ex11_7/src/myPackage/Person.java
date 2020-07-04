package myPackage;

public class Person {
	private String name;
	public Person(){
		name="No name yet";
	}
	public void setName(String newName){
		name=newName;
	}
	public String getName(){
		return name;
	}
	public void writeOutput(){
		System.out.println("Name: " + name);
	}
}
