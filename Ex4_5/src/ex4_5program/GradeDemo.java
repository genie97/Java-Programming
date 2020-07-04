package ex4_5program;

import java.util.Scanner;

public class GradeDemo {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Scanner key = new Scanner(System.in);
		int choice;
		char g;
		Grade G = new Grade();
		while (true) {
			System.out.println("1.Type the grade 2. exit:");
			choice = keyboard.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Type the grade:");
				g = key.nextLine().charAt(0);
				G.setGrade(g);
				G.setPerGrade();
				break;
			case 2:
				G.print();
				System.exit(1);
				break;
			}
		}
	}
}
