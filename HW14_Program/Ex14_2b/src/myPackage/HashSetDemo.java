package myPackage;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		String[] s = {"apple","banana","pear","apple","banana","orange","apple"};
		String[] r = {"apple"};
		HashSet<String>list = arrayToHashSet(s);
		
		System.out.println("Array to HashSet:");
		printSet(list);
		System.out.println();
		System.out.println("Remove apple in list:");
		removeFromHashSet(list,r);
		printSet(list);
	}
	
	public static HashSet<String> arrayToHashSet(String[] s){
		HashSet<String> word = new HashSet<String>();
		for(int i=0;i<s.length;i++){
			word.add(s[i]);
		}
		return word;
	}
	
	public static void removeFromHashSet(HashSet<String>list, String[] s){
		for(int i=0;i<s.length;i++)
			list.remove(s[i]);
	}
	private static void printSet(HashSet<String> intSet) {
		System.out.println("The set contains: ");
		for(Object obj :  intSet.toArray()){
			String str = (String)obj;
			System.out.println(str);
		}
	}
}
