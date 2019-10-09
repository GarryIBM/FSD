package com.cg.eis.exception;

import java.util.Scanner;



class EmployeeSalaryException extends Exception{
	void displayData() {
		System.out.println("salary must be greater than 3000");
	}
}
public class EmployeeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		
		 Scanner sc = new Scanner(System.in);
	        System.out.println("enter your salary");
	        int salary=sc.nextInt();
	        if(salary<3000) {
	        	
	        	try {
	        		throw new EmployeeSalaryException();
	        	}catch (EmployeeSalaryException e) {
					// TODO: handle exception
	        		System.out.println(e);
	        		e.displayData();
				}
	        }else {
	        	 System.out.println("yours salary is " +salary);
	        }
		
		
	}

}
