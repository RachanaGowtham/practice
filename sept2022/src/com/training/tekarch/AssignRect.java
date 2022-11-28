package com.training.tekarch;

public class AssignRect {

	public static void main(String[] args) {
		AssignRect a_r= new AssignRect();
		int x=a_r.rect(4, 5);
		AssignRect a_r1= new AssignRect();
		int y=a_r1.rect(5, 8);
		
		System.out.println("Area of Rectangle with side (4,5): "+x);
		System.out.println("Area of Rectangle with side (5,8): "+y);

	}
	public int rect(int length, int breadth) {
		int area=length * breadth;
		return area;
	}

}
