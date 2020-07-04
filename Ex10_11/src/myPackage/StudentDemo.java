package myPackage;

import java.util.Arrays;

public class StudentDemo {

	public static void main(String[] args) {
		Student[] s = new Student[3];
		s[0] = new Student("Jack",120);
		s[1] = new Student("Henri",250);
		s[2] = new Student("Jennie",345);
		
		Arrays.sort(s);
		
		for (Student st : s){
			System.out.println(st.toString());
		}

	}

}
