import java.util.*;
abstract class Gate{
    boolean a,b,c;
    void setInput(boolean d,boolean e){
        a=d;b=e;
    }	
    void displayOutput(){
        System.out.println("c: "+c);
    }
    abstract void computeResult();
}
class AND extends Gate{
    void computeResult(){
        c=a&&b;
    }
}
class OR extends Gate{
    void computeResult(){
        c=a||b;
    }
}
class q2{
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
	System.out.print("a= ");boolean a=inp.nextBoolean();
	System.out.print("b= ");boolean b=inp.nextBoolean();
    	Gate and =new AND();and.setInput(a,b);
	Gate or= new OR();or.setInput(a,b);
	and.computeResult();
	or.computeResult();
	and.displayOutput();
	or.displayOutput();
    }
}
