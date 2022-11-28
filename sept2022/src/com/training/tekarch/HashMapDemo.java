package com.training.tekarch;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1,"Abhi");
		hm.put(2,"Bubu");
		hm.put(3,"Luke");
		hm.put(4,"Abhi");
		hm.put(2,"Godu");
		hm.put(null,"Rain");
		hm.put(null,null);
		hm.put(5,null);
		
		System.out.println(hm.size());
		
		
		
		for(Integer key:hm.keySet())
			
			System.out.println(key);
		
		
		for(Map.Entry<Integer,String> hmp: hm.entrySet()) {
			System.out.println(hmp);
		}
	
			
		
		

	}

}
