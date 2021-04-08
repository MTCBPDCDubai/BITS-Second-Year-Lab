#include <stdio.h>
#include <string.h>
void main(){
    char eqn[50];
    printf("Equation: ");gets(eqn);
    int count=0;
    for(int i=0;i<50;i++){
        if(eqn[i]=='('){
	    count++;
	}
	else if(eqn[i]==')'){
	    count--;
	}
	if(count<0){
	    break;
	}
    }
    if(count==0){
        printf("Balanced");
    }
    else{
        printf("Not Balanced");
    }
}
