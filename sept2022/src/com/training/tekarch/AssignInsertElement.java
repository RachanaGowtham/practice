package com.training.tekarch;

import java.util.Arrays;

public class AssignInsertElement {

	public static void main(String[] args) {
		int [] array= {2,4,6,9,11};
		System.out.println("Elements in the first array are : "+Arrays.toString(array));
		int index=3;
		int newvalue=10;
		int [] newArray= new int[array.length+1];
		
		int j = 0;
		for (int i=0; i<array.length; i++) {
			if (i==index) {
				newArray[j] = newvalue;
				j++;
			}
			newArray[j] = array[i];
			j++;
		}
		
		System.out.println("Elements in the new array are : "+Arrays.toString(newArray));
		
//		for(int i=5;i>index;i--) {
//			newArray[i]=array[i-1];
//		}
//		newArray[index]=newvalue;
		
//		for(int i=0;i<array.length;i++) {
//			System.out.println(newArray[i]);
//			System.out.println("Elements in the new array are : "+Arrays.toString(array));
//		}

	}

}
