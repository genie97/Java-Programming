package myPackage;

import java.util.*;

public class Linkedlist {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int value,opt;
		LinkedQueue list = new LinkedQueue();
		System.out.println("1.PUSH 2.POP 3.PRINT 4.END");
		
		while(true){
			System.out.println("choose program: ");
			opt=keyboard.nextInt();
			if(opt==1){
				System.out.println("Type the value: ");
				value=keyboard.nextInt();
				list.addToQueue(value);
			}
			else if(opt==2){
				if(list.isEmpty()){
					System.out.println("The Queue is empty");
					break;
				}
				else
					System.out.println("The: " +  list.removeFromQueue() + " Deleted");
			}
			else if(opt==3){
				list.Print();
				System.out.println("The count of items in the queue: " + list.getCount());
			}
			else
				System.exit(1);
		}
	}
}
