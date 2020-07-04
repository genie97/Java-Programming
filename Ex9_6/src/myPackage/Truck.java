package myPackage;

public class Truck extends Vehicle {
	private double loadCapacity;
	private double towingCapacity;
	
	Truck(){
		super();
		this.loadCapacity=0;
		this.towingCapacity=0;
	}
	Truck(double loadCapacity, double towingCapacity,String manufacturer){
		super(manufacturer);
		this.loadCapacity=loadCapacity;
		this.towingCapacity=towingCapacity;
	}
	public void setLoad(double loadCapacity){
		this.loadCapacity=loadCapacity;
	}
	public void setTow(double towingCapacity){
		this.towingCapacity=towingCapacity;
	}
	public double getLoad(){
		return loadCapacity;
	}
	public double getTow(){
		return towingCapacity;
	}
	public boolean equals(Object otherObject){
		if(!(otherObject!=null&&otherObject instanceof Truck))
			return false;
		Truck othertruck=(Truck)otherObject;
		return ((super.equals(othertruck))&&
				(this.loadCapacity==othertruck.loadCapacity)&&
				(this.towingCapacity==othertruck.towingCapacity));
	}
	public String toString(){
		return String.format("Manufacturer:%s Loading capacity: %ld Towing capacity: %ld The number of cylinder: %ld ", getManufacturer(),loadCapacity,towingCapacity,super.getAmountEngine());
	}
}
