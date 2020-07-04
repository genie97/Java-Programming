package myPackage;

import java.util.Scanner;

public class Characteristic {
	private String description;
	private int rating;
	
	public Characteristic(String desc){
		description=desc;
		rating=0;
	}
	private boolean isValid(int aRating){
		return (aRating>=1)&&(aRating<=10);
	}
	
	public void setRating(int aRating){
		if(isValid(aRating))
			rating=aRating;
	}
	
	public void setRating(){
		System.out.println("What is your rating for " + description + "?");
		System.out.println("Enter a rating from 1 to 10: ");
		Scanner keyboard = new Scanner(System.in);
		
		int rate=0;
		boolean flag = true;
		
		while(flag){
			rate = keyboard.nextInt();
			if(isValid(rate)){
				flag=false;
			}
			else{
				System.out.println("Error: rating is out of range.");
				System.out.println("Enter a rating from 1 to 10 again.");
				
			}
		}
		
		setRating(rate);
	}
	public String getDescription(){
		return description;
	}
	
	public int getRating(){
		return rating; 
	}
	
	public double getCompatability(Characteristic otherRating){
		if(!isMatch(otherRating))
			return 0.0;
		else
			return getCompatibilityMeasure(otherRating);
	}

	public boolean isMatch(Characteristic otherRating){
		return description.equals(otherRating.getDescription());
	}
	
	private double getCompatibilityMeasure(Characteristic otherRating){
		int r1 = rating;
		int r2 = otherRating.getRating();
		
		if(r1==0||r2==0)
			return 0.0;
		else
			return (1.0-(r1-r2)*(r1-r2)/81.0);
	}
	

}
