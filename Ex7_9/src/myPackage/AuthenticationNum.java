package myPackage;

public class AuthenticationNum {
	private int actualPinNum;
	private int[] num = new int[10];
	
	public void authenticate(int pw){
		int temp=actualPinNum;
		int unit = 10;
		int digit;
		int pwDigit;
		int flag=0;
		
		for(int i=0;i<5;i++){
			digit=temp%unit;
			temp=temp/unit;
			pwDigit=pw%unit;
			pw=pw/unit;
			if(num[digit]==pwDigit){
				flag++;
			}
		}
		if(flag==5)
			System.out.println("Correctly matches the PIN number");
		else
			System.out.println("Not correctly matches the PIN number");
	}
	public void setActualNum(int pw){
		actualPinNum=pw;
	}
	private void randomNum(){
		for(int i=0;i<10;i++){
			num[i]=(int)(Math.random()*3+1);
		}
	}
	public void display(){
		System.out.print("PIN: ");
		for(int i=0;i<10;i++){
			System.out.print(i+" ");
		}
		System.out.println();
		randomNum();
		System.out.print("NUM: ");
		for(int i=0;i<10;i++){
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}
}
