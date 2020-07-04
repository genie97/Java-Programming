package myPackage;

public class Time {
	private int hour;
	private int minute;
	
	public Time(){
		hour = 0;
		minute = 0;
	} 
	
	public static boolean isValid(int hour, int minute){
		return((0<=hour)&&(hour<=23)&&(0<=minute)&&(minute<=59));
	}
	
	public void setTime(int hour, int minute){
		if(isValid(hour,minute)){
			this.hour=hour;
			this.minute=minute;
			}
	}
	public void setTime2(int hour,int minute, boolean isPM){
		if(isPM)
			hour=hour+12;
			setTime(hour, minute);
	}
	public void print(){
		System.out.println("Time is : " + hour+ ":" + minute);
	}
}
