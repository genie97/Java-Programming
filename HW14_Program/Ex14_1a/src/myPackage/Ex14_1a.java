package myPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex14_1a {

	public static void main(String[] args) {
		String[] s = {"apple","banana","pear","apple","banana","orange","apple"};
		ArrayList<String>list = arrayToArrayList(s);
		
		System.out.println("Array to ArrayList:");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		System.out.println();
		System.out.println("Remove apple in list:");
		removeFromArrayList(list,"apple");
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
	public static ArrayList<String> arrayToArrayList(String[] s){
		ArrayList<String> word = new ArrayList<String>();
		for(int i=0;i<s.length;i++){
			word.add(s[i]);
		}
		return word;
	}
	public static void removeFromArrayList(ArrayList<String>list, String s){
		for(int i=0;i<list.size();i++)
			if(s.equalsIgnoreCase(list.get(i))){
				list.remove(i);
				i=0;
			}
	}
}
