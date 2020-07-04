package myPackage;

public class Vehicle {
	private String manufacturer;
	private int amountEngine;
	private Person owner = new Person();
	
	public Vehicle(){
		manufacturer="None";
		amountEngine=0;
		owner.setName("None");
	}
	
	public Vehicle(String manufacturer){
		this.manufacturer=manufacturer;
		amountEngine=0;
		owner.setName("None");
	}
	
	public Vehicle(int amountEngine){
		manufacturer="None";
		this.amountEngine=amountEngine;
		owner.setName("None");
	}
	public Vehicle(Person theOwner){
		manufacturer="None";
		amountEngine=0;
		owner.setName(theOwner.getName());
	}

	public Vehicle(Person theOwner, String manufacturer, int amountEngine){
		this.manufacturer=manufacturer;
		this.amountEngine=amountEngine;
		owner.setName(theOwner.getName());
	}
	
	public String getManufacturer(){
		return manufacturer;
	}
	
	public int getAmountEngine(){
		return amountEngine;
	}
	public Person getOwner(){
		return owner;
	}
	public void setManufaturer(String manufacturer){
		this.manufacturer=manufacturer;
	}
	public void setAmountEngine(int amountEngine){
		this.amountEngine=amountEngine;
	}
	public void setOwner(Person newOwner){
		owner.setName(newOwner.getName());
	}
	public boolean equals(Vehicle otherVehicle){
		return (owner.hasSameName(otherVehicle.getOwner()))&&
				(this.amountEngine==otherVehicle.getAmountEngine())&&
				(this.manufacturer.equalsIgnoreCase(otherVehicle.getManufacturer()));
	}
}
