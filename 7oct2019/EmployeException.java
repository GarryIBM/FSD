package Assignment07;

import java.util.Scanner;

class EmployeNameException extends Exception{
	 void displayData() {
		 System.out.println("employe first name and last name cannot be blank");
	 }
	
}



public class EmployeException  {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("enter employe first name");
         String empFirstName=sc.nextLine();
         System.out.println("enter employe last name");
         String empLasttName=sc.nextLine();
         System.out.println("emp first name="+empFirstName+ "\n emp last name="+empLasttName);
         if(empFirstName.equals("") && empLasttName.equals("")) {
        	 try{throw new EmployeNameException();
        	 }
        	 catch (EmployeNameException e) {
        		 System.out.println(e);
				 e.displayData();
			}
        	 
        	 }
         
		
		
	}

}
