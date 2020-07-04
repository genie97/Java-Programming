package ex4_2bprogram;

public class Counter {
	private int count=0;
	
	public void increase()
	{
		count++;
		if(count<0)
		{
			System.out.println("count value is negative number");
		}
		else
		{
			System.out.println("count : " +  count);
		}
	}
	
	public void decrease()
	{
		count--;
		if(count<0)
		{
			System.out.println("count value is negative number");
		}
		else
		{
			System.out.println("count : " + count);
		}
	}
	
	public void reset()
	{
		count=0;
		System.out.println("count : " + count);
	}	

}
