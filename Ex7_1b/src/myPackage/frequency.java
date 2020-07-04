package myPackage;

import java.util.Scanner;

public class frequency {

	public static void main(String[] args) {
		Scanner keyboard  = new Scanner(System.in);
		
		String phone;
		int num=0;
		int opt=0;
		int[] frequency = new int[10];
		
		for(int i=0;i<frequency.length;i++){
			frequency[i]=0;
		}		
		
		while(true){
			System.out.println("1.Execute 2.Reset 3.End");
			opt=keyboard.nextInt();
			
			if(opt==1){
				System.out.println("Enter a phone number: ");
				phone = keyboard.next();
				for(int i=0;i<phone.length();i++){
					if(Character.isDigit(phone.charAt(i))){
						num=phone.charAt(i)-'0';
						frequency[num]++;
					}	
				}
				for(int i=0;i<frequency.length;i++){
					System.out.println(i +" frequency : " + frequency[i]);
				}
			}
			else if(opt==2){
				for(int i=0;i<frequency.length;i++){
					frequency[i]=0;
				}
			}
			else
				System.exit(0);
		}
	}
}
