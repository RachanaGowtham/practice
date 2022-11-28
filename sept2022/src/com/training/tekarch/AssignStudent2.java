package com.training.tekarch;

public class AssignStudent2 {
	
	String name;
	int roll_no;
	String ph_no;
	String address;

	public static void main(String[] args) {
		AssignStudent2 student1=new AssignStudent2();
		student1.name="Sam";
		student1.roll_no=1;
		student1.ph_no="9877381398";
		student1.address="3rd cross, 1st main road, SriNagar";
	
		AssignStudent2 student2=new AssignStudent2();
		student2.name="John";
		student2.roll_no=3;
		student2.ph_no="98767648765";
		student2.address="7th cross, 3rd main road, New York";
	
		
		System.out.println("\n Student name is: "+student1.name +"\n"+ " Roll no is : "+student1.roll_no +"\n" +"Phone no is : "+student1.ph_no + "\n" +"Address is :"+student1.address);
		System.out.println("\n Student name is: "+student2.name +"\n"+ " Roll no is : "+student2.roll_no +"\n" +"Phone no is : "+student2.ph_no + "\n" +"Address is :"+student2.address);
	
	}
	
	

}
