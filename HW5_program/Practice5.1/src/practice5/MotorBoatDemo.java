package practice5;

import java.util.Scanner;

public class MotorBoatDemo {

	public static void main(String[] args) {
		int time;
		double fuel1, speed1, ef1, fuel2, speed2, ef2;
		MotorBoat boat1 = new MotorBoat();
		MotorBoat boat2 = new MotorBoat();
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the time:");
		time = keyboard.nextInt();
		
		System.out.println("boat1 value");
		System.out.println("Enter the fuel amount:");
		fuel1 = keyboard.nextDouble();
		System.out.println("Enter the current speed:");
		speed1 = keyboard.nextDouble();
		System.out.println("Enter the efficiency:");
		ef1 = keyboard.nextDouble();
		
		System.out.println("boat2 value");
		System.out.println("Enter the fuel amount:");
		fuel2 = keyboard.nextDouble();
		System.out.println("Enter the current speed:");
		speed2 = keyboard.nextDouble();
		System.out.println("Enter the efficiency:");
		ef2 = keyboard.nextDouble();
	
		boat1.setfuel(fuel1);
		boat1.setcurSpeed(speed1);
		boat1.setefficiency(ef1);
		boat1.need_fuel(time);
		boat1.travel_distance(time);
		boat1.travelDis();
		
		boat2.setfuel(fuel2);
		boat2.setcurSpeed(speed2);
		boat2.setefficiency(ef2);
		boat2.need_fuel(time);
		boat2.travel_distance(time);
		boat2.travelDis();
		System.out.println();
		System.out.println(boat1.equals(boat2));
	}
}
