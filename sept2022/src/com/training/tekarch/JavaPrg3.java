package com.training.tekarch;

import java.util.Scanner;

//3. to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

public class JavaPrg3 {

	public static void main(String[] args) {
		
		Scanner num= new Scanner(System.in);
		System.out.println("Enter the 2 digits : ");
		int a= num.nextInt();
		int b= num.nextInt();
		
		int sum=a+b;
		System.out.println("Sum of 2 numbers is : "+sum);
		
		int mul=a*b;
		System.out.println("Multiplication of 2 numbers is : "+mul);
		
		int sub=a-b;
		System.out.println("Substraction of 2 numbers is : "+sub);
		
		float div=(float)a/b;
		System.out.println("Division of 2 numbers is : "+div);
		
		

	}

}
