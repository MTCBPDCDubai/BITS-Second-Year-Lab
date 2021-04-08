#include <stdio.h>
void main(){
    int arr[]={1,2,3,4,5};
    int n=sizeof(arr)/sizeof(arr[0]);
    for(int i=0;i<n/2;i++){
        int a=arr[i];
	arr[i]=arr[n-i-1];
	arr[n-i-1]=a;
    }
    printf("After reversing- ");
    printf("\n");
    for(int i=0;i<n;i++){
        printf("%d ",arr[i]);
    }
}
