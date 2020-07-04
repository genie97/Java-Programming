package hw3_Program;

import java.util.Scanner;

public class Ex3_14 {

	public static void main(String[] args) {
		int time=0,bounce=0;
		double height=0,velocity=0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the initial velocity of the ball : ");
		velocity=keyboard.nextDouble();
	while(true){
		if(bounce==5){
			break;
		}
		else{
			System.out.println("Time: " + time +" Height: "+ height);
			time++;
			height=height+velocity;
			velocity=velocity-32;
			if(height<0){
				System.out.println("Bounce!");
				bounce++;
				velocity=velocity*(-0.5);
				height=height*(-0.5);
			}
		}
	}	
  }
}

