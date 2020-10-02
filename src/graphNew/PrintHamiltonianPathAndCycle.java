package graphNew;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// 0--------1-----2
// |        |     |
// 3--------4-----5
public class PrintHamiltonianPathAndCycle {
    public static void main(String args[]){
        int n=6;
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
        addEdge(2,5,g,10);
        addEdge(5,2,g,10);
        boolean vis[]=new boolean[n];
        Arrays.fill(vis,false);
        int src=0;
        String op=""+src;
        printPathAndCycle(src,g,vis,n,1,op,src);
    }

    private static void printPathAndCycle(int src, List<Graph>[] g, boolean[] vis, int n, int count,String op,int origin) {
        if(count==n){
            for(Graph i: g[src]){
                if(origin==i.nbr){
                    System.out.println(op + " "+ "cycle");
                    return;
                }
            }
            System.out.println(op + " "+ "path");
            return;
        }
        vis[src]=true;
        for(Graph i: g[src]){
            if(!vis[i.nbr]){
                printPathAndCycle(i.nbr,g,vis,n,count+1,op+i.nbr,origin);
            }
        }
        vis[src]=false;
    }

    private static void addEdge(int i,int j,List<Graph> g[], int wt){
        g[i].add(new Graph(i,j,wt));
    }
}
