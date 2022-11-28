package com.training.tekarch;

import java.util.Arrays;

/* Given two strings, first string is a sentence and second string is a character. WAP to print number of characters 
in between the occurrence of second string excluding spaces */

public class Day4StringAssign1 {

	public static void main(String[] args) {
		
	String s1= "I Love Java Programming";
	String s2= "o";
	
	int s3=s1.indexOf(s2);
	//System.out.println(s3);
	int s4=s1.lastIndexOf(s2);
	//System.out.println(s4);
	
	String s5=s1.substring(s3,s4).replace(" ", "");
	
	System.out.println(s5);
	System.out.println(s5.length());
	
	/*char[] ch=s5.toCharArray();
	String s6="";
	for(int i=0;i<ch.length;i++) {
		if(ch[i]!=' ') {
			s6=s6+ch[i];
		} 
	}System.out.println(s6);
	System.out.println(s6.length());*/
		

	}

}
