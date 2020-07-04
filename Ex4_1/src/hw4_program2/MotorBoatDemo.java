package hw4_program2;

import java.util.Scanner;

public class MotorBoatDemo {

	public static void main(String[] args) {
		
		int time;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a time: ");
		time=keyboard.nextInt();
		
		MotorBoat myboat = new MotorBoat();
		myboat.capacity=20;
		myboat.fuel=10;
		myboat.maxSpeed=20;
		myboat.curSpeed=12;
		myboat.efficiency=8;
		myboat.need_fuel(time);
		myboat.travel_distance(time);
		myboat.travelDis();
	}

}
