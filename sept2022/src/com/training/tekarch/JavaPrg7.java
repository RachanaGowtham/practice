package com.training.tekarch;

import java.util.Scanner;

//7. accept Name, Age, Gender and Address (single line) of a person from the user and print them in separate lines 

public class JavaPrg7 {

	public static void main(String[] args) {
		Scanner a= new Scanner(System.in);
		System.out.println("Enter the user name : ");
		String name= a.next();
		System.out.println("Enter the age : ");
		int age= a.nextInt();
		System.out.println("Enter the gender : ");
		String sex= a.next();
		Scanner b= new Scanner(System.in);
		System.out.println("Enter the address : ");
		String addres= b.nextLine();
		
		System.out.println();
		
		System.out.println("User Details : ");
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Gender : "+sex);
		System.out.println("Address : "+addres);
		

	}

}
