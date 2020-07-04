package myPackage;

public class Faculty extends Employee{
	private String membersTitle;
	
	public Faculty(){
		super();
		this.membersTitle="None";
	}
	public Faculty(String initialName, int initialId, String initialDepartment, String membersTitle){
		super(initialName,initialId,initialDepartment);
		this.membersTitle=membersTitle;
	}
	public String getMembersTtile(){
		return membersTitle;
	}

	public void setId(String mebersTitle){
		this.membersTitle=membersTitle;
	}
	
	public void writeOutput(){
		super.writeOutput();
		System.out.println("Members Title: " + this.membersTitle);
	}
}
