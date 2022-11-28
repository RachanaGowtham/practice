package com.training.tekarch;

import java.util.Arrays;

public class AssignSort2Loops {

	public static void main(String[] args) {
		AssignSort2Loops n= new AssignSort2Loops();
		n.sort();

	}
	public void sort() {
		int[] a= {14,1,33,67,98,89,77};
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Unsorted array is : "+a[i]);
		}
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				if(a[i]>a[j]) {
				int	temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
			//System.out.println("Sorted array is : "+a[i]);
		}
		System.out.println("Sorted array is : "+Arrays.toString(a));
		
	}

}
