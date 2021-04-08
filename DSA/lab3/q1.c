#include <stdio.h>
#include <string.h>
char stackarr[];
int pointer = -1;
int sizeofstack;
int check (char term){
    if (term == '(' || term == '{' || term == '[' || term == ')' || term == '}' || term == ']'){
        if (stackarr[pointer] == '[' && term == ']'){
	    return 0;
        }
        else if (stackarr[pointer] == '(' && term == ')'){
	    return 0;
	}
        else if (stackarr[pointer] == '{' && term == '}'){
	    return 0;
	}
        else{
	    return 1;
	}
    }
    else{
        return 2;
    }
}
int size (){
    return (pointer + 1);
}
void push (char el){
    if (size () == sizeofstack){
        printf ("Stack is full");
    }
    else{
        pointer++;
        stackarr[pointer] = el;
    }
}
char pop (){
    if (size () == 0){
        printf ("Stack is empty");
    }
    else{
        char el = stackarr[pointer];
        pointer--;
        return el;
    }
}
void main (){
    char eqn[20];
    printf ("Enter your equation: ");
    gets (eqn);
    sizeofstack =strlen(eqn);
    stackarr[sizeofstack];
    for (int i = 0; i < sizeofstack; i++){
        if (check (eqn[i]) == 1){
	    push(eqn[i]);
	}
        else if (check (eqn[i]) == 0){
	    pop();
	}
    }
    if (pointer == -1){
        printf("Equation is balanced");
    }
    else{
        printf("Equation is not balanced");
    }
}
