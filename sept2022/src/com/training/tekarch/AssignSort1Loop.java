package com.training.tekarch;

//Sort numeric Array using single for loop

import java.util.Arrays;

public class AssignSort1Loop {

	public static void main(String[] args) {
		AssignSort1Loop n= new AssignSort1Loop();
		n.sort();

	}
	public void sort() {
		int[] a= {13,89,11,3,66,81};
		for(int i=0;i<a.length-1;i++) {
			if(a[i]>a[i+1]) {
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				
				i=-1;
			}
		
		}
		System.out.println("Sorted array is : "+Arrays.toString(a));
	}

}
