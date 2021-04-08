import java.util.Scanner;
class Purse{
    private int dirham,fills50,fills25;
    private float total;
    public Purse(int d,int f1,int f2){
        dirham=d;
	fills50=f1;
	fills25=f2;
    }
    public void add_Dirham(int dd1){
        dirham+=dd1;
    }
    public void rmv_Dirham(int dd2){
        dirham-=dd2;
    }
    public void add_50fills(int ff1){
        fills50+=ff1;
    }
    public void rmv_50fills(int ff2){
        fills50-=ff2;
    }
    public void add_25fills(int tf1){
        fills25+=tf1;
    }
    public void rmv_25fills(int tf2){
        fills25-=tf2;
    }
    public void total_cash(){
        total=dirham+(0.5f*fills50)+(0.25f*fills25);
    	System.out.println("Total cash: "+total);
    }
}
class q3{
    public static void main(String [] args){
        int ch=0;
	Scanner inp=new Scanner(System.in);
	System.out.println("Enter your dirhams");
	int d=inp.nextInt();
	System.out.println("Enter your 50 fills");
	int f1=inp.nextInt();
	System.out.println("Enter your 25 fills");
	int f2=inp.nextInt();
	Purse p=new Purse(d,f1,f2);
	p.total_cash();
	while(ch!=7){
	    System.out.println("Press 1 to add dirham: ");
	    System.out.println("Press 2 to remove dirham: "); 
	    System.out.println("Press 3 to add 50 fills: ");
	    System.out.println("Press 4 to remove 50 fills: ");
	    System.out.println("Press 5 to add 25 fills: ");
	    System.out.println("Press 6 to remove 25 fills: ");
	    System.out.println("Press 7 to exit: ");
	    ch=inp.nextInt();
	    if(ch==1){
	        System.out.println("Enter dirham to add: ");
	        d=inp.nextInt();
		p.add_Dirham(d);
		p.total_cash();
	    }
	    else if(ch==2){
	        System.out.println("Enter dirham to remove: ");
	        d=inp.nextInt();
		p.rmv_Dirham(d);
		p.total_cash();
	    }
	    else if(ch==3){
	        System.out.println("Enter 50 fills to add: ");
	        f1=inp.nextInt();
		p.add_50fills(f1);
	    	p.total_cash();
	    }
	    else if(ch==4){
	    
	        System.out.println("Enter 50 fills to remove: ");
	        f1=inp.nextInt();
		p.rmv_50fills(f1);
		p.total_cash();
	    }
	    else if(ch==5){ 
	        System.out.println("Enter 25 fills to add: ");
	        d=inp.nextInt();
		p.add_25fills(d);
		p.total_cash();
	    }
	    else if(ch==6){
	        System.out.println("Enter 25 fills to remove: ");
	        f2=inp.nextInt();
		p.rmv_25fills(f2);
	        p.total_cash();
	    }
	}
    }
}
