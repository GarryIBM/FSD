class Question6{
	public static void main(String[] args) {
		int number=Integer.parseInt(args[0]);
		int bin;
		 while(number>0){
		 	 bin=number%2;
		 	 number=number/2;
                 System.out.print(bin);
		 }
	}
}