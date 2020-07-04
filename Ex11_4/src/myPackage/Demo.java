package myPackage;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		try{
			String line;
			System.out.println("Type the Month and day: ");
			line=keyboard.nextLine();
			
			if(MonthException.checkMonth(line)==-1)
				throw new MonthException();
			if(DayException.checkDay(MonthException.returnMonth(line),line)==-1)
				throw new DayException();
			System.out.println("Convert: " + MonthException.convertMonth(line) + " " + DayException.returnDay(line));
		}
		catch(MonthException m){
			System.out.println(m.getMessage());
		}
		catch(DayException d){
			System.out.println(d.getMessage());
		}
		System.out.println("End ");
	}
}
