package hw3_Program;

import java.util.Scanner;

public class Ex3_10 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int annual=1, month =12, day=365;
		int choice,i,j;
		double balance,interest,rate;
		
		while(true){
			System.out.println("Choose a program: ");
			System.out.println("1.Annually 2.Monthly 3.Daily 4.End program");
			choice=keyboard.nextInt();
			
			System.out.println("Enter a balance: ");
			balance=keyboard.nextDouble();
			
			System.out.println("Enter a interest: ");
			interest=keyboard.nextDouble();
			rate=interest/100;
			
		switch(choice){
		case 1:
			for(i=0;i<10;i++){
				for(j=0;j<annual;j++){
					balance=balance+(balance*rate);
				}
			}
			System.out.println("Balance : "+ balance);
			break;
		case 2:
			for(i=0;i<10;i++){
				for(j=0;j<month;j++){
					balance=balance+(balance*(rate/month));
				}
			}
			System.out.println("Balance : "+ balance);
			break;
		case 3:
			for(i=0;i<10;i++){
				for(j=0;j<day;j++){
					balance=balance+(balance*(rate/day));
				}
			}
			System.out.println("Balance : "+ balance);
			break;
		default:
			System.exit(0);
			}
		}
	}
}
