package myPackage;

import java.io.*;
import java.util.*;

public class AbreviationMarker {

	public static void main(String[] args) {
		String input1 = "abbreviations.txt";
		String in = "input.txt";
		String out = "output.txt";
		Scanner input = null;
		
		int index1=0;
		int index2=0;
		int check=0;
		int i=0,j=0;
		
		String ch[], word[];
		
		try{
			input=new Scanner(new File(input1));
			
			while(input.hasNext()){
				input.next();
				index1++;
			}
			input = new Scanner(new File(input1));
		}
		catch(FileNotFoundException e){
			System.out.println("Error: opening the file" + input1);
			e.printStackTrace();
		}
		ch = new String[index1];
		
		while(input.hasNext()){
			ch[i] = new String();
			ch[i] = input.next();
			i++;
		}
		input.close();
		try{
			input=new Scanner(new File(in));
			while(input.hasNext()){
				input.next();
				index2++;
			}
			input = new Scanner(new File(in));
		}
		catch(FileNotFoundException e){
			System.out.println("Error: opening the file" + in);
			e.printStackTrace();
		}
		
		word = new String[index2];
		while(input.hasNext()){
			word[j] = new String();
			word[j] = input.next();
			j++;
		}
		input.close();
		
		PrintWriter output=null;
		try{
			output = new PrintWriter(out);
		}
		catch(FileNotFoundException e){
			System.out.println("Error: opening the file" + out);
			e.printStackTrace();
		}
		
		for(i=0;i<index2;i++){
			check=0;
			for(j=0;j<index1;j++){
				if(ch[j].equalsIgnoreCase(word[i])){
					output.print(" <"+ word[i] + "> ");
					check = 1;
					break;
				}
			}
			if(check==0){
				output.print(" "+word[i]);
			}
		}
		output.close();
	}

}
