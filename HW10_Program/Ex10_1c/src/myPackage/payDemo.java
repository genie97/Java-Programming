package myPackage;

public class payDemo {

	public static void main(String[] args) {
		RegularPay p1 =new RegularPay(30);
		RegularPay p2 =new RegularPay(20);
		HazardPay p3=new HazardPay(30);
		HazardPay p4=new HazardPay(15);

		System.out.println(p1.computePay(1.5));
		System.out.println(p2.computePay(1.5));
		System.out.println(p3.computePay(2.0));
		System.out.println(p4.computePay(2.0));
	}

}
