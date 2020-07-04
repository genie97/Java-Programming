package myPackage;

public class InvalidTimeException extends Exception{
	public InvalidTimeException(){
			super("Error: Format is wrong");
	}
	public static boolean checkTime(String t){
		String hh = t.substring(0,t.indexOf(':'));
		if(!checkHour(hh))
			return false;
		String mm = t.substring(t.indexOf(':')+1,t.indexOf(' '));
		if(!checkMinute(mm))
			return false;
		String xx = t.substring(t.indexOf(' ')+1);
		if(!(xx.equalsIgnoreCase("am")||xx.equalsIgnoreCase("pm")))
			return false;
		return true;
	}
	public static boolean checkHour(String hh){
		int h = Integer.parseInt(hh);
		if(!(0<=h&&h<=12))
			return false;
		return true;
	}
	public static boolean checkMinute(String mm){
		int m = Integer.parseInt(mm);
		if(!(0<=m&&m<=59))
			return false;
		return true;
	}
}