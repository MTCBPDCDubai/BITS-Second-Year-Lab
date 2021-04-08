import java.util.Scanner;
class pascal{
    static int fact(int num){
        int sum=1;
	for (int i=1;i<num+1;i++){
	    sum*=i;
	}
	return sum;
    }
    static void cal(int i, int j){
        int n1=fact(i);
	int n2=fact(j);
	int n3=fact(i-j);
	int sum2=n1/(n2*n3);
	System.out.print(sum2);
    }
}
class q1{
    public static void main(String [] args){
	Scanner inp=new Scanner(System.in);
	System.out.println("Enter n: ");
	int n = inp.nextInt();
	for (int i=0;i<n;i++){
	    for (int k=n;k>i;k--){
	        System.out.print(" ");
	    }	    
	    for (int j=0;j<=i;j++){
	        pascal.cal(i,j);
		System.out.print(" ");
	    }
	    System.out.println();
	}
    }
}
