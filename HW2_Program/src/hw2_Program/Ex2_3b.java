package hw2_Program;

import java.util.Scanner;

public class Ex2_3b {

	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
		
		double radius,depth;
		double volume;
		
		System.out.println("Enter a radius: ");
		radius=keyboard.nextDouble();
		System.out.println("Enter a depth");
		depth=keyboard.nextDouble();
		
		radius=radius/12;
		volume=3.14*radius*radius*depth;
		
		volume=volume*7.48;
		
		System.out.println(volume);
		

	}

}
