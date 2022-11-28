package com.training.tekarch;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		ArrayList<String> a= new ArrayList<String>();
		
		a.add("Read");
		a.add("Sleep");
		a.add("Repeat");
		
		for(String a1:a)
			System.out.println(a1);
		
		for(int i=0;i<a.size();i++) {
		
		System.out.println(a.get(i));
		}

	}

}
