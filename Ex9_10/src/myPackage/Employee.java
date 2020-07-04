package myPackage;

public class Employee extends Person{
	private int employeeId;
	private String department;
	
	public Employee(){
		super();
		this.employeeId=0;
		this.department="None";
	}
	public Employee(String initialName, int initialId, String initialDepartment){
		super(initialName);
		this.employeeId=initialId;
		this.department=initialDepartment;
	}
	public int getId(){
		return employeeId;
	}
	public String getDepartment(){
		return department;
	}
	public void setId(int employeeId){
		this.employeeId=employeeId;
	}
	public void setDepartment(String department){
		this.department=department;
	}
	public void writeOutput(){
		super.writeOutput();
		System.out.println("Employee ID: " + this.employeeId);
		System.out.println("Department: " + this.department);
	}
}
