package myPackage;

public class Polynomial {
	private int degree;
	private double[] coefficient;
	
	Polynomial(int max){
		degree=max;
		coefficient = new double[degree+1];
		for(int i=0;i<degree+1;i++)
			coefficient[i]=0;
	}
	public void setConstant(int i, int value){
		if(i<0||i>degree)
			return;
		coefficient[i]=value;
	}
	public double evaluate(double x){
		double value = 0;
		for(int i=degree;i>=0;i--)
			value=value+coefficient[i]*Math.pow(x,i);
		return value;
	}
	
}
