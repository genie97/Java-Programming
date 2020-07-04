package myPackage;

public class Dog extends Pet {
	private String breed;
	private boolean boosterShot;
	public Dog(){
		super();
		this.breed="NULL";
		this.boosterShot=false;
	}
	public Dog(String initialName, String breed, boolean boosterShot){
		super(initialName);
		this.breed=breed;
		this.boosterShot=boosterShot;
	}
	public Dog(int initialAge, String breed, boolean boosterShot){
		super(initialAge);
		this.breed=breed;
		this.boosterShot=boosterShot;
	}
	public Dog(String initialName,int initialAge,double initialWeight, String breed, boolean boosterShot){
		super(initialName,initialAge, initialWeight);
		this.breed=breed;
		this.boosterShot=boosterShot;
	}
	public void setBreed(String breed){
		this.breed=breed;
	}
	public void setBooster(boolean boosterShot){
		this.boosterShot=boosterShot;
	}
	public String getBreed(){
		return breed;
	}
	public boolean getBooster(){
		return boosterShot;
	}
	

}
