class Factorial{
	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		int result=1;
		for (; num>0;num-- ) {
			
			result=result*num;
		}
		    System.out.println(result);

	}
}