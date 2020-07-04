package myPackage;

public class TimeDemo{
	public static void main(String[] args){
		String t1="4:30 am";
		String t2="13:60 pm";
		try{
			System.out.println("First case: " + t1);
			if(!InvalidTimeException.checkTime(t1))
				throw new InvalidTimeException();
			System.out.println("Second case: " + t2);
			if(!InvalidTimeException.checkTime(t2))
				throw new InvalidTimeException();	
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}

