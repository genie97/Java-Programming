package hw2_Program;

import java.util.Scanner;

public class Ex2_1b {

	public static void main(String[] args) {
		
		int Fah,Cel;
		System.out.println("Enter a temperature in Fahrenheit :");
		Scanner keyboard = new Scanner(System.in);
		Fah = keyboard.nextInt();
		
		Cel=5*(Fah-32)/9;
		
		System.out.println(Fah+" Fahrenheit = "+Cel+" Celsius");
	}
}
