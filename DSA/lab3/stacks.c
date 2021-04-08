#include <stdio.h>
int arr[];
int pointer=-1;
void push(int el){
    pointer++;
    arr[pointer]=el;
}
int pop(){
    int el=arr[pointer];
    pointer--;
    return el;
}
void display(){
    printf("[");
    for(int i=0;i<=pointer;i++){
        printf("%d, ",arr[i]);
    }
    printf("]\n");
}
void main(){
    printf("Enter size of stack- ");
    int size;
    scanf("%d",&size);
    int arr[size];
    push(1);
    push(2);
    pop();
    display();
}

