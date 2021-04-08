import java.util.Scanner;
class q2{
    public static void main(String[] args){
        int qnt;int rem;
	Scanner myObj=new Scanner(System.in);
	System.out.println("Enter your quotient: ");
	int num1=myObj.nextInt();
	System.out.println("Enter your dividend: ");
	int num2=myObj.nextInt();
	qnt=num1/num2;
	rem=num1%num2;
	System.out.println("Quotient: "+qnt);
	System.out.println("Remainder: "+rem);
    }
}
