package myPackage;

public class TimeDemo{
	
	public static void main(String[] args) {
		System.out.println("First case: 1:30");
		try{
			if(!InvalidHourException.checkHour("1"))
				throw new InvalidHourException();
			if(!InvalidMinuteException.checkMinute("30"))
				throw new InvalidMinuteException();
			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		System.out.println("Second case: 13:60");
		try{
			if(!InvalidHourException.checkHour("13"))
				throw new InvalidHourException();
			if(!InvalidMinuteException.checkMinute("60"))
				throw new InvalidMinuteException();
			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}

