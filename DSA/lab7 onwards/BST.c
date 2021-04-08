#include <stdio.h>
#include <stdlib.h>
struct  BST{
    int data;
    struct BST * left,* right;
};
struct BST * head_ptr;
int N=0;
struct BST * create(int data){
    struct  BST * temp;
    temp=(struct BST *)malloc(sizeof(struct BST));
    temp->data=data;
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
        if(node->data >= temp->data){
            if(temp->right==NULL){
                temp->right=node;
                return;
            }
            temp=temp->right;
        }
        else if(node->data < temp->data){
            if(temp->left==NULL){
                temp->left=node;
                return;
            }
            temp=temp->left;
        }
    }
}
struct BST * search(int data){
    struct BST * temp=head_ptr;
    while(temp!=NULL){
        if(data > temp->data){
            temp=temp->right;
        }
        else if(data < temp->data){
            temp=temp->left;
        }
        else if(data==temp->data){
            printf("\nValue is present.");
            return temp;
        }
    }
    printf("\nValue not present.");
    return NULL;
}
struct BST * parentNode(int data){
    struct BST * temp=head_ptr;
    while(temp!=NULL){
        if(data >= temp->data){
            if(temp->right->data==data){
                return temp;
            }
            temp=temp->right;
        }
        else if(data < temp->data){
            if(temp->left->data==data){
                return temp;
            }
            temp=temp->left;
        }
    }
    return NULL;
}
struct BST * preceedingNode(struct BST * temp){//greatest element from the left sub-tree
    //struct BST * temp=search(data);
    temp=temp->left;
    while(temp->right!=NULL){
        temp=temp->right;
    }
    return temp;
}
struct BST * followingNode(struct BST * temp){//smallest element from the right sub-tree
    //struct BST * temp=search(data);
    temp=temp->right;
    while(temp->left!=NULL){
        temp=temp->left;
    }
    return temp;
}
void SomeOrder(BST * temp)
{
if(temp==NULL)
return;
SomeOrder(temp->right);
SomeOrder(temp->left);
printf("%d",temp->data);
}
struct BST* Delete(struct BST* root,int data){
    if(root==NULL){
        return root;
    }
    else if(data<root->data){
        root->left=Delete(root->left,data);
    }
    else if(data>root->data){
        root->right=Delete(root->right,data);
    }
    else{
        if(root->left==NULL && root->right==NULL){
            free(root);
            root=NULL;
        }
        else if(root->left==NULL){
            struct BST *temp=root;
            root=root->right;
            free(temp);
        }
        else if(root->right==NULL){
            struct BST *temp=root;
            root=root->left;
            free(temp);
        }
        else{
            struct BST *temp=followingNode(root);
            root->data=temp->data;
            root->right=Delete(root->right,temp->data);    
        }
    }
    return root;
}
struct BST * deleteNode(struct BST * root, int data) { 
    // base case 
    if (root == NULL) return root; 
  
    // If the key to be deleted is smaller than the root's key, 
    // then it lies in left subtree 
    if (data < root->data) 
        root->left = deleteNode(root->left, data); 
  
    // If the key to be deleted is greater than the root's key, 
    // then it lies in right subtree 
    else if (data > root->data) 
        root->right = deleteNode(root->right, data); 
  
    // if key is same as root's key, then This is the node 
    // to be deleted 
    else{ 
        // node with only one child or no child 
        if (root->left == NULL) { 
            struct BST *temp = root->right; 
            free(root); 
            return temp; 
        } 
        else if (root->right == NULL) { 
            struct BST *temp = root->left; 
            free(root); 
            return temp; 
        } 
  
        // node with two children: Get the inorder successor (smallest 
        // in the right subtree) 
        struct BST* temp = followingNode(root); 
  
        // Copy the inorder successor's content to this node 
        root->data = temp->data; 
  
        // Delete the inorder successor 
        root->right = deleteNode(root->right, temp->data); 
    } 
    return root; 
} 
int size(){
    return N;
}
void in_order(struct BST * temp){
    if(temp!=NULL){
        in_order(temp->left);
        printf("%d\t",temp->data);
        in_order(temp->right);
    }
}
void post_order(struct BST * temp){
    if(temp!=NULL){
        post_order(temp->left);
        post_order(temp->right);
        printf("%d\t",temp->data);
    }
}
void pre_order(struct BST * temp){
    if(temp!=NULL){
        printf("%d\t",temp->data);
        post_order(temp->left);
        post_order(temp->right);
    }
}
void printTree(struct BST * root, int space){ 
    if (root == NULL) 
        return; 
    space +=4; 
    printTree(root->right, space); 
    printf("\n"); 
    for (int i = 4; i < space; i++) 
        printf(" "); 
    printf("%d\n", root->data); 
    printTree(root->left, space); 
} 
void main(){
    insert(create(8));
    insert(create(10));
    insert(create(14));  
    insert(create(13));
    insert(create(3));
    insert(create(1));
    insert(create(6));
    insert(create(4));
    insert(create(7));
    //search(3);
    printTree(head_ptr,0);
    printf("\n");in_order(head_ptr);
    printf("\n");post_order(head_ptr);
    printf("\n");pre_order(head_ptr);
    //deleteNode(head_ptr,8);
    Delete(head_ptr,8);
    printTree(head_ptr,0);
    
}
