import java.util.Scanner;
class q2{
    static void printmat(int[][] arr){
        for (int i=0;i<3;i++){
	    for (int j=0;j<3;j++){
	        System.out.print(arr[i][j]+" ");
	    }
	    System.out.println();
	}
    }
    public static void main(String [] args){
        Scanner inp=new Scanner(System.in);
	int [][] mat1=new int[3][3];
	int [][] mat2=new int[3][3];
	int [][] ans=new int[3][3];
	System.out.println("Enter the elements for matrix 1: ");
	for (int i=0;i<3;i++){
	    for (int j=0;j<3;j++){
	        mat1[i][j]=inp.nextInt();
	    }
	}
	System.out.println("Enter the elements for matrix 2: ");
	for (int i=0;i<3;i++){
	    for (int j=0;j<3;j++){
	        mat2[i][j]=inp.nextInt();
	    }
        }
	for (int i=0;i<3;i++){
	    for (int j=0;j<3;j++){
	    	ans[i][j]=0;
	    	for(int k=0;k<3;k++){
	            ans[i][j]+=mat1[i][k]*mat2[k][j];
		}
	    }
	}
	System.out.println("First matrix: ");
	printmat(mat1);
	System.out.println("Second matrix: ");
	printmat(mat2);
	System.out.println("Answer: ");
	printmat(ans);
    }
}
