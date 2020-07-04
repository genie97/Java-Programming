package myPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int sum=0;
		float avg=0;
		int num=0;
		System.out.println("Enter scores: ");
		do{
			num=keyboard.nextInt();
			list.add(num);
			
		}while(num>0);
		for(int i=0;i<list.size();i++){
			sum+=list.get(i);
		}
		System.out.println("The sum of the scores: "+ sum);
		avg=(float)sum/list.size();
		System.out.println("The average of the scores: "+ avg);
		for(int i=0;i<list.size();i++){
			if(avg<list.get(i))
				System.out.println("scores above the average:" + list.get(i));
		}

	}

}
