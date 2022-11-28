package com.training.tekarch;

//1. accept three numbers from the keyboard and print the sum and average of them

import java.util.Scanner;

public class JavaPrg1 {

	public static void main(String[] args) {
		
		Scanner digit= new Scanner(System.in);
		System.out.println("Enter the 3 digits : ");
		int a= digit.nextInt();
		int b= digit.nextInt();
		int c= digit.nextInt();
		
		int sum=a+b+c;
		
		float avg= sum/3f;
		
		System.out.println("Sum of 3 no's is : "+sum);
		System.out.println("Average of 3 no's is : "+avg);
		

	}

}
