import java.util.Scanner;
class MyClass{
    String name;
    int d;
    float m1,m2,m3,total;
    MyClass(String name,int d,float m1,float m2,float m3){
        this.name=name;
	this.d=d;
	this.m1=m1;this.m2=m2;this.m3=m3;
    }
    void checkMarks() throws Exception{
        if(m1<0||m1>100||m2<0||m2>100||m3<0||m3>100){
	    throw new Exception("Marks not in range from 0 to 100");
	}
    }
    void computeTotal() throws Exception{
        total=m1+m2+m3;
	System.out.println("Total: "+total);
	if(total<33){
	    throw new Exception("Access denied for exam: marks below limit");
	}
	else{
	    System.out.println("Access granted you can appear for your exam");
	}
    }
}
class q2{
    public static void main(String [] args){
        int ch=1;
	Scanner inp=new Scanner(System.in);Scanner inp2=new Scanner(System.in);
	while(ch!=2){
	    System.out.println("Press 1 to add details and compute total");
	    System.out.println("Press 2 to exit");
	    ch=inp.nextInt();
	    if(ch==1){
	        System.out.print("Enter your name: ");
	        String n=inp2.nextLine();
		System.out.print("Enter your id: ");
		int d=inp.nextInt();
		System.out.println("Enter your marks one by one: ");
		float m1=inp.nextFloat();float m2=inp.nextFloat();float m3=inp.nextFloat();
	        MyClass obj=new MyClass(n,d,m1,m2,m3);
	        try{
		    obj.checkMarks();
	            obj.computeTotal();
	        }
		catch(Exception e){
		    e.printStackTrace();
		}
	    }
	}
    }
}
