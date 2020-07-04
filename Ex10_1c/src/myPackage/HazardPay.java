package myPackage;

public class HazardPay extends payCalculator{
	public HazardPay(double payRate){
		this.payRate=payRate;
	}
	@Override
	public double computePay(double hours) {
		return 1.5*super.computePay(hours);
	}

}
