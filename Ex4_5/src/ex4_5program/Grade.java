package ex4_5program;

public class Grade {
	private int gradeA=0,gradeB=0,gradeC=0,gradeD=0,gradeF=0,total=0;
    private double perA=0,perB=0,perC=0,perD=0,perF=0;
    
    public void setGrade(char grade)
    {
    	grade=Character.toLowerCase(grade);
    	switch(grade)
    	{
    	case 'a':
    		gradeA++;
    		total++;
    		break;
    	case 'b':
    		gradeB++;
    		total++;
    		break;
    	case 'c':
    		gradeC++;
    		total++;
    		break;
    	case 'd':
    		gradeD++;
    		total++;
    		break;
    	case 'f':
    		gradeF++;
    		total++;
    		break;
    	default:
			System.out.println("Error: wrong grade");
    		break;
    	}
    }
    public void setPerGrade() 
    {
    		if (total == 0)
    		{
    			System.out.println("error");
    		}
    		else 
    		{
    			perA = (double) gradeA / total * 100;
    			perB = (double) gradeB / total * 100;
    			perC = (double) gradeC / total * 100;
    			perD = (double) gradeD / total * 100;
    			perF = (double) gradeF / total * 100;
    			
    		}
    	}
    public void print()
    {
    	System.out.println("0    10   20   30   40   50   60   70   80   90   100%");
    	System.out.println("|    |    |    |    |    |    |    |    |    |   |");
    	System.out.println("**************************************************");
    	
    	for (int i = 0; i < Math.round((Math.round(perA))/2); i++) 
    	{
    		System.out.print("*");
    	}
    	System.out.println("A");
	
    	for (int i = 0; i < Math.round((Math.round(perB))/2); i++) 
    	{
    		System.out.print("*");
		}
    	System.out.println("B");

    	for (int i = 0; i < Math.round((Math.round(perC))/2); i++) 
    	{
    		System.out.print("*");
		}
    	System.out.println("C");
	
    	for (int i = 0; i < Math.round((Math.round(perD))/2); i++) 
    	{	
    		System.out.print("*");
    	}
    	System.out.println("D");
	
    	for (int i = 0; i < Math.round((Math.round(perF))/2); i++) 
    	{
    		System.out.print("*");
		}
    	System.out.println("F");
    }
    
    public int getTotal() 
    {
    	return total;
	}
    public int getGradeA() 
    {
    	return gradeA;
    }
    public int getGradeB() 
    {
    	return gradeB;
    }
    public int getGradeC() 
    {
    	return gradeC;
    }
    public int getGradeD() 
    {
    	return gradeD;
   	}
    public int getGradeF() 
    {
    	return gradeF;
    }
    public double getperA() 
    {
    	return perA;
    }
    public double getperB()
    {
    	return perB;
    }
    public double getperC() 
    {
    	return perC;
	}
    public double getperD() 
    {
    	return perD;
	}
    public double getperF() 
    {
    	return perF;
	}
}