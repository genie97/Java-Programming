package hw3_Program;

import java.util.Scanner;

public class Ex3_13 {

	public static void main(String[] args) {
		int num,i,j;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a num: ");
		num=keyboard.nextInt();
		for(i=0;i<num;i++){
			for(j=0;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();	
		}
		for(i=num-1;i>0;i--){
			for(j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println();	
		}
	}

}
