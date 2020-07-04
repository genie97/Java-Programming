package myPackage;

import java.util.Scanner;

public class Scores {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter n(the number of scores):");
		int n = keyboard.nextInt();
		int sum=0;
		float avg=0;
		System.out.println("Enter scores: ");
		float[] score = new float[n];
		for(int i=0;i<score.length;i++){
			score[i]=keyboard.nextFloat();
			sum+=score[i];
		}
		avg=(float)sum/score.length;
		System.out.println("The average of the scores: "+ avg);
		for(int i=0;i<score.length;i++){
			if(avg<score[i])
				System.out.println("scores above the average:" + score[i]);
		}
	}

}
