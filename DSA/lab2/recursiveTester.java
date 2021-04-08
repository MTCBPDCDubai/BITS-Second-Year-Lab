class recursiveTester{
    static int ind=0; 
    static int arr[]={1,2,3,4,5};
    static void check(int el1,int el2){
        if(el1==el2){
	    System.out.println("Element "+el2+" found at "+ind);
	}
	else{
	    ind++;
	    check(arr[ind],el2);
	}
    }
    public static void main(String[] args){
	check(arr[0],5);
    }
}
