package myPackage;

import java.io.*;
import java.util.*;

public class Haberman
{
    public static void main(String[] args){
    	int numSurvive=0;
    	int numDie=0;
    	int totalSurvive=0;
    	int totalDie=0;
    	
    	String fileName="haberman.data";
    	
    	try{
    		Scanner in = new Scanner(new File(fileName));
    		while(in.hasNextLine()){
    			String line = in.nextLine();
    			String[] arr = line.split(",");
    			int node = Integer.parseInt(arr[2]);
    			int status = Integer.parseInt(arr[3]);
    			
    			if(status == 1){
    				totalSurvive+=node;
    				numSurvive++;
    			}
    			else{
    				totalDie+=node;
    				numDie++;
    			}		
    		}
    		in.close();
			
			double avgSurvive = (double)totalSurvive / numSurvive;
			double avgDie = (double)totalDie / numDie;
			
			System.out.println("Patients living 5 years or more: " + avgSurvive);
			System.out.println("Patients dying within 5 years: " + avgDie);  	
    	}
    	catch(FileNotFoundException e){
    		System.out.println("Error: opening the file" + fileName);
    		e.printStackTrace();
    	}
    	catch(IOException e){
    		System.out.println("Error");
    		e.printStackTrace();
    	}
    }
}