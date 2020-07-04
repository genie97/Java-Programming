package hw4_program2;

public class MotorBoat {
	
	public double capacity;
	public double fuel;
	public double maxSpeed;
	public double curSpeed;
	public double efficiency;
	
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
		double curDis,maxDis;
		curDis=fuel/(efficiency*curSpeed);
		System.out.println("Travel distance used at current speeds(for s anf f): " + curDis);
	}

}
