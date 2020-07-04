package myPackage;

public class PolynomialDemo {

	public static void main(String[] args) {
		Polynomial p1 = new Polynomial(3);
		p1.setConstant(0,3);
		p1.setConstant(1,5);
		p1.setConstant(2,0);
		p1.setConstant(3,2);
		
		double x=2.0;
		System.out.println(p1.evaluate(x));
		
		Polynomial p2 = new Polynomial(2);
		p2.setConstant(0,3);
		p2.setConstant(1,5);
		p2.setConstant(2,2);
		x=4.0;
		System.out.println(p2.evaluate(x));
	}

}
