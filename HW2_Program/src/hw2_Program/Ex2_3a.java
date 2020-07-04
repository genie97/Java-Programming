package hw2_Program;

import java.util.Scanner;

public class Ex2_3a {

	public static void main(String[] args) {
		
		Scanner keyboard=new Scanner(System.in);
		int price,change,changeTemp;
		int assume=100;
		int quarter,dime,nickel;
		System.out.println("Enter a price of item :");
		price=keyboard.nextInt();
		change=100-price;
		changeTemp=change;
		quarter=change/25;
		change=change-25*quarter;
		
		dime=change/10;
		change=change-10*dime;
		
		nickel=change/5;
		
		System.out.println("the change is "+ changeTemp +"cents, ");
		System.out.println(quarter + " quarters, " + dime +" dimes "+ nickel +" nickels");
	}

}
