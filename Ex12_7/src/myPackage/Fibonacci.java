package myPackage;

public class Fibonacci {
	private static int i=2;
	
	public static void main(String[] args) {
		int n=5;
		if(n==1)
			System.out.println("Fibonacci#1 = 0");
		else if(n>=2){
			System.out.println("Fibonacci#1 = 0");
			System.out.println("Fibonacci#2 = 1");
			Fibonacci(n,0,1);
			}
	}
	public static long Fibonacci(int n,int a, int b){
		if(n==0)
			return a;
		else if(n==1)
			return b;
		else if(n==2)
			return a+b;
		else{
			i++;
			double r= (a+b)/(double)b;
			System.out.println("Fibonacci#" + i + " = " + (a+b) + "; " + (a+b) + "/" + b + " = " + r);
			return Fibonacci(--n,b,a+b);		
		}
	}

}
