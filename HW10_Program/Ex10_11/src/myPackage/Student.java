package myPackage;

public class Student extends Person implements Comparable {
	private int studentNumber;
	
	public Student(){
		super();
		studentNumber=0;
	}
	public Student(String initialName,int initialStudentNumber){
		super(initialName);
		studentNumber=initialStudentNumber;
	}
	public void reset(String newName, int newStudentNumber){
		setName(newName);
		studentNumber=newStudentNumber;
	}
	public int getStudentNumber(){
		return studentNumber;
	}
	public void setStudentNumber(int newStudentNumber){
		studentNumber=newStudentNumber;
	}
	public void writeOutput(){
		System.out.println("Name: " + getName());
		System.out.println("Student Number: " + studentNumber);
	}
	public boolean equals(Student otherStudent){
		return this.hasSameName(otherStudent)&&(this.studentNumber==otherStudent.studentNumber);
	}
	public String toString(){
		return "Name: "+getName() + "\nStudent number:" + studentNumber;
	}
	
	public int compareTo(Object o){
		if((o!=null)&&(o instanceof Student)){
			Student otherStudent = (Student) o;
			return getName().compareTo(otherStudent.getName());
		}
		return -1;
	}
}
