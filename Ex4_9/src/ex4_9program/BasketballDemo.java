package ex4_9program;

import java.util.Scanner;

public class BasketballDemo {

	public static void main(String[] args) {
		Basketball game = new Basketball();
		Scanner keyboard = new Scanner(System.in);
		Scanner key = new Scanner(System.in);
		
		char team;
		int score;
		int choice;
		
		while (true) 
		{	
			System.out.println("1.Enter a score 2. exit");
			choice = keyboard.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter a score:");
				team = key.nextLine().charAt(0);
				//key
				score = keyboard.nextInt();
				game.SetScore(team, score);
				game.setWinningTeam();
				System.out.println(game.GetFristName() + " " + game.GetFirstScore() + ", " + game.GetSecondName() + " "
						+ game.GetSecondScore() + "; " + game.GetWinTeamName());
				break;
			case 2:
				System.exit(1);
			}
		}
	}
}
