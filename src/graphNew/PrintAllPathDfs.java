package graphNew;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 0--------1-----2
// |        |
// 3--------4-----5
public class PrintAllPathDfs {
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
        boolean vis[]=new boolean[n];
        Arrays.fill(vis,false);
        if(n==0){
            System.out.println("Empty graph");
        }
        int src=0;
        int dest=2;
        //String op=""+src;
        List<Integer> op=new ArrayList<>();
        op.add(src);
        printAllPath(src,dest,g,n,vis,op);
    }

    private static void printAllPath(int src, int dest, List<Graph>[] g, int n, boolean[] vis,List<Integer> op) {
        if(src==dest){
            System.out.println(op);
            return;
        }
        vis[src]=true;
        for(Graph l:g[src]){
            if(!vis[l.nbr]){
                op.add(l.nbr);
                //printAllPath(l.nbr,dest,g,n,vis,op+l.nbr);
                printAllPath(l.nbr,dest,g,n,vis,op);
                op.remove(op.size()-1);
            }
        }
        vis[src]=false;
    }

    private static void addEdge(int i, int j, List<Graph>[] g, int wt) {
        g[i].add(new Graph(i,j,wt));
    }
}
