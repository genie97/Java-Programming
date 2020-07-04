package hw3_Program;

import java.util.Scanner;

public class Ex3_2b {

	public static void main(String[] args) {
		int score=0,cntA=0,cntB=0,cntC=0,cntD=0,cntF=0;
		Scanner keyboard = new Scanner(System.in);
		
		while(true){
			System.out.println("Enter a score: ");
			score=keyboard.nextInt();
			if(score<0){
				break;
			}
			else{
				if(score>100){
					System.out.println("Invalid value. Reenter please!");
				}
				else{
				if((score>=90)&&(score<=100)){
					cntA++;
				}
				else if((score>=80)&&(score<90)){
					cntB++;
				}
				else if((score>=70)&&(score<80)){
					cntC++;
				}
				else if((score>=60)&&(score<70)){
					cntD++;
				}
				else
					cntF++;
				}
			}
		}
		System.out.print("A count : " + cntA);
		System.out.print(" B count : " + cntB);
		System.out.print(" C count : " + cntC);
		System.out.print(" D count : " + cntD);
		System.out.print(" F count : " + cntF);
	}

}
