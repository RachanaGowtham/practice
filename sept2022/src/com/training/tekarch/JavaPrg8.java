package com.training.tekarch;

import java.util.Scanner;

/* 8. Use Scanner Class to 
1.Read an int, double, float, Boolean ….
2.Store the values inside variables
3.Print the values
4.Perform some arithmetic
Observe what errors you may get */

public class JavaPrg8 {

	public static void main(String[] args) {
		Scanner num= new Scanner(System.in);
		System.out.println("Enter an Integer value : ");
		int a= num.nextInt();
		System.out.println("Enter an Floating point value : ");
		float b= num.nextFloat();
		System.out.println("Enter Double value : ");
		double c= num.nextDouble();
		System.out.println("Enter Boolean value : ");
		boolean d= num.nextBoolean();
		
		System.out.println("Integer numbers is : "+a +"\n");
		System.out.println("Floating point numbers is : "+b +"\n");
		System.out.println("Double numbers is : "+c +"\n");
		System.out.println("Boolean value is : "+d +"\n");
		
		double sum=a+b+c;
		
		System.out.println("Sum is : "+sum);
		

	}

}
