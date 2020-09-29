package graphNew;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 0--------1-----2
// |        |
// 3--------4-----5
class Graph {
    int source;
    int nbr;
    int wt;
    Graph(int source, int nbr, int wt) {
        this.source=source;
        this.nbr=nbr;
        this.wt=wt;
    }
}
public class FindPathDfs {
    public static void main(String []args){
        int n=8;
        List<Graph> g[]=new ArrayList[n];
        for(int i=0;i<n;i++){
            g[i]=new ArrayList<>();
        }
        addEdge(0,1,g,10);
        addEdge(0,3,g,10);
        addEdge(1,0,g,10);
        addEdge(1,2,g,10);
        addEdge(1,4,g,10);
        addEdge(2,1,g,10);
        addEdge(3,0,g,10);
        addEdge(3,4,g,10);
        addEdge(4,3,g,10);
        addEdge(4,1,g,10);
        addEdge(4,5,g,10);
        addEdge(5,4,g,10);
        addEdge(6,7,g,10);
        addEdge(7,6,g,10);
        int src=0;
        int dest=4;
        boolean vis[]=new boolean[n];
        Arrays.fill(vis,false);
        System.out.println(isPathExists(src,dest,g,n,vis));
    }

    private static boolean isPathExists(int src, int dest, List<Graph>[] g, int n,boolean vis[]) {
        if(vis[src]){
            return false;
        }
        if(src==dest){
            return true;
        }
        vis[src]=true;
        for(Graph l: g[src]){
            if(isPathExists(l.nbr,dest,g,n,vis)){
                return true;
            }
        }
        return false;
    }

    private static void addEdge(int i, int j, List<Graph>[] g, int wt) {
        g[i].add(new Graph(i,j,wt));
    }
}
