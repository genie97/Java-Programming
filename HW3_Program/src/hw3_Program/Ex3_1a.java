package hw3_Program;

import java.util.Scanner;
public class Ex3_1a {

	public static void main(String[] args) {
		double check, charge;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a check amount: ");
		
		check=keyboard.nextDouble();
		
		if(check<10){
			charge=1;
		}
		else if(check<100){
			charge=check*0.1;
		}
		else if(check<1000){
			charge=(check*0.05)+5;
		}
		else{
			charge=(check*0.01)+40;
		}
		System.out.println("Charge is $" + charge);
		
	}

}
