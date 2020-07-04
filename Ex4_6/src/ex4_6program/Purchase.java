package ex4_6program;

import java.util.Scanner;

public class Purchase {

	private String item;
	private int groupCount;
	private double groupPrice;
	private int numBought;

	public void setName(String newItem)
	{
		item = newItem;
	}

	public void setPrice(int count, double costForCount) 
	{
		if ((count <= 0) || (costForCount <= 0)) 
		{
			System.out.println("Error: Bad parameter in " + "setPrice.");
			System.exit(0);
		} 
		else 
		{
			groupCount = count;
			groupPrice = costForCount;
		}
	}

	public void setNumBought(int num) 
	{
		if (num <= 0) 
		{
			System.out.println("Error: Bad parameter in " + "setNumberBought.");
			System.exit(0);
		} 
		else
		{
			numBought = num;
		}
	}

	public void readInput()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter name of item you are purchasing:");
		item = keyboard.nextLine();
		System.out.println("Enter price of item as two numbers.");
		System.out.println("For example, 3 for $2.99 is entered as");
		System.out.println("3 2.99");
		System.out.println("Enter price of item as two numbers, " + "now:");
		groupCount = keyboard.nextInt();
		groupPrice = keyboard.nextDouble();
		
		while ((groupCount <= 0) || (groupPrice <= 0)) 
		{ 
			System.out.println("Both numbers must " + "be positive. Try again. ");
			System.out.println("Enter price of " + "item as two numbers.");
			System.out.println("For example, 3 for $2.99 is entered as");
			System.out.println("3 2.99");
			System.out.println("Enter price of item as two numbers, now:");
			groupCount = keyboard.nextInt();
			groupPrice = keyboard.nextDouble();
		}
		
		System.out.println("Enter number of items purchased:");
		numBought = keyboard.nextInt();
		
		while (numBought <= 0) 
		{ 
			System.out.println("Number must be positive. " + "Try again.");
			System.out.println("Enter number of items purchased:");
			numBought = keyboard.nextInt();
		}
	}

	public void writeOutput() 
	{
		System.out.println(numBought + " " + item);
		System.out.println("at " + groupCount + " for $" + groupPrice);
	}

	public String getItem() 
	{
		return item;
	}

	public double getTotalCost()
	{
		return (groupPrice / groupCount) * numBought;
	}

	public double getUnitCost()
	{
		return groupPrice / groupCount;
	}

	public int getNumberBought() 
	{
		return numBought; 
	}
}
