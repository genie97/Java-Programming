package myPackage;

public class MonthException extends Exception{
	public MonthException(){
		super("Month Error");
	}
	public MonthException(String message){
		super(message);
	}
	public static String convertMonth(String line){
		int position=line.indexOf('/');
		int month=Integer.valueOf(line.substring(0,position));
		String[] c_month=new String[]{"NULL","January", "February","March","April","May","June","July","August","September","October","November","December"};
		
		return c_month[month];
	}
	public static int returnMonth(String line){
		int position=line.indexOf('/');
		int month=Integer.valueOf(line.substring(0,position));
		
		return month;
	}
	public static int checkMonth(String line){
		int month = returnMonth(line);
		if(month>=1&&month<=12)
			return 0;
		return-1;
	}
}
