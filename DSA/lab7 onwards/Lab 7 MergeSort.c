#include <stdio.h>
#include <string.h>
#include <stdlib.h>

struct Student{
    char name[50];
    char rollno[50];
    int year;
    float cgpa;
};
struct Student arr1[10];
void displayDetails(struct Student arr[],int k){
    for(int i=0;i<k;i++){
        printf("\nName: %s",arr[i].name);
        printf("\nRollno.: %s",arr[i].rollno);
        printf("\nYear: %d",arr[i].year);
        printf("\nCGPA: %.1f",arr[i].cgpa);
        printf("\n-----------------------------------");
    }
}
void mergeSort(int p,int r){
    if(p<r){
        int q=(p+r)/2;
        mergeSort(p,q);
        mergeSort(q+1,r);
        merge(p,q,r);
    }
}
void merge(int p,int q,int r){
    int n1=q-p+1;
    int n2=r-q;
    struct Student L[n1];
    struct Student R[n2];
    for(int i=0;i<n1;i++){
        L[i]=arr1[p+i];
    }
    for(int i=0;i<n2;i++){
        R[i]=arr1[q+i+1];
    }
    int i=0,j=0,k=p;
    while(i<n1 && j<n2){
        if(strcmp(L[i].name,R[j].name)<0){
            arr1[k]=L[i];
            i++;
        }
        else{
            arr1[k]=R[j];
            j++;
        }
        k++;
    }
    while(i<n1){
        arr1[k]=L[i];
        i++;k++;
    }
    while(j<n2){
        arr1[k]=R[j];
        j++;k++;
    }
}
void main(){
    FILE *fp;
    char ch;
    fp = fopen("studdetails.txt", "r");
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
                    strcpy(arr1[j].rollno,token);
                }
                else if(i==2){
                    arr1[j].year=atoi(token);
                }
                else if(i==3){
                    char *strr=token;
                    float ftemp=atof(token);
                    arr1[j].cgpa=ftemp;
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
    mergeSort(0,9);
    printf("\nAfter Sorting- ");
    displayDetails(arr1,10);
}   