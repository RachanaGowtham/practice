package com.training.tekarch;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<Object> hs=new HashSet<Object>();
		hs.add("remote");
		hs.add(12);
		hs.add("Bunny");
		hs.add(111);
		hs.add("Calamary");
		hs.add(null);
		hs.add(null);
		hs.add(111);
		
		for(Object ob: hs) {
			System.out.println(ob);
		}

	}

}
