package graphNew;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

// 0--------1-----2
// |        |
// 3--------4-----5
public class PrintDfsStack {
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
        int src=3;
        int dest=2;
        boolean vis[]=new boolean[n];
        Arrays.fill(vis,false);
        for(int i=0;i<n;i++){
            if(!vis[i]){
                print(i,g,n,vis);
                System.out.println();
            }
        }
    }

    private static void print(int src, List<Graph>[] g, int n, boolean[] vis) {
        Stack<Integer> s=new Stack<>();
        s.add(src);
        System.out.println(src);
        vis[src]=true;
        while(s.size()!=0){
            int k=s.peek();
            boolean allLoopExecuted=true;
            for(Graph i: g[k]){
                if(!vis[i.nbr]){
                    s.add(i.nbr);
                    System.out.println(i.nbr);
                    vis[i.nbr]=true;
                    allLoopExecuted=false;
                    break;
                }
            }
            if(allLoopExecuted){
                s.pop();
            }
        }
    }

    private static void addEdge(int i, int j, List<Graph>[] g, int wt) {
        g[i].add(new Graph(i,j,wt));
    }
}
