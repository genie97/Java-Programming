package myPackage;

public class Employee extends Person{
	private int salary;
	private String SSN;
	
	public Employee(){
		super();
		salary=0;
	}
	public void setSalary(int newSalary){
		salary=newSalary;
	}
	public void setSSN(String newSSN){
		SSN=newSSN;
	}
	public int getSalary(){
		return salary;
	}
	public String getSSN(){
		return SSN;
	}

}
