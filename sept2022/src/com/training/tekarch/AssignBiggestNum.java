package com.training.tekarch;

public class AssignBiggestNum {

	public static void main(String[] args) {
		int a=10; int b=35; int c=5;
		
		if(a>b && a>c) {
			System.out.println(a+" is the biggest number");
		}
			else if(b>a && b>c) {
				System.out.println(b+" is the biggest number");
			}
			else if(c>a && c>b) {
				System.out.println(c+" is the biggest number");
			}
			 if(a>b || a>c) {
				System.out.println(a+" is the second biggest number");
			}
			else if(b>a || b>c) {
				System.out.println(b+" is the second biggest number");
			}
			else if(c>a || c>b) {
				System.out.println(c+" is the second biggest number");
			}
			 if(a<b && a<c) {
			System.out.println(a+" is the third biggest number");
		}
		else if(b<a && b<c) {
			System.out.println(b+" is the third biggest number");
		}
		else if(c<a && c<b) {
			System.out.println(c+" is the third biggest number");
		}
		
	}

}
