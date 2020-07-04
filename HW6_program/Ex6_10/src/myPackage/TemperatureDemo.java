package myPackage;


import java.util.Scanner;

public class TemperatureDemo {

	public static void main(String[] args) {
		char scale;
		double degrees;
		int i=0;
		
		Scanner keyboard = new Scanner(System.in);
		
		Temperature temp1 = new Temperature();
		Temperature temp2 = new Temperature();
		
		while(i!=3){
			System.out.println("Type the degrees:");
			degrees = keyboard.nextDouble();
			System.out.println("Type the C or F");
			scale = keyboard.next().charAt(0);
			temp1.setBoth(degrees, scale);
			
			if (temp1.getScale() == 'F')
				System.out.println("temp1 : " +temp1.getFahrenheit() + temp1.getScale());
			else if (temp1.getScale() == 'C')
				System.out.println("temp1 : " +temp1.getCelsius() + temp1.getScale());

			System.out.println("Type the degree:");
			degrees = keyboard.nextDouble();
			System.out.println("Type the C or F");
			scale = keyboard.next().charAt(0);
			temp2.setBoth(degrees, scale);
			
			if (temp2.getScale() == 'F')
				System.out.println("temp2 : " +temp2.getFahrenheit() + temp2.getScale());
			else if (temp2.getScale() == 'C')
				System.out.println("temp2 : " +temp2.getCelsius() + temp2.getScale());

			System.out.println("temp1 degree and temp2 degree are equal? " + temp1.compareEqual(temp2));
			System.out.println("temp1 degree is larger than temp2? " + temp1.compareLarger(temp2));
			System.out.println("temp1 degree is smaller than temp2 ?" + temp1.compareSmaller(temp2));
			
			i++;
		}
	}
}
