package Assignment07;

import java.util.Scanner;

public class TrafficLight {
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="";
		
		do {
		System.out.println("1) Red light");
		System.out.println("2) Green light");
		System.out.println("3) Blue light");
		System.out.println("select any light for its information");
		int selectLight=sc.nextInt();
		sc.nextLine();
		switch (selectLight) {
		case 1: System.out.println("STOP");
			
			break ;
		case 2: System.out.println("GO");
		
		break ;
		case 3: System.out.println("WAIT");
		
		break ;
			
			

		default:
			System.out.println("select an Appropiate Light");
		}
		
		System.out.println("do you want to continue press y" );
		    str=sc.nextLine();
	}while(str.equals("y"));
	}

}
