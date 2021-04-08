import java.util.Scanner;
class q4{
    public static void main(String[] args){
        int num1,num2,ch=1,d;
	Scanner inpt=new Scanner(System.in);
	num1=inpt.nextInt();
	num2=num1;
	while(ch==1){
	    d=num2%10;
	    num2=num2/10;
    	    if (d==0){
	        ch=2;
	    }
	    else{
	    System.out.print(d);
	    }
	}
    }
}
