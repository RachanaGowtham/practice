package com.training.tekarch;

import java.util.Scanner;

//to print the area (r2) and perimeter(2 r) of a circle

public class JavaPrg4 {

	public static void main(String[] args) {
		float pie= 3.142f;
		
		Scanner num= new Scanner(System.in);
		System.out.println("Enter the radius of the circle : ");
		int r= num.nextInt();
		
		float area=(float)pie*r*r;
		System.out.println("Area of the circle is : "+area);
		
		float perimeter=(float)2*pie*r;
		System.out.println("Perimeter of the circle is : "+perimeter);

	}

}
