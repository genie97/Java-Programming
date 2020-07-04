package myPackage;

public class MoneyDemo {

	public static void main(String[] args) {
		Money start =  new Money();
		Money goal = new Money();
		
		System.out.println("Enter your current savings");
		start.readInput();
		
		goal = start.times(2);
		System.out.print("If you double that, you will have ");
		goal.writeOutput();
		
		System.out.println(". or better yet:");
		goal =start.add(goal);
		System.out.println("If you triple that original amount, you will have:");
		goal.writeOutput();
		System.out.println();
		
		System.out.println("Remember: A penny saved");
		System.out.println("is a penny earned.");
	}

}
