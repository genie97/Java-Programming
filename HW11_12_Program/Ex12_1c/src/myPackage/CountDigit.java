package myPackage;

public class CountDigit {
	public static int countDigit(String s){
		int count=0;
		if(s.length()>0){
			if((s.charAt(0))-'0'>=0&&(s.charAt(0))-'0'<=9)
				return  countDigit(s.substring(1))+1;
			else
				return countDigit(s.substring(1));
		}
		return 0; 
	}
	public static void main(String[] args) {
		String s1="010-2356-1245";
		String s2="031-234-3562";
		
		System.out.println("s1: Count number is " + countDigit(s1));
		System.out.println("s2: Count number is " + countDigit(s2));

	}

}
