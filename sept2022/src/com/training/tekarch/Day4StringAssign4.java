package com.training.tekarch;

import java.util.Scanner;

//Given a string print the reverse of the string

public class Day4StringAssign4 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		String s= new String();
		System.out.println("Enter the string :");
		s=input.next();
		
		char[] ch=s.toCharArray();
		int length=ch.length;
		
		for(int i=length-1;i>=0;i--) {
		
		System.out.print(ch[i]);
		}

	}

}
