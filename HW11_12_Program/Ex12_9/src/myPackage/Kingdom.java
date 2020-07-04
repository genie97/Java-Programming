package myPackage;

public class Kingdom {
	public static int getTotal(int k, int grains){
		int total=0;
		if(k==1)
			return grains;
		else{
			total+=grains;
			grains=grains*2;
			
			return getTotal(--k,grains)+(total);
		}
	}
	public static void main(String[] args) {
		System.out.println("<Kingdom1 : 5 squares, 1 grain> The total: " + getTotal(5,1));
		System.out.println("<Kingdom2 : 6 squares, 2 grain> The total: " + getTotal(6,2));
	}

}
