class Stack {//LIFO(Last In First Out)
    int size;
    int pointer=-1;
    Object arr[];
    Stack(int size){
        this.size=size;
        arr=new Object[size];
    }
    int size(){
        return (pointer+1);
    }
    void push(Object el){
        pointer++;
        if(pointer==size){
            System.out.println("Stack is full");
        }
        else{
            arr[pointer]=el;
        }
    }
    Object pop(){
        if(pointer!=-1){
            Object el=arr[pointer];
            pointer--;
            return el;
        }
        else{
            System.out.println("Stack is empty");
            return("");
        }
    }
    public String toString(){
        System.out.print("[");
        for(int i=0;i<=pointer;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.print("]");
        return("");
    }
}
class Queue{//FIFO(First In First Out)
    int N,s=0;//s is size
    int rear=0,front=0;
    Object arr[];
    Queue(int N){
        this.N=N;
        arr=new Object[N];
    }
    boolean isEmpty(){
        return(s==0);
    }
    int size(){
        return s;
    }
    void enqueue(Object el){
        if(size()==N){
            System.out.println("Queue is full");
        }
        else{
            s++;
            arr[rear]=el;
            rear=(rear+1)%N;            
        }
    }
    Object dequeue(){
        if(isEmpty()){
            System.out.println("Empty queue");
            return false;
        }
        else{
            s--;
            Object el=arr[front];
            front=(front+1)%N;
            return el;
        }
    }
    public String toString(){
        System.out.print("[");
        if(rear>front){
            for(int i=front;i<rear;i++){
                System.out.print(arr[i]+", ");
            }
        }
        else{
            for(int i=front;i<N && size()!=0;i++){
                System.out.print(arr[i]+", ");
            }
            for(int i=0;i<rear && size()!=0;i++){
                System.out.print(arr[i]+", ");
            }
        }
        System.out.print("]");
        return("");
    }
}
class StacksnQueues{
    public static void main(String[] args){
        /*Stack stackarr=new Stack(5);
        stackarr.push(1);
        stackarr.push(2);
        stackarr.push(3);
        stackarr.pop();
        System.out.println("Size of stack- "+stackarr.N());
        System.out.println(stackarr);  */
        Queue queuearr=new Queue(5);      
        queuearr.enqueue(1); 
        queuearr.enqueue(2); 
        queuearr.enqueue(3); 
        queuearr.enqueue(4); 
        queuearr.enqueue(5);
        //queuearr.enqueue(6);
        queuearr.dequeue();
        queuearr.enqueue(6);
        queuearr.dequeue();
        queuearr.dequeue();
        queuearr.dequeue();
        queuearr.dequeue();
        queuearr.dequeue();
        /*queuearr.dequeue();
        System.out.println(queuearr.front+" "+queuearr.rear);
        queuearr.enqueue(6);
        queuearr.dequeue();
        queuearr.enqueue(7);
        queuearr.dequeue();
        queuearr.dequeue();
        queuearr.dequeue();
        queuearr.dequeue();
        queuearr.enqueue(8);
        queuearr.dequeue();
        queuearr.dequeue();*/
        System.out.println(queuearr.front+" "+queuearr.rear);
        System.out.println(queuearr); 
        System.out.println("Size of queue- "+queuearr.size());
    }
}