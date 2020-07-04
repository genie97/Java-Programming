package myPackage;

import java.util.*;

public class PetDemo {

	public static void main(String[] args) {
		Scanner keyboard  = new Scanner(System.in);
		ArrayList<Pet> origin = new ArrayList<Pet>();
		Pet p1 = new Pet("coco",1,1);
		origin.add(p1);
		Pet p2 = new Pet("golden",1,2);
		origin.add(p2);
		Pet p3 = new Pet("aiden",3,2);
		origin.add(p3);
		System.out.println("Before:");
		for(int i=0;i<origin.size();i++)
			System.out.println(origin.get(i));
		int cmp=0;
		Pet tmp = new Pet("NULL",0,0);
		
		for(int i=0;i<origin.size();i++){
			for(int j=i;j<origin.size();j++){
				cmp = origin.get(i).getName().compareTo(origin.get(j).getName());
				if(cmp>0){
					tmp=origin.get(i);
					origin.set(i, origin.get(j));
					origin.set(j, tmp);
				}
			}
		}
		
		System.out.println("After:");
		for(int i=0;i<origin.size();i++)
			System.out.println(origin.get(i));
	}

}
