package com.training.tekarch;

import java.util.Scanner;

//5 .to print the area(width*height) and perimeter(2*(width+height)) of a rectangle

public class JavaPrg5 {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		System.out.println("Enter the width of the rectangle : ");
		float w= num.nextFloat();
		System.out.println("Enter the height of the rectangle : ");
		float h= num.nextFloat();
		
		
		float area=(float)w*h;
		System.out.println("Area of the rectangle is : "+area);
		
		float perimeter=(float)(2*(w+h));
		System.out.println("Perimeter of the rectangle is : "+perimeter);

	}

}
