package myPackage;

public class Demo {

	public static void main(String[] args) {
		Truck t1 = new Truck(2000,2500,"Jack");
		Truck t2 = new Truck(4000,4500,"James");
		
		t1.setAmountEngine(5);
		t2.setAmountEngine(15);
		
		System.out.println("Truck1");
		System.out.println("Manufacturer: " + t1.getManufacturer());
		System.out.println("Loading capacity: " + t1.getLoad());
		System.out.println("Towing capacity: " + t1.getTow());
		System.out.println("The number of capacity: " + t1.getAmountEngine());
		System.out.println();
		
		
		System.out.println("Truck2");
		System.out.println("Manufacturer: " + t2.getManufacturer());
		System.out.println("Loading capacity: " + t2.getLoad());
		System.out.println("Towing capacity: " + t2.getTow());
		System.out.println("The number of capacity: " + t2.getAmountEngine());
		System.out.println();

	}

}
