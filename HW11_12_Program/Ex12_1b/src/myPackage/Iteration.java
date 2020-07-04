package myPackage;

public class Iteration {
	public static void displayAsWords(int number, int size){
		while(number>0){
			System.out.print(" " + getWordFromDigit(number/(int)Math.pow(10, size-1)));
			number=number%(int)Math.pow(10, size-1);
			size--;
		}
	}
	public static String getWordFromDigit(int digit){
		String[] word =new String[]{
				"zero","one","two","three","four",
				"five","six","seven","eight","nine"
		};
		return word[digit];
	}
	public static void main(String[] args) {
		 displayAsWords(987,3);
		 System.out.println();
		 displayAsWords(918734,6);
	}
}
