package myPackage;

import java.util.HashMap;
import java.util.Scanner;

public class Histogram {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		HashMap<Integer,Integer> list = new HashMap<Integer,Integer>();
		int cnt=0, num=0;
		
		System.out.println("Enter numbers: ");
		do{
			num=keyboard.nextInt();
			int check = search(num,list);
			if(num<0)
				break;
			list.put(num,check);
		}while(num>0);
		for(Integer number : list.keySet()){
			Integer count = list.get(number);
			System.out.println("The number " + number +" occurs " + count +" times");
		}	
	}
	public static int search(Integer num, HashMap<Integer,Integer> histogram){
		int flag=1;
		for(Integer a : histogram.keySet()){
			Integer cnt = histogram.get(a);
			flag=cnt;
			if(num==a){
				return cnt+1;
			}
			else
				flag=1;
		}
		return flag;
	}
}
