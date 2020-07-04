package myPackage;

import java.util.*;
import java.io.*;

public class Text {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a input file name: ");
		String inputFile=s.next();
		Scanner input = null;
		PrintWriter output1 = null;
		PrintWriter output2 = null;
		
		int arr[] = new int[10];
		try{
			output1 = new PrintWriter(inputFile);
			System.out.println("Enter 10 integers(ordered): ");
			for(int i=0;i<10;i++)
				arr[i]=s.nextInt();
			for(int i=0;i<10;i++)
				output1.println(arr[i]);
		}
		catch(FileNotFoundException e){
			System.out.println("Error opening te file" + inputFile);
			e.printStackTrace();
		}
		output1.close();
		try{
			input = new Scanner(new File(inputFile));
		}
		catch(FileNotFoundException e){
			System.out.println("Error opening te file" + inputFile);
			e.printStackTrace();
		}
		while(input.hasNextInt()){
			for(int i=0;i<10;i++){
				arr[i]=input.nextInt();
			}
		}
		System.out.println("Enter a output file name: ");
		String outputFile=s.next();
		try{
			output2 = new PrintWriter(outputFile);
			
			for(int i=0;i<10;i++){
				int check=1;
				for(int j=0;j<i;j++){
					if(arr[i] == arr[j]){
						check=0;
						break;
					}
				}
				if(check==1)
					output2.println(arr[i]);
			}
		}
		catch(FileNotFoundException e){
			System.out.println("Error opening te file" + outputFile);
			e.printStackTrace();
		}
		output2.close();
		input.close();
		s.close();
	}
}
