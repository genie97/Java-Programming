package myPackage;

public class Staff extends Employee{
	private int payGrade;
	
	public Staff(){
		super();
		this.payGrade=0;
	}
	public Staff(String initialName, int initialId, String initialDepartment, int payGrade){
		super(initialName,initialId,initialDepartment);
		this.payGrade=payGrade;
	}
	public int getPayGrade(){
		return payGrade;
	}

	public void setId(int payGrade){
		this.payGrade=payGrade;
	}
	
	public void writeOutput(){
		super.writeOutput();
		System.out.println("Pay Grade: " + this.payGrade);
	}
	
	
}
