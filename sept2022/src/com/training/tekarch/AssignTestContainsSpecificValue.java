package com.training.tekarch;
//Test if an array contains a specific value

import java.util.Scanner;

public class AssignTestContainsSpecificValue {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n=input.nextInt();
		
		AssignTestContainsSpecificValue obj= new AssignTestContainsSpecificValue();
		obj.containsValue(n);
	
	}
	public void containsValue(int n) {
		int[] arr= {1,3,5,7,9,11,13,15,17,19};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				System.out.println("Yes array contains a Specific value "+arr[i]);
			}
		}
	}

}
