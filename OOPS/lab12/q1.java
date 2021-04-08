//class Fibonacci implements Runnable{
class Fibonacci extends Thread{
    public void run(){
        int a=0,b=1,t;
	String threadname=Thread.currentThread().getName();
	System.out.println(threadname+" is running");
	System.out.print(a+" "+b);
        for(int i=2;i<10;i++){
   	    t=a+b;
	    a=b;
	    b=t;
	    System.out.print(" "+t);
	}
	System.out.println();
    }
}
//class Reverse implements Runnable{
class Reverse extends Thread{
    public void run(){
        String threadname=Thread.currentThread().getName();
	System.out.println(threadname+" is running");
	for(int i=10;i>0;i--){
	    System.out.print(i+" ");
	}
    }
}
class q1{
    public static void main(String[] args){
        Fibonacci fib=new Fibonacci();
	Reverse rv=new Reverse();
	fib.start();
	rv.start();
	//Thread FibonacciSequence=new Thread(fib);
	//Thread Reverse=new Thread(rv);
	//FibonacciSequence.start();
	//Reverse.start();
    }
}
