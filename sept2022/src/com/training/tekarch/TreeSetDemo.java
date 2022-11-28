package com.training.tekarch;


import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> hs=new TreeSet<Integer>();
		//TreeSet<String> hs=new TreeSet<String>();
	/*	hs.add("remote");
		hs.add("12");
		hs.add("Bunny");
		hs.add("111");
		hs.add("Calamary");
		hs.add("111"); */
		
		
		hs.add(111);
		hs.add(1);
		hs.add(10);
		hs.add(1211);
		hs.add(3);
		
		for(Integer ob: hs) {
			System.out.println(ob);
		}
	}

}
