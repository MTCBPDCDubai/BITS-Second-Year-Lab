#include <stdio.h>
#include <string.h>
#include <stdlib.h>

struct Contacts{
    char name[50];
    char phoneno[50];
};
struct Contacts arr1[10];
void swap(int i,int j){
    struct Contacts temp=arr1[i];
    arr1[i]=arr1[j];
    arr1[j]=temp;
}
int Partition(int p,int r){
    char name[50];
    strcpy(name,arr1[r].name);
    int i=p-1;
    for(int j=p;j<r;j++){
        if(strcmp(name,arr1[j].name)>=0){
            i++;
            swap(i,j);
        }
    }
    swap(i+1,r);
    return i+1;
}
void QuickSort(int p,int r){
    if(p<r){
        int q=Partition(p,r);
        QuickSort(p,q-1);
        QuickSort(q+1,r);
    }
}
void displayDetails(struct Contacts arr[],int k){
    for(int i=0;i<k;i++){
        printf("\nName: %s",arr[i].name);
        printf("\nPhone no.: %s",arr[i].phoneno);
        printf("\n-----------------------------------");
    }
}
void main(){
    FILE *fp;
    char ch;
    fp = fopen("phonedetails.txt", "r");
    char str[500],cch[2];
    strcpy(str,"");
    printf("%s",str);
    if (fp == NULL){
        printf("Error in opening the file");
    }
    int i=0,j=0;
    while((ch=getc(fp))!=EOF){
        if(ch!='\n'){
            cch[0]=ch;cch[1]='\0';
            strcat(str,cch);
        }
        else{
            char * token = strtok(str, ",");
            // loop through the string to extract all other tokens
            while( token != NULL ) {
                if(i==0){
                    strcpy(arr1[j].name,token);
                }
                else if(i==1){
                    strcpy(arr1[j].phoneno,token);
                    i=-1;
                }
                token = strtok(NULL,",");
                i++;
            }
            j++;
            strcpy(str,"");
        }
    }
    fclose(fp);
    printf("\nBefore Sorting- ");
    displayDetails(arr1,10);
    QuickSort(0,9);
    printf("\nAfter Sorting- ");
    displayDetails(arr1,10);
}   