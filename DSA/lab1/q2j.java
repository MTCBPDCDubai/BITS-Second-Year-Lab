import java.util.Scanner;
class q2j{
    public static void main(String[] args){
	long startTime = System.currentTimeMillis(); 
	int count=0;
	Scanner sc=new Scanner(System.in);
	System.out.print("Equation- ");
	String a=sc.nextLine();
	for(int i=0;i<a.length();i++){
	    if(a.charAt(i)=='('){
	        count++;
	    }
	    else if(a.charAt(i)==')'){
	        count--;
	    }
	    if(count<0){
		break;
	    }
	}
	if(count==0){
	    System.out.println("Balanced");
	}
	else{
	    System.out.println("Not balanced");
	}
	long endTime   = System.currentTimeMillis();
	long totalTime = endTime - startTime;
	System.out.println("Time: "+totalTime);
    }
}
