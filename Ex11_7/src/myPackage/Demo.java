package myPackage;
import java.util.Scanner;
public class Demo {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		int num,salary;
		String SSN,name;
		
		System.out.println("Type the number of employee: ");
		num=keyboard.nextInt();
		
		Employee[] employee = new Employee[num];
		
		for(int i=0;i<num;i++)
			employee[i] = new Employee();
		
		for(int i=0;i<num;i++){
			try{
				System.out.println("Type the name: ");
				name=keyboard.next();
				employee[i].setName(name);
				
				System.out.println("Type the salary: ");
				salary=keyboard.nextInt();
				employee[i].setSalary(salary);
				
				System.out.println("Type the SSN: ");
				SSN=keyboard.next();
				employee[i].setSSN(SSN);
				
				System.out.println();
				
				if(!SSNLengthException.ValidLength(SSN))
					throw new SSNLengthException("Exception : Error of type SSN Length ");
				if(!SSNCharacterException.ValidCharacter(SSN))
					throw new SSNCharacterException("Exception : Error of type SSN Character ");	
			}
			catch(SSNLengthException l){
				System.out.println(l.getMessage());
				System.out.println();
			}
			catch(SSNCharacterException c){
				System.out.println(c.getMessage());
				System.out.println();
			}
		}
		System.out.println("===========================================");
		for(int i=0;i<num;i++){
			System.out.println("i's Name: " + i + employee[i].getName());
			System.out.println("i's Salary: " + i + employee[i].getSalary());
			System.out.println("i's SSN: " + i + employee[i].getSSN());
		}
	}
}
