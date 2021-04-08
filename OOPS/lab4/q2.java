import java.util.Scanner;
class q2{
    public static void main(String [] args){
        float[] numbers=new float[10];
	Scanner inp=new Scanner(System.in);
	float sum=0,min,max=0;
	System.out.println("Enter your array elements: ");
	for (int i=0;i<10;i++){
	    System.out.println("Element "+(i+1));
	    numbers[i]=inp.nextFloat();
	}
	min=numbers[0];
	for (int i=0;i<10;i++){
	    sum+=numbers[i];
	    if (max<numbers[i]){
	        max=numbers[i];
	    }
	    if (min>numbers[i]){
	        min=numbers[i];
	    }
	}
	System.out.println("Sum: "+sum);
	System.out.println("Average: "+sum/10);
	System.out.println("Max: "+max);
	System.out.println("Min: "+min);
    }
}
