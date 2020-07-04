package hw3_Program;

import java.util.Scanner;

public class Ex3_1c {

	public static void main(String[] args) {
		char grade;
		double gradeValue;
		
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Enter a letter: ");
		grade = keyboard.next().charAt(0);
				
		switch(grade){
		case 'A' :
			gradeValue = 4.0;
			System.out.println("\'A\' is " + gradeValue);
			break;
		case 'B' :
			gradeValue = 3.0;
			System.out.println("\'B\' is " + gradeValue);
			break;
		case 'C' :
			gradeValue = 2.0;
			System.out.println("\'C\' is " + gradeValue);
			break;
		case 'D' :
			gradeValue = 1.0;
			System.out.println("\'D\' is " + gradeValue);
			break;
		default :
			gradeValue = 0.0;
			System.out.println("\'" + grade + "\'"+ " is "  + gradeValue);
			break;
		}
		
	}

}
