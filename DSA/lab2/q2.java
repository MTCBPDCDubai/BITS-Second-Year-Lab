import java.util.*;
class q2{
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
	System.out.println("Enter the size- ");
	int size=inp.nextInt();
	int arr[]=new int[size];
	System.out.println("Enter the elements- ");
	for(int i=0;i<size;i++){
	    arr[i]=inp.nextInt();
	}
	System.out.print("Enter the element to be searched for- ");
	int el=inp.nextInt();
	int low=0,mid,high=size;
	while(low<=high){
	    mid=(low+high)/2;
	    if(arr[mid]>el){
	        high=mid-1;
	    }
	    else if(arr[mid]<el){
	        low=mid+1;
	    }
	    else{
	        System.out.println("Element "+el+" found at "+mid);
		System.exit(0);
	    }
	}
	System.out.println("Element not found.");
    }
}
