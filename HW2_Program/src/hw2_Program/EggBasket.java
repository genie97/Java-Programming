package hw2_Program;

import java.util.Scanner;

public class EggBasket {

	public static void main(String[] args) {
		int numberOfBaskets, eggsPerBasket, totalEggs;
		numberOfBaskets = 30;
		eggsPerBasket = 5;
		
		totalEggs = numberOfBaskets*eggsPerBasket;
		
		System.out.println("If you have");
		System.out.println(eggsPerBasket+" eggs per basket and");
		System.out.println(numberOfBaskets+" baskets then");
		System.out.println("the total number of eggs is "+totalEggs);
	}

}
