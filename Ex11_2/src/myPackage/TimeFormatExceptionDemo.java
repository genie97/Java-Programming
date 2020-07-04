package myPackage;

import java.util.Scanner;

public class TimeFormatExceptionDemo{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		String time,check;
		char ans;
		
		do{
			System.out.println("Enter time in 24-hour notation: ");
			time=keyboard.next();
			check=Time(time);
			System.out.println(check);
			System.out.println("Again? (y/n)");
			ans=keyboard.next().charAt(0);
		}while(ans=='y'||ans=='Y');
		System.out.println("End of program");
	}
	private static String Time(String s){
		String hour="",min="",temp="",line="";
		int h,m;
		hour=s.substring(0,2);
		min=s.substring(3,5);
		temp=s.substring(2,3);
		h=Integer.parseInt(hour);
		m=Integer.parseInt(min);
		line=s;
		
		try{
			if(h>=0&&h<=24&&temp.equals(":")&&m>=0&&m<=59){
				if(h>=0&&h<=12){
					line=String.format("%02d", h);
					line=line.concat(":");
					line=line.concat(String.format("%02d", m));
					line=line.concat(" AM");
					}
				else if(h>12&&h<=24){
					h=h-12;
					line=String.format("%d", h);
					line=line.concat(":");
					line=line.concat(String.format("%02d", m));
					line=line.concat(" PM");
					}
				return "That is the same as \n" + line;
			}
			else
				throw new TimeFormatException();
		}
		catch(TimeFormatException e){
			System.out.print(e.getMessage());
		}
		return line ;
	}
}
