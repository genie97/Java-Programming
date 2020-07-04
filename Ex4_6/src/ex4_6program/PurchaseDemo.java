package ex4_6program;

public class PurchaseDemo {

	public static void main(String[] args) {
		Purchase goods = new Purchase();
		double total = 0;
		for (int i = 0; i < 5; i++) {
			goods.readInput();
			goods.writeOutput();
			total = total + goods.getTotalCost();
		}
		System.out.println("total price is : " + total);

	}

}
