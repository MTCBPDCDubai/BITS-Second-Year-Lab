#include <stdio.h>
#include <stdbool.h>
void main(){
    int arr[]={1,2,3,4,5};
    int n=sizeof(arr)/sizeof(arr[0]);
    bool check=true;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
	    if(arr[i]==arr[j]){
	        check=false;
		break;
	    }    
	}
    }
    if(check){
        printf("Unique");
    }
    else{
        printf("Not unique");
    }
}
