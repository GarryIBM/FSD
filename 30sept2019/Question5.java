class Question5{
      public static void main(String[] args) {
      	int number1=Integer.parseInt(args[0]);
      	int number2=Integer.parseInt(args[1]);
      	int number3=Integer.parseInt(args[2]);
      	int sum=number1+number2+number3;
      	int count=0;
        if(number1>=40)
        count++;
        if(number2>=40)
        count++;
        if(number3>=40)
        count++;
        if(sum>125)
        count++;
        if(count==4)
        	    System.out.println("passed");
        if(count<4)
        	    System.out.println("Failed");


         
      }

}