package com.training.tekarch;

////Program to demonstrate switch statement 

public class AssignSwitch6 {

	public static void main(String[] args) {
		
		int diet=2;
		
		switch(diet)
		{
		
		case 1: System.out.println("One egg as per today!");
		break;
		
		case 2: System.out.println("Two eggs as per today!");
		break;
		
		case 3: System.out.println("Fruits only today!");
		break;
		
		case 4: System.out.println("Liquid diet today!");
		break;
		
		case 5: System.out.println("Limited rice today!");
		break;
		
		default:System.out.println("CHEAT DAY!");

		}
			
	}

}
