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
struct Student arr2[10];
void displayDetails(struct Student arr[],int k){
    arr[k];
    for(int i=0;i<k;i++){
        printf("\nName: %s",arr[i].name);
        printf("\nRollno.: %s",arr[i].rollno);
        printf("\nYear: %d",arr[i].year);
        printf("\nCGPA: %.1f",arr[i].cgpa);
    }
}
void main(){        
    FILE *fp;
    char ch;
    fp = fopen("studdetails.txt", "r");
    char str[250],cch[2];//str[0]='\0';
    strcpy(str,"");
    printf("%s",str);
    if (fp == NULL){
        printf("Error in opening the file");
    }
    int i=0,j=0;
    while((ch=getc(fp))!=EOF){
        if(ch!='\n' && ch!=','){
            cch[0]=ch;cch[1]='\0';
            strcat(str,cch); 
            //printf("%s",str);
        } 
        if(ch==','){
            if(i==0){
                //printf("1");
                strcpy(arr1[j].name,str);
            }
            else if(i==1){
                strcpy(arr1[j].rollno,str);
            }
            else if(i==2){
                arr1[j].year=atoi(str);
            }
            else if(i==3){
                char *strr=str;
                float ftemp=atof(strr);
                printf("%f",ftemp);
                arr1[j].cgpa=ftemp;
                i=-1;
            }
            //str[0]='\0';
            strcpy(str,"");
            strcpy(cch,"");
            i++;
        }
        if(ch=='\n'){
            //str[0]='\0';
            strcpy(str,"");
            strcpy(cch,"");
            j++;
        }
        if(j==10){
            break;
        }
    }
    fclose(fp);
    displayDetails(arr1,10);
}   