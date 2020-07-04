package myPackage;

public class AuthenticationNumDemo {

	public static void main(String[] args) {
		AuthenticationNum n1 = new AuthenticationNum();
		
		n1.setActualNum(12345);
		n1.authenticate(11133);
		n1.display();
		
		AuthenticationNum n2 = new AuthenticationNum();
		
		n2.setActualNum(21200);
		n2.authenticate(11133);
		n2.display();		
	}
}
