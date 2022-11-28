package com.training.tekarch;

import java.util.Scanner;

//3. Write Java program that takes a number as input and print its multiplication table upto 10.

public class JavaPrg3a {

	public static void main(String[] args) {
		
		Scanner num= new Scanner(System.in);
		System.out.println("Enter the value : ");
		int n= num.nextInt();
		
		System.out.println("Multiplication of "+n +" is : ");
		for(int i=1;i<=10;i++) {
			int m=n*i;
			
			System.out.println(m);
			
		}
		

	}

}
