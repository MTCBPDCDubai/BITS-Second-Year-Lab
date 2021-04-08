import java.util.*;
class q1_2{
    public static void main(String[] args){
        int[] arr={30,10,40,70,20,60};
	Arrays.sort(arr);
	System.out.println("Largest: "+arr[(arr.length)-1]);
	System.out.println("Second largest: "+arr[(arr.length)-2]);
    }
}
