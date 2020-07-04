package myPackage;
import java.util.Scanner;
public class Ex1_2a 
{
	public static void main(String[] args)
	{
	System.out.println("Enter your birth year:");
	
	int n1;
	
	Scanner keyboard = new Scanner(System.in);
	n1=keyboard.nextInt();
	
	System.out.println("My age is ");
	System.out.println(2017-n1);
	} 
}