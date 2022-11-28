package com.training.tekarch;

import java.util.Arrays;

public class AssignRemoveElement {

	public static void main(String[] args) {
		
		int [] firstArray= {2,4,6,9,11};
		System.out.println("Elements in the first array are : "+Arrays.toString(firstArray));
		int index=3;
		int [] newArray= new int[firstArray.length-1];
		
		for(int i=0,k=0;i<firstArray.length;i++) {
			if(i==index) {
				continue;
			}
			newArray[k++]=firstArray[i];
		}
		System.out.println("Elements in the new array are : "+Arrays.toString(newArray));

	}

}
