package myPackage;

import java.io.*;
import java.util.*;

public class puzzle {

	public static void main(String[] args){
		String inFile = "words.txt";
		Scanner in = null;
		String outFile = "output.txt";
		PrintWriter out = null;
		
		try{
			out = new PrintWriter(outFile);
			in = new Scanner(new File(inFile));
		}
		catch(FileNotFoundException e){
			System.out.println("Error: opening the file" + inFile);
			e.printStackTrace();
		}
		while(in.hasNextLine()){
			String line = in.nextLine();
			if(line.endsWith("dous")){
				System.out.println(line);
				out.println(line);
			}
		}
		in.close();
		out.close();
	}

}
