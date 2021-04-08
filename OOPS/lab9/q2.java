import java.util.*;
abstract class Bank{
    abstract void getRateofInterest(float r);
}
class SBI extends Bank{
    float prnc,rate,time,intr;
    SBI(){
        prnc=1000;
	time=2.0f;
    }
    void getRateofInterest(float r){
        rate=r;
    }
    void CalculateInterest(){
    	intr=(prnc*rate*time)/100;
	System.out.println("Interest: "+intr);
    }
}
class PNB extends Bank{
    float prnc,rate,time,intr;
    PNB(){
        prnc=1200;
	time=1.5f;
    }
    void getRateofInterest(float r){
        rate=r;
    }
    void CalculateInterest(){
        intr=(prnc*rate*time)/100;
	System.out.println("Interest: "+intr);
    }
}
class q2{
    public static void main(String [] args){
        int ch=0;
	Scanner inp=new Scanner(System.in);
	while(ch!=3){
	    System.out.println("Press 1 for SBI");
	    System.out.println("Press 2 for PNB");
	    System.out.println("Press 3 to exit");
	    ch=inp.nextInt();
	    if(ch==1){
	    	SBI sbi=new SBI();
		System.out.print("Rate: ");
	        float rate=inp.nextFloat();
		sbi.getRateofInterest(rate);
		sbi.CalculateInterest();
	    }
	    else if(ch==2){
	        PNB pnb=new PNB();
		System.out.print("Rate: ");
		float rate=inp.nextFloat();
		pnb.getRateofInterest(rate);
		pnb.CalculateInterest();
	    }
	}
    }
}
