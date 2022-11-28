package com.training.tekarch;

import java.util.Scanner;

//to swap two variables

public class JavaPrg6 {

	public static void main(String[] args) {
		Scanner var= new Scanner(System.in);
		System.out.println("Enter the 2 variable you want swap : ");
		String a= var.next();
		String b= var.next();
		
	String temp=a;
		a=b;
		b=temp;
		
		System.out.println("After Swapping a & b have : "+a +" " +b);
		

	}

}
