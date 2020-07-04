package myPackage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex13_1a {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a file name: ");
		String fileName=keyboard.next();
		Scanner inputStream = null;
		PrintWriter outputStream=null;
		
		int[] arr = new int[10];
		int sum=0,min=0,max=0;
		
		
		try{
			outputStream = new PrintWriter(fileName);
		}		
		catch(FileNotFoundException e){
			System.out.println("Error opening the file" + fileName);
			System.exit(0);
		}
		
		/*print on the console*/
		System.out.println("10 random integers list:");
		for(int i=0;i<10;i++){
			arr[i]=(int)(Math.random()*100);
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("================================");
		
		
		try{
			inputStream = new Scanner(new File(fileName));
		}		
		catch(FileNotFoundException e){
			System.out.println("Error opening the file" + fileName);
			System.exit(0);
		}
		while(inputStream.hasNextInt()){
			for(int i=0;i<10;i++){
				arr[i]=inputStream.nextInt();
			}
		}
		for(int i=0;i<9;i++){
			sum=sum+arr[i];
		}
		max=arr[0];
		for(int i=0;i<10;i++){
			if(arr[i]>max)
				max=arr[i];
		}
		min=arr[0];
		for(int i=0;i<10;i++){
			if(arr[i]<min)
				min=arr[i];
		}
		
		System.out.println("Sum: " + sum );
		System.out.println("Average: " + sum/10);
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		
		outputStream.println("10 random integers list:");
		for(int i=0;i<10;i++)
			outputStream.print(arr[i] + " ");
		outputStream.println();
		outputStream.println("================================");
		outputStream.println("Sum: " + sum );
		outputStream.println("Average: " + sum/10);
		outputStream.println("Min: " + min);
		outputStream.println("Max: " + max);
		
		keyboard.close();
		outputStream.close();
		inputStream.close();
	}
}
