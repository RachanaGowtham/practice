package com.training.tekarch;

// Program that takes a number as input and prints its multiplication table upto 10

public class AssignMul {

	public static void main(String[] args) {
		int n=10;
		for(int i=1;i<=10;i++) {
			int mul=n*i;
			System.out.println("Multiplication upto 10 is :"+mul);
		}

	}

}
