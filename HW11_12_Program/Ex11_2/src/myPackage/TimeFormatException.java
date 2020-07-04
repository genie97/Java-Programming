package myPackage;

public class TimeFormatException extends Exception {
	public TimeFormatException(){
		super("There is no such time as ");
	}
	public TimeFormatException(String message){
		super(message);
	}
}
