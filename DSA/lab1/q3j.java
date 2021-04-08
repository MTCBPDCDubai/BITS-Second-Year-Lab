class q3j{
    public static void main(String[] args){
        long startTime = System.currentTimeMillis(); 
	int[] arr={1,2,3,4,5};
	boolean check=true;
	for(int i=0;i<arr.length;i++){
	    for(int j=i+1;j<arr.length;j++){
		if(arr[i]==arr[j]){
		    check=false;
		    break;
		}
	    }
	}
	if(check){
	    System.out.println("Unique");
	}
	else{   
	    System.out.println("Not unique");
	}
	long endTime   = System.currentTimeMillis();
	long totalTime = endTime - startTime;
	System.out.println("Time: "+totalTime);
    }
}
