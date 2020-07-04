package myPackage;

import java.util.HashSet;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		String[] s = {"apple","banana","pear","apple","banana","orange","apple"};
		String[] r = {"apple"};
		LinkedList<String>list = arrayToLinkedList(s);
		
		System.out.println("Array to LinkedList:");
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		System.out.println();
		System.out.println("Remove apple in list:");
		removeFromLinkedList(list,r);
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		
	}
	public static LinkedList<String> arrayToLinkedList(String[] s){
		LinkedList<String> word = new LinkedList<String>();
		for(int i=0;i<s.length;i++){
			word.add(s[i]);
		}
		return word;
	}
	
	public static void removeFromLinkedList(LinkedList<String>list, String[] s){
		for(int i=0;i<s.length;i++)
			while(list.contains(s[i]))
				list.remove(s[i]);
	}
}
