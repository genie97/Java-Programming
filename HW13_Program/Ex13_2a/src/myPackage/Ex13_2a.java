package myPackage;

import java.io.*;
import java.util.*;

public class Ex13_2a {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a file name: ");
		String fileName=keyboard.next();
		
		double[] arr = new double[10];
		double sum=0,min=0,max=0;
		
		try{
			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
			System.out.println("10 random integers list:");
			for(int i=0;i<10;i++){
				arr[i]=Math.random()*100.0;
				System.out.println(arr[i]);
				outputStream.writeDouble(arr[i]);
			}
			 
			System.out.println('\n');
			System.out.println("================================");
			outputStream.close();
		}		
		catch(IOException e){
			e.printStackTrace();
		}
		
		
		/*file open and read*/
		try{
			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName));
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
			inputStream.close();
		}		
		catch(IOException e){
			e.printStackTrace();
		}
		keyboard.close();
		System.out.println("min: " + min);
		System.out.println("max: " + max);
		System.out.println("sum: " + sum);
		System.out.println("average: " + sum/10);
		
	}

}
