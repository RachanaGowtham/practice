package com.training.tekarch;

import java.util.Scanner;

// WJP to find the number of integers, upper case, lower case characters in a given string

public class Day4StringAssing5 {

	public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
		
		String s= new String();
		System.out.println("Enter the string :");
		s=input.nextLine();
		
		char[] ch=s.toCharArray();
		int integer=0, uppercase=0, lowercase=0;
		
		for(int i=0;i<ch.length;i++) {
			if(Character.isUpperCase(ch[i])) {
				uppercase++;
				}
			else if(Character.isLowerCase(ch[i])) {
				lowercase++;
			}
			else if(Character.isDigit(ch[i])){
				integer++;
			}	
		}
		System.out.println("Uppercase count is : "+uppercase);
		System.out.println("Lowercase count is : "+lowercase);
		System.out.println("Integer count is : "+integer);

	}

}
