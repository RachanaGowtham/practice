package com.training.tekarch;

//Program to demonstrate largest of 3 numbers using nested if statement 

public class AssignNestedIf7 {

	public static void main(String[] args) {
		int a=10, b=30, c=5;
		
		if(a>b) {
			if(a>c) {
				System.out.println("a is the largest number :"+a);
			}
			else {
				System.out.println("c is the largest number :"+c);
			}
		}
		else {
			if(b>c) {
				System.out.println("b is the largest number :"+b);
			}
			else {
				System.out.println("c is the largest number :"+c);
			}
		}

	}

}
