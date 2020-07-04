package ex5_12;

import java.util.Scanner;

public class MovieDemo {

	public static void main(String[] args) {
		Movie movie1 = new Movie();
		Movie movie2 = new Movie();
		String name, rating;
		int rate;
		boolean result;

		Scanner key = new Scanner(System.in);
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter the moive name: ");
		name = key.nextLine();
		System.out.println("Enter the moive rating: ");
		rating = key.nextLine();

		movie1.setMovieName(name);
		movie1.setMovieRate(rating);

		for (int i = 0; i < 5; i++) {
			System.out.println("1.Terrible 2.Bad 3.OK 4.Good 5.Great");
			rate = key.nextInt();
			movie1.addRating(rate);
		}

		System.out.println("Movie name is " + movie1.getName() + ",rate is " + movie1.getRate_MPPAA()
				+ ",rating average is " + movie1.getAvg());

		System.out.println("Enter the moive name: ");
		name = keyboard.nextLine();
		System.out.println("Enter the moive rating: ");
		rating = keyboard.nextLine();

		movie2.setMovieName(name);
		movie2.setMovieRate(rating);

		for (int i = 0; i < 5; i++) {
			System.out.println("1.Terrible 2.Bad 3.OK 4.Good 5.Great");
			rate = keyboard.nextInt();
			movie2.addRating(rate);
		}
		System.out.println("Movie name is " + movie2.getName() + ",rate is " + movie2.getRate_MPPAA()
				+ ",rating average is " + movie2.getAvg());

		result = movie1.equals(movie2);

		if (result == true)
			System.out.println("They are equal");
		else
			System.out.println("They are different");
	}

}
