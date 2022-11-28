package com.training.tekarch;

import java.util.Scanner;

//WJP to replace each substring

public class Day4StringAssign3 {

	public static void main(String[] args) {
     Scanner input= new Scanner(System.in);
		
		String s1= new String();
		String s2= new String();
		String s3= new String();
		System.out.println("Enter the string : ");
		s1=input.nextLine();
		System.out.println("Enter the substring you want to replace : ");
		s2=input.next();
		System.out.println("Enter the substring you want to replace it with : ");
		s3=input.next();
		
		
		System.out.println(s1.replace(s2, s3));

	}

}
