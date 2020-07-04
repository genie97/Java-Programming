package ex4_2a;

import java.util.Scanner;

public class MotorBoatDemo {

	public static void main(String[] args) {
		int time;
		double fuel, speed, ef;
		MotorBoat myboat = new MotorBoat();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the time:");
		time = keyboard.nextInt();
		System.out.println("Enter the fuel amount:");
		fuel = keyboard.nextDouble();
		System.out.println("Enter the current speed:");
		speed = keyboard.nextDouble();
		System.out.println("Enter the efficiency:");
		ef = keyboard.nextDouble();
	
		myboat.setfuel(fuel);
		myboat.setcurSpeed(speed);
		myboat.setefficiency(ef);
		myboat.need_fuel(time);
		myboat.travel_distance(time);
		myboat.travelDis();
	}

}
