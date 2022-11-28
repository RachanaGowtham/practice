package com.training.tekarch;

import java.util.Scanner;

//Program to find the index of an array element

public class AssignFindIndexOfArray {

	public static void main(String[] args) {
		int n;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		n= sc.nextInt();
		
		//int[] a= new int[n];
		String[] a= new String[n];
		Scanner sc1= new Scanner(System.in);
		System.out.println("Enter the elements in the array : ");
		for(int i=0;i<n;i++) {
			//a[i]= sc1.nextInt();
			a[i]= sc1.next();
		}
		//int x;
		String x;
		Scanner sc2= new Scanner(System.in);
		System.out.println("Enter the elements whoes index you want to find in an array : ");
		//x=sc2.nextInt();
		x= sc2.next();
		
		//inArElement(n, a, x);
		inArElement(n, a, x);
		
	}
	//public static void inArElement(int n, int [] a, int x){
	
	public static void inArElement(int n, String [] a, String x) {
		for(int i=0;i<n;i++) {
			//if(a[i]==x) {
			if(a[i].equals(x)) {
				System.out.println("The array index is : "+i);
			}
		}
	}


}
