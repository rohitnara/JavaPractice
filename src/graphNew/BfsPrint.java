package graphNew;

import java.util.*;
// 0--------1-----2     6
// |        |           |
// 3--------4-----5     7
public class BfsPrint {
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
                printBfs(i,g,n,vis);
                System.out.println();
            }
        }
    }

    private static void printBfs(int src, List<Graph>[] g, int n, boolean[] vis) {
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        while(q.size()!=0){
            int p=q.remove();
            if(vis[p]){
                continue;
            }
            vis[p]=true;
            System.out.print(p);
            for(Graph i: g[p]){
                q.add(i.nbr);
            }
        }
    }

    private static void addEdge(int i, int j, List<Graph>[] g, int wt) {
        g[i].add(new Graph(i,j,wt));
    }
}
