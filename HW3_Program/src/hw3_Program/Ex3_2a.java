package hw3_Program;

import java.util.Scanner;

public class Ex3_2a {

	public static void main(String[] args) {
		int num,max=0,min=0,sum=0,cnt=0;
		double avg=0;
		Scanner keyboard = new Scanner(System.in);
	
		System.out.println("Enter a non negeative integer: ");
		num=keyboard.nextInt();
		cnt=cnt+1;
		sum=sum+num;
		
		max=min=num;
		
		while(true){
			System.out.println("Enter a non negeative integer: ");
			num=keyboard.nextInt();
			if(num<0){
				break;
			}
			else{
				sum=sum+num;
				cnt=cnt+1;
				if(max<num){
					max=num;
				}
				if(min>num){
					min=num;	
					}
				}	
			}
		avg=(double)sum / cnt;
		System.out.println("max :" + max + " min : " + min + " average : "+ avg);
		}
	}
