package myPackage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex13_1b {
	public static final String inputFile="input.txt";
	public static final String outputFile="output.txt";
	public static void main(String[] args) {
		Scanner inputStream = null;
		PrintWriter outputStream=null;
		
		try{
			inputStream = new Scanner(new File(inputFile));
			outputStream = new PrintWriter(outputFile);
		}
		catch(FileNotFoundException e){
			System.out.println("Error opening the file" + inputFile);
			System.exit(0);
		}
		
		while(inputStream.hasNext()){
			String firstName = inputStream.next();
			String lastName = inputStream.next();
			outputStream.println(firstName+" "+lastName);
			System.out.println(firstName+" "+lastName);
		}
		inputStream.close();
		outputStream.close();
	}

}
