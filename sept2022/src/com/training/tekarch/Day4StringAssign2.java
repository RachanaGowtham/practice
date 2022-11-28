package com.training.tekarch;

// WJP to check the given word is present in a given string

import java.util.Scanner;

public class Day4StringAssign2 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		String s1= new String();
		String s2= new String();
		System.out.println("Enter the first string : ");
		s1=input.nextLine();
		System.out.println("Enter the second string : ");
		s2=input.next();
		
		System.out.println(s1.contains(s2));
		
	}

}
