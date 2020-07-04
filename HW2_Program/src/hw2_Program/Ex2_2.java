package hw2_Program;

import java.util.Scanner;

public class Ex2_2 {

	public static void main(String[] args) {
		 
				String s1,s2,s3,s4;
				System.out.println("Enter a sentecne: ");
				Scanner keyboard=new Scanner(System.in);
				s1= keyboard.nextLine();
				int position = s1.indexOf(' ');
				s2=s1.substring(0,position);
				s1=s1.substring(position+1);
				s1=s1+' '+s2;
				s2=s1.substring(0,1);
				s2=s2.toUpperCase();
				s1=s1.substring(1);
				System.out.println(s2+s1);		
	}
}
