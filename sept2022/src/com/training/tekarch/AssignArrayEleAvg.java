package com.training.tekarch;

public class AssignArrayEleAvg {

	public static void main(String[] args) {
		int[] a= {2,9,5,6,3};
		int sum=0;
		int avg=0;
		
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		avg=sum/a.length;
		System.out.println("Average of array elements is : "+avg);

	}

}
