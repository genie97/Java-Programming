package hw3_Program;

import java.util.Scanner;

public class Ex3_1b{

	public static void main(String args[]){
	
	Scanner keyboard=new Scanner(System.in);
	int price,change,changeTemp;
	int assume=100;
	int quarter,dime,nickel;
	System.out.println("Enter a price of item :");
	price=keyboard.nextInt();
	
	if(price<25){
		System.out.println("Error. This value is invalid.");
	}
	else if(price>100){
		System.out.println("Error. This value is invalid.");
	}
	else if((price%5!=0)){
		System.out.println("Error. This value is invalid.");
	}
	else{
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
}
