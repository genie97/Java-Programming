package myPackage;

public class Doctor extends Person {
	private String specialty;
	private double visit_fee;
	
	public Doctor(){
		super();
		specialty=null;
		visit_fee=0;
	}
	public Doctor(String initialName,String initialSpecialty,double initialFee){
		super(initialName);
		visit_fee=initialFee;
		specialty=initialSpecialty;
	}
	public double getVisit_fee(){
		return visit_fee;
	}
	public void setVisit_fee(double fee){
		if(fee<0)
			return;
		visit_fee=fee;	
	}
	public String getSpecialty(){
		return specialty;
	}
	public void setSpecialty(String newSpecialty){
		if(newSpecialty.equalsIgnoreCase("Medicine")||newSpecialty.equalsIgnoreCase("Surgery")||newSpecialty.equalsIgnoreCase("Dentist")||newSpecialty.equalsIgnoreCase("Oriental"))
				specialty=newSpecialty;
		else
			return;
	}
	public boolean equals(Doctor otherDoctor){
		return this.hasSameName(otherDoctor)&&(this.specialty.equalsIgnoreCase(otherDoctor.specialty))&&(this.visit_fee==otherDoctor.visit_fee);
	}
	public String toString(){
		return "Name: " + getName() + "\nSpecialty: " + getSpecialty() + "\nVisit fee: " + getVisit_fee(); 
	}
	public void writeOutput(){
		System.out.println("Name: " + getName());
		System.out.println("Specialty: " + getSpecialty());
		System.out.println("Visit fee: " + getVisit_fee());
	}
}
