class q1{
    public static void main(String[] args){
        int [] arr={20,40,30,50,10};
	int max=arr[0];
	int scmax=arr[0];
	for(int i=0;i<arr.length;i++){
	    if(arr[i]>max){
	        scmax=max;
	        max=arr[i];
	    }
	}
	System.out.println("Largest: "+max);
	System.out.println("Second Largest: "+scmax);
    }
}
