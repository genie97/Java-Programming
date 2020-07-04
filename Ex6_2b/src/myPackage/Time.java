package myPackage;

public class Time {
	private int hour;
	private int minute;
	
	public Time(){
		hour = 0;
		minute = 0;
	} 
	
	public Time(int hour, int minute){
		if(isValid(hour,minute)){
			this.hour=hour;
			this.minute=minute;
			}
	}
	
	public Time(int hour,int minute, boolean isPM){
		if(isPM)
			hour=hour+12;
		setTime(hour, minute);
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
	
	public static boolean isValid(int hour, int minute){
		return((0<=hour)&&(hour<=23)&&(0<=minute)&&(minute<=59));
	}

	public String getTime24(){
		return String.format("%02d%02d",hour,minute);
	}
	
	public  String getTime12(){
		int hour=this.hour;
		boolean isPM = false;
		
		if(hour>12){
			hour=hour-12;
			isPM=true;
		}
		return String.format("%d:%02d %s",hour,minute,(isPM)?("PM"):("AM"));
	}
}
