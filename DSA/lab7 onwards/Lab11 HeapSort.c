#include <stdio.h>
#include<string.h>
#define SIZE 9
struct processes{
    char ID[10];
    int burstTime;
}pArray[9];
void displayProcesses(struct processes p[]){
    for(int i=0;i<SIZE;i++){
        printf("\nProcess ID: %s",p[i].ID);
        printf("\nBurst time: %d",p[i].burstTime);
        printf("\n----------------------------------------");
    }
}
void exchange(struct processes p[],int i,int j){
    struct processes temp;
    strcpy(temp.ID,p[i].ID);
    temp.burstTime=p[i].burstTime;
    p[i]=p[j];
    p[j]=temp;
}
void build_heap(struct processes p[],int n){
    for(int i=n/2-1;i>=0;i--){
        max_heapify(p,n,i);
    }
}
void max_heapify(struct processes p[], int n, int i){   
    int largest = i; // Initialize largest as root 
    int l = 2*i + 1; // left = 2*i + 1 
    int r = 2*i + 2; // right = 2*i + 2 
    // If left child is larger than root 
    if (l < n && p[l].burstTime > p[largest].burstTime) 
        largest = l; 
    // If right child is larger than root 
    if (r < n && p[r].burstTime > p[largest].burstTime) 
        largest = r; 
    // If largest is not root 
    if (largest != i){
       exchange(p,i,largest);
      // Recursively heapify the affected sub-tree 
        max_heapify(p, n, largest); 
    } 
}
void heapSort(struct processes p[], int n){ 
    build_heap(p,n);
    // One by one extract an element from heap 
    for (int i=n-1; i>=0; i--) 
    {   
	     // Move current root to end of max-heap 
        exchange(p,0,i);
        // call max heapify on the root 
        max_heapify(p,i,0); 
    } 
} 

void main(){
    printf("\nEnter the process id along with burst time: ");
    for(int i=0;i<SIZE;i++){
        char ID[10];
        int time;
        printf("\nProcess id: ");
        scanf("%s",&pArray[i].ID);
        printf("\nBurst time: ");
        scanf("%d",&pArray[i].burstTime);
    }
    build_heap(pArray,SIZE);
    //displayProcesses(pArray);
    heapSort(pArray,SIZE);
    displayProcesses(pArray);
}