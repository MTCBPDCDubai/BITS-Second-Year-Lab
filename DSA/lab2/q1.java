import java.util.*;
class q1{//Linear Search
    public static void main(String[] args){
        Scanner inp=new Scanner(System.in);
	System.out.print("Enter size: ");
	int size=inp.nextInt();
	int arr[]=new int[size];
	System.out.println("Enter the array elements: ");
	for(int i=0;i<size;i++){
	    arr[i]=inp.nextInt();
	}	
	System.out.print("Enter the element to be searched for: ");
	int el=inp.nextInt();
	for(int i=0;i<size;i++){
	    if(arr[i]==el){
	        System.out.println("Element "+el+" found at- "+i);
		System.exit(0);
	    }
	}
	System.out.println("Element not found.");
    }
}
