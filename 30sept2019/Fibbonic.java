class Fibbonic{
	public static void main(String[] args) {
		   
		   	int arr[]= new int[13];
		   	arr[0]=1;
		   	arr[1]=1;
                System.out.println(arr[0]);
                System.out.println(arr[1]);
		   	    for (int i=2;i<11 ; i++) {
		   	    	   arr[i]=arr[i-2]+arr[i-1];
		   	    	       System.out.println(arr[i]);
		   	    }
		


	}
}