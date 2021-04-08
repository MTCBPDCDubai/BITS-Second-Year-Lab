import java.util.*;
class q2{
    public static void main(String[] args){
    	LinkedList <Integer> arr1=new LinkedList<Integer>();
	LinkedList <Integer> arr2=new LinkedList<Integer>();
	LinkedList <Integer> arr3=new LinkedList<Integer>();
	int[] array1={2,6,9,11};
	int[] array2={1,5,7,12,15};
	for(int i=0;i<array1.length;i++)arr1.add(array1[i]);
	for(int i=0;i<array2.length;i++)arr2.add(array2[i]);
	arr3.addAll(arr1);
	arr3.addAll(arr2);
	Collections.sort(arr3);
	System.out.println(arr1);
	System.out.println(arr2);
	System.out.println(arr3);
    }
}
