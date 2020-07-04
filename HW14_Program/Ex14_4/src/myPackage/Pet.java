package myPackage;

public class Pet {
	  private String name;
	     private int age,weight;
	    
	     public Pet(String newName,int newAge ,int newWeight)
	     {
	          name=newName;
	          age=newAge;
	          weight=newWeight;
	     }
	     public void setName(String newName)
	     {
	          name=newName;
	     }
	     public void setAge(int newAge)
	     {
	          age=newAge;
	     }
	     public void setWeight(int newWeight)
	     {
	          weight=newWeight;
	     }
	     public String getName()
	     {
	          return name;
	     }
	     public int getAge()
	     {
	          return age;
	     }
	     public int getWeight()
	     {
	          return weight;
	     }
	     public String toString()
	     {
	          return "Pet Name: " + name +" Age: " + age +" Weight: " + weight;
	     }
}
