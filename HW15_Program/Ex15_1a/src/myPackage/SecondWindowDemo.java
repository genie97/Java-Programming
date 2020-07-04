package myPackage;

import java.awt.Color;

public class SecondWindowDemo {

	public static void main(String[] args) {
		SecondWindow window1 = new SecondWindow();
		window1.setVisible(true);
		
		SecondWindow window2 = new SecondWindow(Color.PINK);
		window2.setVisible(true);

	}

}
