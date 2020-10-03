package graphNew;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
//time: O(ElogV)
class NodeP{
    int v;
    int weight;
    NodeP(int v, int weight){
        this.v=v;
        this.weight=weight;
    }
}
public class Prims {
    public static void main(String []args){
        int n=5;
        List<Graph> g[]=new ArrayList[n];
        for(int i=0;i<n;i++){
            g[i]=new ArrayList<>();
        }
        addEdge(0,1,g,50);
        addEdge(0,3,g,10);
        addEdge(1,0,g,50);
        addEdge(1,2,g,5);
        addEdge(1,4,g,8);
        addEdge(2,1,g,5);
        addEdge(2,3,g,10);
        addEdge(4,1,g,8);
        addEdge(3,0,g,10);
        addEdge(3,2,g,10);
        int src=0;
        int weight=0;
        boolean vis[]=new boolean[n];
        Arrays.fill(vis,false);
        prims(src,g,n,vis,weight);
    }

    private static void prims(int src, List<Graph>[] g, int n, boolean[] vis, int weight) {
        PriorityQueue<NodeP> pq=new PriorityQueue<>((x,y)->x.weight-y.weight);
        pq.add(new NodeP(src,weight));
        while(pq.size()!=0){
            NodeP p = pq.remove();
            if(vis[p.v]){
                continue;
            }
            vis[p.v]=true;
            System.out.print(p.v+"  "+p.weight);
            System.out.println();
            for(Graph i: g[p.v]){
                if(!vis[i.nbr]){
                    pq.add(new NodeP(i.nbr,i.wt));
                }
            }
        }

    }

    private static void addEdge(int i, int j, List<Graph>[] g, int wt) {
        g[i].add(new Graph(i,j,wt));
    }
}