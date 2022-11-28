package com.training.tekarch;

// 5. Swap two variable without using third variable

public class JavaPrg5a {

	public static void main(String[] args) {
		int x=6;
		int y=7;
		
        System.out.println("Enter the values of x & y before swapping : \n"+x +"\n" +y);
        
        x=x+y;
        y=x-y;
        x=x-y;
        
        System.out.println("Values of x & y after swapping : \n"+x +"\n" +y);

	}

}
