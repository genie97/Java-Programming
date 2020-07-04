package ex4_2a;

public class MotorBoat {

	public static final double capacity = 150.0;
	public static final double maxSpeed = 120.0;
	private double fuel;
	private double curSpeed;
	private double efficiency;
	
	public double getfuel()
	{
		return fuel;	
	}
	public double getcurSpeed()
	{
		return curSpeed;
	}
	public double getefficiency()
	{
		return	efficiency;
	}
	
	public void setfuel(double f)
	{
		if(f<0||f>capacity)
		{
			System.out.println("Error: Wrong value");
		}
		else
		{
			fuel=f;
		}
	}
	public void setcurSpeed(double s)
	{
		if(s<0||s>maxSpeed)
		{
			System.out.println("Error: Wrong value");
		}
		else
		{
			curSpeed=s;
		}
	}
	public void setefficiency(double e)
	{
		if(e<0)
		{
			System.out.println("Error: Wrong value");
		}
		else
		{
			efficiency=e;
		}
	}
	
	public void need_fuel(int time)
	{
		double curFuel,maxFuel;
		curFuel=efficiency*curSpeed*curSpeed*time;
		maxFuel=efficiency*maxSpeed*maxSpeed*time;
		System.out.println("Amount of fuel used at maximum speeds: " + maxFuel);
		System.out.println("Amount of fuel used at current speeds: " + curFuel);
			
	}
	public void travel_distance(int time)
	{
		double curDis,maxDis;
		curDis=curSpeed*time;
		maxDis=maxSpeed*time;
		System.out.println("Travel distance used at maximum speeds: " + maxDis);
		System.out.println("Travel distance used at current speeds: " + curDis);
	}
	public void travelDis()
	{
		double curDis;
		curDis=fuel/(efficiency*curSpeed);
		System.out.println("Travel distance used at current speeds(for s anf f): " + curDis);
	}
	
	
	
	
}
