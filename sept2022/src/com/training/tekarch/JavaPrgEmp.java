package com.training.tekarch;

public class JavaPrgEmp {
			
			double new_salary;
			
			public double revisedSal(int exp, double oldsal, boolean bonus) {
				double newsal;
				
				if(exp>=3 && exp<=5) {
				 newsal= oldsal + ((oldsal*10)/100);
				}
				else if(exp>=6 && exp<=9) {
				 newsal= oldsal + ((oldsal*15)/100);
				}
				else if(exp>=10 && exp<=20) {
				 newsal= oldsal + ((oldsal*20)/100);
				}
				else {
				 newsal= oldsal + ((oldsal*25)/100);
				}
				
				 if(bonus) {
					 newsal=(newsal+1000);
				 }
				 
				 return new_salary = newsal;

			}
			public static void main(String[] args) {
				
				JavaPrgEmp rs= new JavaPrgEmp();

				rs.revisedSal(4, 35000.486, true);
			    System.out.println("return value 1: "+rs.new_salary);
			    
			    JavaPrgEmp rs1= new JavaPrgEmp();
			    rs1.revisedSal(20, 35000.486, false);
			    System.out.println("return value 2: "+rs1.new_salary);
			    
			    JavaPrgEmp rs2= new JavaPrgEmp();
			    rs2.revisedSal(4, 35000.486, false);
			    System.out.println("return value 3: "+rs2.new_salary);

	}

}
