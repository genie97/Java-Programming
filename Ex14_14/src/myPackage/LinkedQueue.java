package myPackage;

import java.util.*;

public class LinkedQueue extends Linkedlist {

	private int front,count;
	
	LinkedList<Integer> list = new LinkedList<Integer>();
	
	LinkedQueue(){
		front=0;
		count=0;
	}
	public void setCount(int cnt){
		count=cnt;
	}
	public int getCount(){
		return count;
	}
	public void addToQueue(int num){
		list.add(num);
		setCount(getCount()+1);
	}
	public int removeFromQueue(){
		front=list.getFirst();
		list.removeFirst();
		setCount(getCount()-1);
		return front;
	}
	public boolean isEmpty(){
		return list.isEmpty();
	}
	public void Print(){
		System.out.println("The: ");
		Iterator<Integer> listIterator = list.listIterator();
		while(listIterator.hasNext()){
			System.out.print(listIterator.next()+" ");
		}
		System.out.println("Keys are in the Queue");
	}
}
