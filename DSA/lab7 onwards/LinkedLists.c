#include <stdio.h>
#include <string.h>
#include <stdlib.h>
struct Student{
    char name[30];
    int rollno;
    struct Student * next;
};
struct Student * head=NULL;
struct Student * create(){
    struct Student * temp;
    char name[30];
    int rollno;
    printf("\nEnter name: ");scanf("%s",&name);
    printf("\nEnter roll no.: ");scanf("%d",&rollno);
    temp=(struct Student *)malloc(sizeof(struct Student));
    strcpy(temp->name,name);
    temp->rollno=rollno;
    return temp;
}
struct Student * insert(struct Student * current,struct Student * node){
    head=current;
    if(head==NULL){
        return node;
    }
    while(current->next!=NULL){
        current=current->next;
    }
    current->next=node;
    return head;
}
void display(struct Student * current){
    while(current!=NULL){
        printf("\n%s",current->name);
        printf("\n%d",current->rollno);
        current=current->next;
    }
}
void main(){
    head=insert(head,create());
    display(head);
    head=insert(head,create());
    display(head);
}