#include <stdio.h> 
int queuearr[];
int N, front = 0, rear = 0;
int size (){
    return rear - front;
}
int dispFront(){
    return (queuearr[front]);
}
int isEmpty (){
    return (rear == front);
}
void enqueue (int el){
    if (rear == N){
        printf ("\nQueue is full\n");
    }
    else{
        queuearr[rear] = el;
        rear++;
    }
}
int dequeue (){
    if (isEmpty ()){
        printf ("\nEmpty queue\n");
    }
    else{
        int el = queuearr[front];
        front++;
        return el;
    }
}
void displayQueue (){
    printf ("\n[");
    for (int i = front; i < rear; i++){
        printf ("%d, ", queuearr[i]);
    }
    printf ("]\n");
}
void main (){
    N = 3;
    int queuearr[N];
    enqueue (1);
    enqueue (2);
    enqueue (3);
    dequeue();
    displayQueue ();
    printf("\nFront element: %d",dispFront());
}
