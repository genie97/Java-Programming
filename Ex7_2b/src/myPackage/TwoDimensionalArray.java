package myPackage;

public class TwoDimensionalArray {
	public static double getSum(double[][]arr, int row){
		double sum=0.0;
		if(row<0||row>=arr.length)
			return 0.0;
		for(int col=0;col<arr[row].length;col++)
			sum=sum+arr[row][col];
		return sum;
	}
	public static double getAverage(double[][]arr, int column){
		double sum=0.0,avg=0.0;
		if(column<0||column>=arr[0].length)
			return 0.0;
		for(int row=0;row<arr.length;row++)
			sum=sum+arr[row][column];
		avg=sum/arr.length;
		return avg;
	}
	public static void main(String[] args) {
		double[][] arr = {
				{1,2,3,4,5},
				{2,3,4,5,6},
				{3,4,5,6,7},
				{4,5,6,7,8}
		};
		System.out.println("Sum is " + getSum(arr,1));
		System.out.println("Average is " +getAverage(arr,3));
	}
}
