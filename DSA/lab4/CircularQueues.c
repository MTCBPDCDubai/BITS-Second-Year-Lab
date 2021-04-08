#include <stdio.h>
int queuearr[];
int N, s = 0, front = 0, rear = 0;
int size (){
    return s;
}
int dispFront(){
    return(queuearr[front]);
}
int isEmpty (){
    return (size () == 0);
}
void enqueue (int el){
    if (size () == N){
        printf ("\nQueue is full\n");
    }
    else{
        s++;
        queuearr[rear] = el;
        rear = (rear + 1) % N;
    }
}
int dequeue (){
    if (isEmpty ()){
        printf ("\nEmpty queue\n");
    }
    else{
        s--;
        int el = queuearr[front];
        front = (front + 1) % N;
        return el;
    }
}

void displayQueue (){
    printf ("\n[");
    if (rear > front){
        for (int i = front; i < rear; i++){
	    printf ("%d, ", queuearr[i]);
	}
    }
    else{
        for (int i = front; i < N && size () != 0; i++){
	    printf ("%d, ", queuearr[i]);
	}
        for (int i = 0; i < rear && size () != 0; i++){
	    printf ("%d, ", queuearr[i]);
	}
    }
    printf ("]\n");
}
void main (){
    N = 3;
    int queuearr[N];
    enqueue (1);
    enqueue (2);
    enqueue (3);
    dequeue ();
    enqueue (4);
    displayQueue ();
    printf("\nFront element: %d",dispFront());
}
