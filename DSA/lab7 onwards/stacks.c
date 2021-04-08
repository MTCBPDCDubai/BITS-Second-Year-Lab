#include <stdio.h>
int stackarr[];
int pointer=-1;
int sizeofstack;
int size(){
    return (pointer+1);
}
void push(int el){
    if(size()==sizeofstack){
        printf("Stack is full");
    }
    else{
        pointer++;
        stackarr[pointer]=el;
    }    
}
int pop(){
    if(size()==0){
        printf("Stack is empty");
    }
    else{
        int el=stackarr[pointer];
        pointer--;
        return el;
    }
}
void display_stack(){
    printf("\n[");
    for(int i=0;i<=pointer;i++){
        printf("%d, ",stackarr[i]);
    }
    printf("]\n");
}
void main(){
    sizeofstack=2;
    int stackarr[sizeofstack];
    push(1);
    push(2);
    push(3);
    display_stack();
}