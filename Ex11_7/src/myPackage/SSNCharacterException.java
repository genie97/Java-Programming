package myPackage;

public class SSNCharacterException extends Exception {
	public SSNCharacterException(){
		super("Error of SSN Character");
	}
	public SSNCharacterException(String message){
		super(message);
	}
	public static boolean ValidCharacter(String SSN){
		char ch;
		int j;
		
		for(j=0;j<SSN.length();j++){
			ch=SSN.charAt(j);
			if(Character.isDigit(ch)==false)
				return false;
		}
		return true;
	}

}
