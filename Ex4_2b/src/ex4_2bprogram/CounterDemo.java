package ex4_2bprogram;

import java.util.Scanner;

public class CounterDemo {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Counter cnt = new Counter();
		int choice;
		while (true) {
			System.out.println("1. increase 2. decrease 3. reset 4. exit:");
			choice = keyboard.nextInt();
			switch (choice) {
			case 1:
				cnt.increase();
				break;
			case 2:
				cnt.decrease();
				break;
			case 3:
				cnt.reset();
				break;
			case 4:
				System.exit(1);
				break;
			default:
				System.out.println("Wrong choice");
			}
		}
	}
}
