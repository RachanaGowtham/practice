package com.training.tekarch;

// Program to swap two variables

public class Assignment5 {

	public static void main(String[] args) {
		
		char a='A', b='B';
		
		System.out.println("Before swapping");
		System.out.println("Value of a is : "+a);
		System.out.println("Value of b is : "+b);
		
		char temp=a;
		a=b;
		b=temp;
		
		System.out.println("After swapping");
		System.out.println("Value of a is : "+a);
		System.out.println("Value of b is : "+b);


	}

}
