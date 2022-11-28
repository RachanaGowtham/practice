package com.training.tekarch;

/* Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. 
 * Assign the value of roll_no as'2' and that of name as "John" by creating an object of the class
 * Student 
 */

public class AssignStudent {
	
	String name;
	int roll_no;

	public static void main(String[] args) {
		
		AssignStudent obj= new AssignStudent();
		obj.name="John";
		obj.roll_no=2;
		
		System.out.println("Student name is : "+obj.name +" and roll no is : "+obj.roll_no);

	}
	
	

}
