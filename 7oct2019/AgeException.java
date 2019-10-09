package Assignment07;

import java.util.Scanner;

class AgeAbove16Exception extends Exception{
	void displayData() {
		System.out.println("age must be greater than 16");
	}
}

public class AgeException  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int age=sc.nextInt();
        if(age<16) {
        	
        	try {
        		throw new AgeAbove16Exception();
        	}catch (AgeAbove16Exception e) {
				// TODO: handle exception
        		System.out.println(e);
        		e.displayData();
			}
        }else {
        	 System.out.println("yours age is " +age);
        }
       
	}

}
