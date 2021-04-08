#include <stdio.h>
#include <string.h>
#include <stdlib.h>//for malloc func
struct Student{//Please kill me
    char name[30];
    char rollno[30];
    float cgpa;
    struct Student * right;
    struct Student * left;
};
struct Student * head=NULL;
struct Student * create(){
    char s[30];
    struct Student * temp;
    char name[30],rollno[30];
    float cgpa;
    gets(s);
    printf("\nEnter name: ");gets(name);//scanf("%s",&name);
    printf("\nEnter roll no.: ");gets(rollno);//scanf("%s",&rollno);
    printf("\nEnter CGPA: ");scanf("%f",&cgpa);
    temp=(struct Student *)malloc(sizeof(struct Student));
    strcpy(temp->name,name);
    strcpy(temp->rollno,rollno);
    temp->cgpa=cgpa;
    return temp;
}
struct Student * insert(struct Student * current,struct Student * node){
    head=current;
    if(head==NULL){
        return node;
    }
    while(current->right!=NULL){
        current=current->right;
    }
    current->right=node;
    node->left=current;
    return head;
}
int giveIndex(struct Student * current,char key[]){
    int count=0;
    while(current!=NULL){
        if(strcmp(key,current->rollno)==0){
            return count;
        }
        current=current->right;
        count++;
    }
    return -1;
}
struct Student * delete(struct Student * current,char key[]){
    int index=giveIndex(current,key);
    printf("%d",index);
    struct Student * head_backup=current;
    if(index==-1){
        printf("\nElement not in list.");
        return current;
    }
    else if(index==0){
        current->right->left=NULL;
        return current->right;
    }
    int count=0;
    while(current!=NULL){
        if(count+1==index){
            current->right=current->right->right;
            current->right->right->left=current;
        }
        current=current->right;
        count++;
    }
    return head_backup;
}
void display(struct Student * current){
    while(current!=NULL){
        printf("\nName: %s",current->name);
        printf("\nRoll no.:%s",current->rollno);
        printf("\nCGPA: %.2f",current->cgpa);
        current=current->right;
    }
}
void main(){
    head=insert(head,create());
    head=insert(head,create());
    head=insert(head,create());
    display(head);
    head=delete(head,"67");
    display(head);
}