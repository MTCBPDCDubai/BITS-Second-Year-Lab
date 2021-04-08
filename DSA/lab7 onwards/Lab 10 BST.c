#include <stdio.h>
#include <stdlib.h>
struct  BST{
    int idno;
    char name[30];
    float cgpa;
    struct BST * left,* right;
};
struct BST * head_ptr;
int N=0;
struct BST * create(int idno,char name[],float cgpa){
    struct  BST * temp;
    temp=(struct BST *)malloc(sizeof(struct BST));
    temp->idno=idno;
    strcpy(temp->name,name);
    temp->cgpa=cgpa;
    temp->right=NULL;
    temp->left=NULL;
    return temp;
}
void insert(struct BST * node){
    N++;    
    struct BST * temp=head_ptr;
    if(temp==NULL){
        head_ptr=node;
    }
    while(temp!=NULL){
        if(node->idno >= temp->idno){
            if(temp->right==NULL){
                temp->right=node;
                return;
            }
            temp=temp->right;
        }
        else if(node->idno < temp->idno){
            if(temp->left==NULL){
                temp->left=node;
                return;
            }
            temp=temp->left;
        }
    }
}
struct BST * search(int idno){
    struct BST * temp=head_ptr;
    while(temp!=NULL){
        if(idno > temp->idno){
            temp=temp->right;
        }
        else if(idno < temp->idno){
            temp=temp->left;
        }
        else if(idno==temp->idno){
            printf("\nValue is present.");
            return temp;
        }
    }
    printf("\nValue not present.");
    return NULL;
}
struct BST * preceedingNode(int idno){//greatest element from the left sub-tree
    struct BST * temp=search(idno);
    temp=temp->left;
    while(temp->right!=NULL){
        temp=temp->right;
    }
    return temp;
}
struct BST * followingNode(int idno){//smallest element from the right sub-tree
    struct BST * temp=search(idno);
    temp=temp->right;
    while(temp->left!=NULL){
        temp=temp->left;
    }
    return temp;
}
struct node* deleteNode(struct BST * root, int idno){ 
    if (root == NULL) return root; 
    if (idno < root->idno) 
        root->left = deleteNode(root->left, idno); 
    else if (idno > root->idno) 
        root->right = deleteNode(root->right, idno); 
    else{ 
        if (root->left == NULL) { 
            struct node *temp = root->right; 
            free(root); 
            return temp; 
        } 
        else if (root->right == NULL) { 
            struct node *temp = root->left; 
            free(root); 
            return temp; 
        } 
        struct BST* temp = followingNode(root->idno); 
        root->idno = temp->idno; 
        strcpy(root->idno,temp->idno); 
        root->cgpa = temp->cgpa; 
        root->right = deleteNode(root->right, temp->idno); 
    } 
    return root; 
} 
int size(){
    return N;
}
void in_order(struct BST * temp){
    if(temp!=NULL){
        in_order(temp->left);
        printNode(temp);
        printf("\n");
        in_order(temp->right);
    }
}
void post_order(struct BST * temp){
    if(temp!=NULL){
        post_order(temp->left);
        post_order(temp->right);
        printNode(temp);
        printf("\n");
    }
}
void pre_order(struct BST * temp){
    if(temp!=NULL){
        printNode(temp);
        printf("\n");
        post_order(temp->left);
        post_order(temp->right);
    }
}
void printNode(struct BST * temp){
    printf("%d\t",temp->idno);
    printf("%s\t",temp->name);
    printf("%.1f\t",temp->cgpa);
}
void printTree(struct BST * root, int space){ 
    if (root == NULL) 
        return; 
    space +=4; 
    printTree(root->right, space); 
    printf("\n"); 
    for (int i = 4; i < space; i++) 
        printf(" "); 
    printf("%d| ",root->idno);
    printf("%s| ",root->name);
    printf("%.1f| ",root->cgpa);
    printTree(root->left, space); 
} 
void main(){
    insert(create(96,"Chirag Asarpota Anup Kumar",7.6));
    insert(create(103,"Sai Deepti Vakkalanka",7.5));
    insert(create(107,"Dipesh Bhagwan",7.4));
    insert(create(140,"Himanshu Tyagi",7.3));
    insert(create(135,"Hanna Merin James",8.5));  
    insert(create(410,"Vishvathika Manohar",8.4));  
    insert(create(1,"Aadib Hassan",8.3));  
    insert(create(3,"Aastha Anil Jha",8.2));  
    insert(create(23,"Afraa Siraj Hussain",8.1));  
    insert(create(34,"Akash Venkatraman",8.0));  
    insert(create(42,"Amith Kumbhar",7.9));  
    insert(create(54,"Angad Khangura",7.8));  
    insert(create(91,"Bhuvesh Gaind",7.7));  
    insert(create(281,"Dave Yash Parthiv",9.1));  
    insert(create(424,"Shalini Melam",9.0));   
    insert(create(19,"Adith Cheshan",8.9));  
    insert(create(80,"Asees Singh Abbot",8.8));  
    insert(create(153,"Joel Stephen",7.2));  
    insert(create(209,"Mohammead Wajih Humayun",7.1));  
    insert(create(13,"Erica Jacqueline Pinto",8.6));   
    int ch=0;
    while(ch!=8){
        printf("\n1. Insert");
        printf("\n2. Delete");
        printf("\n3. Search");
        printf("\n4. Display (In-order)");
        printf("\n5. Display (Pre-order)");
        printf("\n6. Display (Post-order)");
        printf("\n7. Size");
        printf("\n8. Exit\n");
        scanf("%d",&ch);
        if(ch==1){
            char s[30],name[30];
            int idno;
            float cgpa;
            gets(s);
            printf("\nName: ");gets(name);
            printf("\nIdno: ");scanf("%d",&idno);
            printf("\nCGPA: ");scanf("%f",&cgpa);
            insert(create(idno,name,cgpa));  
        }
        else if(ch==2){
            printf("\nEnter the idno to be deleted: ");
            int idno;scanf("%d",&idno);
            deleteNode(head_ptr,idno);
        }
        else if(ch==3){
            printf("\nEnter the idno to be searched for: ");
            int idno;scanf("%d",&idno);
            search(idno);
        }
        else if(ch==4){
            in_order(head_ptr);
        }
        else if(ch==5){
            pre_order(head_ptr);
        }
        else if(ch==6){
            post_order(head_ptr);
        }
        else if(ch==7){
            printf("\n%d",size());
        }
    }
    printTree(head_ptr,0);
}