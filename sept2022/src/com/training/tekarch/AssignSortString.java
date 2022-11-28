package com.training.tekarch;

import java.util.Arrays;

//Program to sort an array of String

import java.util.Scanner;

public class AssignSortString {

	public static void main(String[] args) {
		int n;
		
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter the size of an array : ");
		 n= sc.nextInt();
		 String[] names= new String[n];
		 Scanner sc1= new Scanner(System.in);
		 System.out.println("Enter the names : ");
		 for(int i=0;i<n;i++) {
		 names[i]= sc1.nextLine();
		 }
		 
		 sortStringArray(n,names);

	}
	public static void sortStringArray(int n, String[] names)
	{
		String temp;
		//String[] names1= new String[n];
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(names[i].compareToIgnoreCase(names[j])>0) {
					temp=names[i];
					names[i]=names[j];
					names[j]=temp;
				}
			}
		}
		
		//for(String name : names) {
			System.out.println("Sorted names are : "+Arrays.toString(names));
		//}
		
	}
}
