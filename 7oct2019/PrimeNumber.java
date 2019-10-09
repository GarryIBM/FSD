package Assignment07;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  PrimeNumber obj=new PrimeNumber();
  obj.displayPrimeNumber();
	}
 
	
	void displayPrimeNumber() {
		int temp=0;
		Scanner sc=new Scanner(System.in );
		System.out.println("ENTER THE NUMBER UPTO WHICH YOU WANT PRIME NUMBER");
		int number=sc.nextInt();
		System.out.println("prime number are");
		for(int i=1;i<number;i++) 
		{  
			if(i==1) {
				temp=temp+1;
			}
			
			for(int j=2;j<=i-1;j++)
			{
				if(i%j==0) {
					temp=temp+1;
				}
				
			}
			if(temp==0) {
				System.out.print(i + " ");
			}else {
				temp=0;
			}
			
		}
	}
	
	
}
