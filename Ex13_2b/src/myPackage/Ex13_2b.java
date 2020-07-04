package myPackage;

import java.io.*;
import java.util.*;

public class Ex13_2b {
	public static final String input = "input.txt";
	public static final String output = "output.dat";
	public static void main(String[] args) {
		try{
			Scanner scan = new Scanner(new File(input));
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(output));
			int cur = scan.nextInt();
			out.writeInt(cur);
			while(scan.hasNextInt()){
				int next=scan.nextInt();
				byte dif = (byte)(next-cur);
				out.writeByte(dif);
				cur=next;
			}
			scan.close();
			out.close();
		}
		catch(FileNotFoundException e1){
			System.out.println("Error : opening file");
			e1.printStackTrace();
		}
		catch(IOException e2){
			e2.printStackTrace();
		}
		try{
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(output));
			int cur= in.readInt();
			System.out.print(cur+" ");
			try{
				while(true){
					byte dif = in.readByte();
					cur+=(int)dif;
					System.out.print(cur + " ");
				}
			}
			catch(EOFException e){
				in.close();
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}