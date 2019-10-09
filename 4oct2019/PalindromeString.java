package Day4;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string to check whether its palindrome or not.......");
		String str=sc.nextLine();
	      String str1="";
		 
	      
	      for(int i=str.length()-1;i>=0;i--) {
	    	  str1=str1+str.charAt(i);
	      }
	      System.out.println(str1);
	     
	      if(str.equals(str1)) {
	    	  System.out.println("these are palindromes");
	      }
	      else
	      {
	    	  System.out.println("not palindrome");
	      }
	}
    

}
