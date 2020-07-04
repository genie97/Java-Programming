package hw3_Program;

import java.util.Scanner;

public class Ex3_9 {

	public static void main(String[] args) {
			
		Scanner keyboard = new Scanner(System.in);
		String word="0",comWord="0";
		int Lword,i,flag;
		
		while(true){
			System.out.println("Enter a word: ");
			word=keyboard.next();
			
			if("quit".equalsIgnoreCase(word)){
				System.out.println("End program");
				break;
			}
			
			else{
				Lword=word.length();
				comWord=word;
				word=word.substring(1)+word.charAt(0);
				System.out.println(word);
				comWord=new StringBuilder(comWord).reverse().toString();
			    flag=word.compareTo(comWord);
			
				if(flag==0){
					System.out.println("Same word");
				}
				else{
					System.out.println("different word");
				}
			}	
		}
	}
}
