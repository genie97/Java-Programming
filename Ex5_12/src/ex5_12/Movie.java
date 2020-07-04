package ex5_12;

public class Movie {
	private String name,rate_MPPAA;
	private int tb_rate=0, bd_rate=0, ok_rate=0, gd_rate=0, gt_rate=0; 
	private double avg;
	public int count=0;
	
	public String getName()
	{
		return name;	
	}
	public String getRate_MPPAA()
	{
		return rate_MPPAA;	
	}
	public double getAvg()
	{
		avg=(double)((tb_rate*1)+(bd_rate*2)+(ok_rate*3)+(gd_rate*4)+(gt_rate*5))/count;
		return avg;
	}
	public boolean equals(Movie movie)
	{
		return this.name.equals(movie.name)&&
			   this.rate_MPPAA.equals(movie.rate_MPPAA)&&
			   this.tb_rate==movie.tb_rate&&
			   this.bd_rate==movie.bd_rate&&
			   this.ok_rate==movie.ok_rate&&
			   this.gd_rate==movie.gd_rate&&
			   this.gt_rate==movie.gt_rate;
	}
	public int gettb_rate()
	{
		return tb_rate;
	}
	
	public int getbd_rate()
	{
		return bd_rate;
	}
	
	public int getok_rate()
	{
		return ok_rate;
	}
	
	public int getgd_rate()
	{
		return gd_rate;
	}
	
	public int getgt_rate()
	{
		return gt_rate;
	}
	
	public void setMovieRate(String rating){
		rate_MPPAA=rating;
	}
	public void setMovieName(String Movie_name){
		name=Movie_name;
	}
	public void addRating(int rate)
	{
		switch(rate)
		{
		case 1:
			tb_rate++;
			count++;
			break;
		case 2:
			bd_rate++;
			count++;
			break;
		case 3:
			ok_rate++;
			count++;
			break;
		case 4:
			gd_rate++;
			count++;
			break;
		case 5:
			gt_rate++;
			count++;
			break;
		default:
			System.out.println("Error: rate is not a number between 1 and 5");	
		}
	}	
	
}
