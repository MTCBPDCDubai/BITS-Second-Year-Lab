#include <stdio.h>//https://brilliant.org/wiki/insertion/
void displayArray(int arr[],int n){
    for(int i=0;i<n;i++){
        printf("%d, ",arr[i]);
    }
    printf("\n");
}
void main(){
    int arr[]={85,24,63,45,17,31,96,50};
    for(int j=1;j<8;j++){
        int key=arr[j];
        int i=j-1;
        while(i>=0 && arr[i]>key){
            arr[i+1]=arr[i];
            i=i-1;
        }
        arr[i+1]=key;//array gets sorted from left
    }
    displayArray(arr,8);
}