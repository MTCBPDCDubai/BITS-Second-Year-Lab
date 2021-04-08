#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
int N=13;
struct  HashTable * BArray[13];
struct HashTable{
    char hostname[30];
    char ip_address[30];
    struct HashTable * next;
};
struct HashTable * create(char hostname[],char ip_address[]){
    struct  HashTable * temp;
    temp=(struct HashTable *)malloc(sizeof(struct HashTable));
    strcpy(temp->hostname,hostname);
    strcpy(temp->ip_address,ip_address);
    return temp;
}
void insert(char hostname[],char ip_address[]){
    int key=h(hostname);
    printf("%d",key);
    for(int i=0;i<N;i++){
        if(i==key){
            if(BArray[i]==NULL){
                BArray[i]=create(hostname,ip_address);
            }
            else{
                struct HashTable * current=BArray[i];
                struct HashTable * node=create(hostname,ip_address);
                while(current->next!=NULL){
                    current=current->next;
                }
                current->next=node;
            }
        }
    }
}
int power(int a,int j){
    int s=1;
    for(int k=0;k<j;k++){
        s*=a;
    }
    return s;
}
int h(char k[]){
    int sum=0,a=33,j=0;
    for(int i=0;k[i]!='\0';i++){
        if(k[i]!='.'){
            int s=(int)k[i];
            sum+=s*power(a,j);
            j++;
        }
    }
    return abs(sum%N);
}
void search(char hostname[]){
    int i=h(hostname),flag=0;
    struct HashTable * current=BArray[i];
    while(current!=NULL){
        if(strcmp(current->hostname,hostname)==0){
            flag=1;
            printf("\nThe hostname %s is present in the hastable.",hostname);
            printf("\nThe ip address is %s",current->ip_address);
        }
        current=current->next;
    }
    if(flag==0){
        printf("\nNo such element found.");
    }
}
void display(){
    for(int i=0;i<N;i++){
        printf("\n %d ",i);
        struct HashTable * current=BArray[i];
        while(current!=NULL){
            printf("%s  %s  ",current->hostname,current->ip_address);
            current= current->next;
        }
    }
}
void main(){
    int ch=0;
    while(ch!=4){
        printf("\n1. Insert hostname with IP");
        printf("\n2. Search hostname");
        printf("\n3. Display");
        printf("\n4. Exit\n");  
        scanf("%d",&ch);
        if(ch==1){
            char s[30];
            char hostname[30];
            char ip_address[30];
            gets(s);
            printf("\nEnter host name: ");gets(hostname);//scanf("%s",&hostname);
            printf("\nEnter IP address: ");gets(ip_address);//scanf("%s",&ip_address);
            insert(hostname,ip_address);
        }
        else if(ch==2){
            char s[30];
            char hostname[30];
            gets(s);
            printf("\nPlease enter the hostname to be searched: ");
            gets(hostname);//scanf("%s",&hostname);
            search(hostname);
        }
        else if(ch==3){
            display();
        }
    }
}