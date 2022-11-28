package com.training.tekarch;

public class AssignTriangle {
	int base=3; int side1=4; int side2=5;

	public static void main(String[] args) {
		
		AssignTriangle obj1= new  AssignTriangle();
		obj1.area();
		obj1.perimeter();
		
	}
	public void area() {
		int tri_area= base * side1 * side2;
		System.out.println("Area of Triangle is : "+tri_area);	
	}
	public void perimeter() {
		int tri_perimeter= base + side1 + side2;
		System.out.println("Perimeter of Triangle is : "+tri_perimeter);	
	}

}
