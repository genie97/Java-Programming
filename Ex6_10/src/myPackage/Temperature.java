package myPackage;

public class Temperature {
	private double degrees;
	private double convertDegrees;
	private char convertScale;
	private char scale;
	
	public Temperature(double degrees, char scale){
		this.degrees=degrees;
		this.scale=Character.toUpperCase(scale);
	}
	public Temperature(double degrees){
		this.degrees=degrees;
		scale='C';
	} 
	public Temperature(char scale){
		degrees=0;
		this.scale=Character.toUpperCase(scale);
	} 
	public Temperature(){
		degrees=0;
		scale='C';
	}
	public void setDegrees(double degrees){
		this.degrees=degrees;
	}
	public void setScale(char scale){
		this.scale=Character.toUpperCase(scale);
	}
	
	public void setBoth(double degrees,char scale){
		this.degrees=degrees;
		this.scale=Character.toUpperCase(scale);
	}
	
	public double getCelsius(){
		if(this.scale=='C')
			return degrees;
		else
			convertDegrees= Math.round((degrees-32)/1.8);
			return convertDegrees;
	}

	public double getFahrenheit(){
		if(this.scale=='F')
			return degrees;
		else
			convertDegrees =  Math.round((degrees*1.8)+32);
			return convertDegrees;
	}

	public double getDegrees(){
		return degrees;
	}
	public char getScale(){	
			return scale;
	}
	public boolean compareEqual(Temperature temp1){
		return(this.getCelsius()==temp1.getCelsius());
	}
	public boolean compareLarger(Temperature temp1){
		return(this.getCelsius()>temp1.getCelsius());
	}
	public boolean compareSmaller(Temperature temp1){
		return(this.getCelsius()<temp1.getCelsius());
	}
}
