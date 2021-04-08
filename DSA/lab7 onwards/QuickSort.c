#include<stdio.h>
void displayArray(int arr[],int n){
    for(int i=0;i<n;i++){
        printf("%d, ",arr[i]);
    }
    printf("\n");
}
int Partition(int A[],int p,int r){
    int x=A[r];
    int i=p;
    for(int j=p;j<r;j++){
        if(A[j]<=x){
            int temp=A[i];
            A[i]=A[j];
            A[j]=temp;
            i++;
        }
    }//from p to i elements are less than A[r]
    int temp= A[i];
    A[i]=A[r];
    A[r]=temp;
    return i;
}
void QuickSort(int A[],int p,int r){
    if(p<r){
        int q=Partition(A,p,r);
        QuickSort(A,p,q-1);
        QuickSort(A,q+1,r);
    }
}
void main(){
    int A[]={85,24,63,45,17,31,96,5};
    QuickSort(A,0,7);
    displayArray(A,8);
}