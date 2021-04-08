class q1j{
    public static void main(String[] args){
        long startTime = System.currentTimeMillis(); 
	int[] arr={1,2,3,4,5};
	int n=arr.length;
	System.out.println("Before reversing- ");
	for(int i:arr){
	    System.out.print(i+" ");
	}
	for(int i=0;i<n/2;i++){
	    int a=arr[i];
	    arr[i]=arr[n-i-1];
	    arr[n-i-1]=a;
	}
	System.out.println();
	System.out.println("After reversing- ");
	for(int i:arr){
	    System.out.print(i+" ");
	}
	System.out.println();
	long endTime   = System.currentTimeMillis();
	long totalTime = endTime - startTime;
	System.out.println("Time: "+totalTime);
    }
}
