#include <stdio.h>
#include <string.h>
struct States{
    char cap[50],IDNO[50];
    float prec,pop_den;
    int pop,area;
};
void main(){
    int ch=0,i=0,k;
    char not[50];
    struct States state[10];
    while (ch!=5){
    	printf("\n1. Add state");
	printf("\t2. Search state");
	printf("\n3. Population Density");
	printf("\t4. Min prec");
	printf("\n5. Exit\n");
	scanf("%d",&ch);
	if (ch==1){
	    gets(not); //dummy
	    printf("\nEnter capital name: ");gets(state[i].cap);
	    printf("\nEnter state Idno: ");gets(state[i].IDNO);
	    printf("\nArea: ");scanf("%d",&state[i].area);
	    printf("\nPrecipitation: ");scanf("%f",&state[i].prec);
	    printf("\nPopulation: ");scanf("%d",&state[i].pop);
	    i++;
	}
	else if(ch==2){
	    int flag=0;
	    char IDNO[50];
	    gets(not);
	    printf("\nEnter state IDNO: ");gets(IDNO);
	    for (int j=0;j<10;j++){
	        if (strcmp(IDNO,state[j].IDNO)==0){
		    printf("\nState Capital: %s",state[j].cap);
		    printf("\nState Idno: %s",state[j].IDNO);
		    printf("\nState area: %d",state[j].area);
		    printf("\nState Precipitation: %f",state[j].prec);
		    printf("\nState Population: %d",state[j].pop);
		    flag=1;
		}
	    }
            if (flag==0){
	        printf("State details not found!");
	    }
	    continue;
	}
	else if(ch==3){
            k=0;
	    float pop_den,max_pop_den=0;
	    for(int j=0;j<i;j++){
	        pop_den=state[j].pop/state[j].area;
		printf("\nPopulation density of state %s: %f",state[j].cap,pop_den);
		state[j].pop_den=pop_den;
		if(state[j].pop_den>max_pop_den){
		    max_pop_den=state[j].pop_den;
		    k=j;
		}
	    }
	    printf("State with maximum population density is %s of %f",state[k].cap,max_pop_den);
	    continue;
	}
	else if(ch==4){
	    k=0;
	    float min_prec=state[0].prec;
	    for (int j=0;j<i-1;j++){
	        if(state[j+1].prec<state[j].prec){
		    min_prec=state[j+1].prec;
		    k=j+1;
		}
		else{
		    min_prec=state[j].prec;
		    k=j;
		}
	    }
	    printf("\nState with minimum precipitation is %s of %f",state[k].cap,min_prec);
	    continue;
	}
    }
}
