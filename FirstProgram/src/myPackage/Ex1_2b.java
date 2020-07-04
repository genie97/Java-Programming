package myPackage;
import java.util.Scanner;
public class Ex1_2b 
{
	public static void main(String[] args)
	{
	System.out.println("Enter two integers:");
	
	int n1, n2;
	int count;
	
	Scanner keyboard = new Scanner(System.in);
	n1=keyboard.nextInt();
	n2=keyboard.nextInt();
	
	if(n1>n2)
		count=n1-n2+1;
	else
		count=n2-n1+1;
	
	System.out.println("The number of integers is ");
	System.out.println(count);
	} 
}

