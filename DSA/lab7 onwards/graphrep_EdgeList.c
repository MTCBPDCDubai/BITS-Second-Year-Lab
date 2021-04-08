#include <stdio.h>
#define edges 4
#define vertices 5
char *vertex_list[]={'a','b','c','d','e'};
//char vertex_list[]={'a','b','c','d','e'};
struct Edge{
    char *startVertex;
    char *endVertex;
    int weight;
}edge_list[edges];
void printEdges(){
    for (int i=0;i<edges;i++){
        printf("\n%c-----%c",edge_list[i].startVertex,edge_list[i].endVertex);
    }
}
void main(){
    //initializing the edges
    edge_list[0].startVertex=vertex_list[0];
    edge_list[0].endVertex=vertex_list[1];
    edge_list[1].startVertex=vertex_list[0];
    edge_list[1].endVertex=vertex_list[2];
    edge_list[2].startVertex=vertex_list[1];
    edge_list[2].endVertex=vertex_list[3];
    edge_list[3].startVertex=vertex_list[2];
    edge_list[3].endVertex=vertex_list[4];
    /*
    edge_list[0].startVertex=(char *)vertex_list[0];//edge_list[0].startVertex=&vertex_list[0];
    edge_list[0].endVertex=(char *)vertex_list[1];
    edge_list[1].startVertex=(char *)vertex_list[0];
    edge_list[1].endVertex=(char *)vertex_list[2];
    edge_list[2].startVertex=(char *)vertex_list[1];
    edge_list[2].endVertex=(char *)vertex_list[3];
    edge_list[3].startVertex=(char *)vertex_list[2];
    edge_list[3].endVertex=(char *)vertex_list[4];
    */
   printEdges();
}