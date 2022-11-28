package com.training.tekarch;

//2. Demonstrate the use of for, do-while and while-do loops (Print product of 10 numbers)

public class JavaPrg2a {

	public static void main(String[] args) {
		int n=10;
		int product=1;
		int i=1;
		
		//for loop
		for(i=1;i<=n;i++) {
			product= product*i;
		}
		System.out.println("Product of n numbers is : "+product);
		
		//while loop
		product=1;
		 i=1;
		while(i<=n) {
			product= product*i;
			i++;
		}
		System.out.println("Product of n numbers is : "+product);
		
		//do while
		product=1;
		i=1;
		do {
		product= product*i;
		i++;
		}
		while(i<=n);
		System.out.println("Product of n numbers is : "+product);

	}

}
