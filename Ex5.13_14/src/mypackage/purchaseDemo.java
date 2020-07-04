package mypackage;

public class purchaseDemo {

	public static void main(String[] args) {
		Purchase onSale = new Purchase();
		onSale.readInput();
		onSale.writeOutput();
		System.out.println("Cost each $" + onSale.getUnitCost());
		System.out.println("Total cost $" + onSale.getTotalCost());
	}
}
