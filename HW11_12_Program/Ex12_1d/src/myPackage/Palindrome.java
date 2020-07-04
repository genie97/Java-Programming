package myPackage;

public class Palindrome {
	public static boolean checkPalindrome(String s){
		char[] arr = s.toCharArray();
		String str="";
		for(int i=0;i<arr.length;i++){
			if(Character.isLetter(arr[i])) 
				str += Character.toLowerCase(arr[i]);
		}
		return checkPalindrome2(str);
	}
	
	public static boolean checkPalindrome2(String s){
		if(s.length()<=1)
			return true;
		else if(s.charAt(0)!=s.charAt(s.length()-1))
			return false;
		else
			return checkPalindrome2(s.substring(1,s.length()-1));
	}

	public static void main(String[] args) {
		System.out.println("abcbaf: " + checkPalindrome("abcbaf"));
		System.out.println("Straw? No, too stupid a fad, I put soot on warts.: " + checkPalindrome("Straw? No, too stupid a fad, I put soot on warts."));
	}
}
