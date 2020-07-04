package myPackage;

public abstract class payCalculator {
	double payRate;
	public double computePay(double hours){
		return payRate*hours;
	}
}
