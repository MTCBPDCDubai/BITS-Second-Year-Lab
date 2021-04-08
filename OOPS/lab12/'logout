class MyClass implements Runnable{
    int a;
    public void run(){
        String threadname=Thread.currentThread().getName();
        System.out.println("Creating thread: "+threadname);
	System.out.println("Running thread: "+threadname);
	for(int i=0;i<2;i++){
	    System.out.println(threadname+", "+a);
	    a++;
	}
	a--;
    }
}
class q2{
    public static void main(String[] args){
        MyClass thr=new MyClass();
	Thread thread1=new Thread(thr);
	Thread thread2=new Thread(thr);
	Thread thread3=new Thread(thr);
	thread1.setName("First Thread");
	thread2.setName("Second Thread");
	thread3.setName("Thrid Thread");
	thread1.start();
	thread2.start();
	thread3.start();
    }
}
