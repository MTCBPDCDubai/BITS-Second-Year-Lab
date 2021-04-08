//This is just for testing.
#include <stdio.h>
int h(char k[]){
    for(int i=0;k[i]!='\0';i++){
        printf("\n%c",k[i]);
    }
}
void main(){
    char str[30]="google.com";
    h(str);
}