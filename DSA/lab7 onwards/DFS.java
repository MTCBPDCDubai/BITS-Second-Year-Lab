import java.io.*; 
import java.util.*; 
  
// This class represents a directed graph using adjacency list 
// representation 
class Graph 
{ 
    int V;   // No. of vertices 
  
    // Array  of lists for Adjacency List Representation 
    LinkedList<Integer> adj[]; 
    boolean visited[];
    // Constructor 
    Graph(int v) 
    { 
        V = v; 
        adj = new LinkedList[v]; 
        visited=new boolean[v];
        for (int i=0; i<v; ++i) 
            adj[i] = new LinkedList(); 
    } 
  
    //Function to add an edge into the graph 
    void addEdge(int v, int w) 
    { 
        adj[v].add(w);  // Add w to v's list. 
        //adj[w].add(v);
    } 
  
    // A function used by DFS 
    void DFS(int v) 
    { 
        // Mark the current node as visited and print it 
        visited[v] = true; 
        System.out.print(v+" "); 
  
        // Recur for all the vertices adjacent to this vertex 
        Iterator<Integer> i = adj[v].listIterator(); 
        while (i.hasNext()) 
        { 
            int n = i.next(); 
            if (!visited[n]) 
                DFS(n); 
        } 
    } 
}
class DFS{
  
    public static void main(String args[]) 
    { 
        Graph d = new Graph(9); 
  
        d.addEdge(0,1);
        d.addEdge(0,7);
        d.addEdge(1,2);
        d.addEdge(1,7);
        d.addEdge(2,1);
        d.addEdge(2,3);
        d.addEdge(2,5);
        d.addEdge(2,8);
        d.addEdge(3,2);
        d.addEdge(3,4);
        d.addEdge(3,5);
        d.addEdge(4,3);
        d.addEdge(4,5);
        d.addEdge(5,2);
        d.addEdge(5,3);
        d.addEdge(5,4);
        d.addEdge(5,6);
        d.addEdge(6,5);
        d.addEdge(6,7);
        d.addEdge(6,8);
        d.addEdge(7,0);
        d.addEdge(7,1);
        d.addEdge(7,6);
        d.addEdge(7,8);
        d.addEdge(8,2);
        d.addEdge(8,6);
        d.addEdge(8,7);
  
        System.out.println("Following is Depth First Traversal (starting from vertex 2)"); 
  
        d.DFS(0); 
    } 
} 