package hw2_Program;

import java.util.Scanner;

public class Ex2_1a {

	public static void main(String[] args) {
		int num, i, rem,quo, j=1000;
		
		System.out.println("Enter a four-digit integer : ");
		Scanner keyboard = new Scanner(System.in);
		num=keyboard.nextInt();
		
		System.out.print("Output is ");
		
		for(i=0;i<4;i++){
			quo=num/j;
			rem=num%j;
			j=j/10;
			num=rem;
			System.out.print(quo);		
		}
	}
}
