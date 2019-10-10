package CollectionJava;

import java.util.ArrayList;
import java.util.Scanner;

		class Person1{
			private	String name;
			private Integer id;
			public Person1(String name, Integer id) 
			{
		// TODO Auto-generated constructor stub
				this.name=name;
				this.id=id;
		 }
			public String getName()
			{
					return name;
			}
	
		public Integer getId() 
		{
		     return id;
	    }
	
                    }



public class Human {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name;
		int id;
		char ch = 0;
		int flag=0;
		
		ArrayList list=new ArrayList();
	
		Integer limit;
		
		do {
		 System.out.println("Enter 1 to add Person");
		 System.out.println("Enter 2 to Display all Persons");
		 System.out.println("Enter 3 to search Person by id or by name ");
		 System.out.println("Enter 4 to delete Person");
		   int choice =sc.nextInt();
		   sc.nextLine();
		   switch(choice) {
		   case 1:
		   {   
			   System.out.println("how many person");
			   limit=sc.nextInt();
			   sc.nextLine();
			   for(int v=1;v<=limit;v++) {
					
					System.out.println("enter name");
					name=sc.nextLine();
					
					System.out.println("enter id");
					id=sc.nextInt();
					sc.nextLine();
					list.add(new Person1(name,id));
			
				}
			   System.out.println("do you want to continue press y");
				  ch=sc.nextLine().charAt(0);
		   }  
		      				break;
		   case 2:
		   {    System.out.println("Data of Every person...");
			   for (Object ob : list) {
					System.out.println(((Person1) ob).getName() + "   " + ((Person1) ob).getId());
				}
			   System.out.println("do you want to continue press y");
				  ch=sc.nextLine().charAt(0);

		   }         
		        break;
		   case 3:{
			   System.out.println("Enter  id or Name of person you Want to Search");
			     String choose=sc.nextLine() ;
			     Integer Id=Integer.parseInt(choose);
			           
			   for (Object ob : list) {
					if((((Person1) ob).getName().equals(choose) | ((Person1) ob).getId().equals(Id))) {
						System.out.println((((Person1) ob).getName()) +"   " + (((Person1) ob).getId()) );}
						flag=1;
					}
			   if(flag==0) {
				   System.out.println("data not found");
			   }
			        
			   System.out.println("do you want to continue press y");
				  ch=sc.nextLine().charAt(0);
				}
			   
		        break;
		        
		   case 4 :{
			   System.out.println("Enter  id or Name of person you Want to Delete");
			     String choose=sc.nextLine() ;
			     Integer Id=Integer.parseInt(choose);
			           
			   for (Object ob : list) {
					if((((Person1) ob).getName().equals(choose) | ((Person1) ob).getId().equals(Id)))
					{
				
					      list.remove(ob);
					      flag=1;
					      System.out.println("sucessfully removed");
				   }
					
				
					}
			   if(flag==0) {
				   System.out.println("data not found");
			   }
			   System.out.println("do you want to continue press y");
				  ch=sc.nextLine().charAt(0);
			   
		   } break;
		   
		   default :{
			  
		   }
		        
		   }
		 
		}while(ch=='y' | ch=='Y');
		
		 System.out.println("exited");
		
	}

}
