package myPackage;

import java.util.Scanner;

public class CharacteristicDemo {

	 public static void main(String[] args) {
		 Characteristic desc1 = new Characteristic("Movie");
		 Characteristic desc2 = new Characteristic("Drama");
		 
		 desc1.setRating();
		 System.out.println("Rate is for : " + desc1.getDescription());
		 System.out.println();
		 
		 desc2.setRating();
		 System.out.println("Rate is for " + desc2.getDescription());
		 System.out.println();
	
		 Characteristic desc3 = new Characteristic("sports");
		 desc3.setRating(9);
		 Characteristic desc4 = new Characteristic("sports");
		 desc4.setRating(9);
		 System.out.println("Compatibility measure for same rate and description."); 
		 System.out.println(desc3.getCompatability(desc4));
		 System.out.println("Compatibility measure for desc1 and desc2");
		 System.out.println(desc2.getCompatability(desc1));
		 desc3.setRating(3);
		 desc4.setRating(9);
		 System.out.println("Compatibility measure for desc3 and desc4");
		 System.out.println(desc3.getCompatability(desc4));
	 }
}
