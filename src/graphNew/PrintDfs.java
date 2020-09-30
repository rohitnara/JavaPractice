package graphNew;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 0--------1-----2     6
// |        |           |
// 3--------4-----5     7
public class PrintDfs {
    public static void main(String args[]){
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
        boolean vis[]=new boolean[n];
        Arrays.fill(vis,false);
        if(n==0){
            System.out.println("Empty graph");
        }
        for(int i=0;i<n;i++){
            if(!vis[i]){
                printAllPath(i,g,n,vis);
                System.out.println();
            }
        }
    }

/*    private static void printAllPath(int src, List<Graph>[] g, int n, boolean[] vis) {
        System.out.println(src);
        vis[src]=true;
        for(Graph l:g[src]){
            if(!vis[l.nbr]){
                printAllPath(l.nbr,g,n,vis);
            }
        }
    }*/

    private static void printAllPath(int src, List<Graph>[] g, int n, boolean[] vis) {
        if(vis[src]){
            return;
        }
        System.out.println(src);
        vis[src]=true;
        for(Graph l:g[src]){
            printAllPath(l.nbr,g,n,vis);
        }
    }

    private static void addEdge(int i, int j, List<Graph>[] g, int wt) {
        g[i].add(new Graph(i,j,wt));
    }
}