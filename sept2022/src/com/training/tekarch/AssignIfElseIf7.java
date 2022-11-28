package com.training.tekarch;

//Program to demonstrate largest of 3 numbers using if-else-if ladder statement 

public class AssignIfElseIf7 {
	
	public static void main(String[] args) {
		
		int a=15, b=7, c=55;
		
		System.out.println("Values of a,b,c are: "+a +"\t\t" +b +"\t" +c);
		
		if(a>b && a>c) {
			System.out.println("a is the largest number :"+a);
		}
		else if(b>a && b>c) {
			System.out.println("b is the largest number :" +b);
		}
		else {
			System.out.println("c is the largest number :" +c);
		}
		
	
	}

}
