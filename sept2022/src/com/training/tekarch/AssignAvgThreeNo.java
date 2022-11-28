package com.training.tekarch;

import java.util.Scanner;
public class AssignAvgThreeNo {

	public static void main(String[] args) {
		
		Scanner input1= new Scanner(System.in);
		System.out.println("Enter the value of a : ");
		int x=input1.nextInt();
		Scanner input2= new Scanner(System.in);
		System.out.println("Enter the value of b :");
		int y=input2.nextInt();
		Scanner input3= new Scanner(System.in);
		System.out.println("Enter the value of c :");
		int z=input3.nextInt();
		
		AssignAvgThreeNo avgthree= new AssignAvgThreeNo();
		avgthree.avg(x,y,z);

	}
	public void avg(int a, int b, int c) {
		float average =(a+b+c)/3;
		System.out.println("Average of three no is : "+average);
		
	}

}
