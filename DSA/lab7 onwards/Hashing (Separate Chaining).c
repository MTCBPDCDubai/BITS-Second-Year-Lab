#include <stdio.h>
#include <stdlib.h>
int N=13;
struct  HashTable * BArray[13];
struct HashTable{
    int data;
    struct HashTable * next;
};
struct HashTable * create(int d){
    struct  HashTable * temp;
    temp=(struct HashTable *)malloc(sizeof(struct HashTable));
    temp->data=d;
    return temp;
}
void search(int data){
    int i=h(data),flag=0;
    struct HashTable * current=BArray[i];
    while(current!=NULL){
        if(current->data=data){
            flag=1;
        }
        current=current->next;
    }
    if(flag==0){
        printf("\nNo such element found.");
    }
    else{
        printf("\n%d is present in the hash table.",data);
    }
}
void insert(int d,int k){
    int key=h(k);
    for(int i=0;i<N;i++){
        if(i==key){
            if(BArray[i]==NULL){
                BArray[i]=create(d);
            }
            else{
                struct HashTable * current=BArray[i];
                struct HashTable * node=create(d);
                while(current->next!=NULL){
                    current=current->next;
                }
                current->next=node;
            }
        }
    }
}
int h(int k){
    return k%N;
}
void display(){
    for(int i=0;i<N;i++){
        printf("\n %d ",i);
        struct HashTable * current=BArray[i];
        while(current!=NULL){
            printf("%d, ",current->data);
            current= current->next;
        }
    }
}
void main(){
    insert(90,90);
    insert(41,41);
    insert(36,36);
    insert(18,18);
    insert(28,28);
    insert(12,12);
    insert(54,54);
    insert(10,10);
    search(10);
    display();
}