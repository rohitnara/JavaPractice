package graphNew;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
//time: O(ElogV)
//work for negative weight edge but not work for negative weight cycle
class Nodes {
    int v;
    String psf;
    int wsf;
    Nodes(int v, String psf, int wsf){
        this.v=v;
        this.psf=psf;
        this.wsf=wsf;
    }
}
public class DijkstraAllDest {
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
        String psf = ""+src;
        int wsf=0;
        boolean vis[]=new boolean[n];
        Arrays.fill(vis,false);
        dijkstra(src,g,n,vis,psf,wsf);
    }

    private static void dijkstra(int src, List<Graph>[] g, int n, boolean[] vis, String psf, int wsf) {
        PriorityQueue<Nodes> pq=new PriorityQueue<>((x,y)->x.wsf-y.wsf);
        pq.add(new Nodes(src,psf,wsf));
        while(pq.size()!=0){
            Nodes p = pq.remove();
            if(vis[p.v]){
                continue;
            }
            vis[p.v]=true;
            System.out.print("src: "+src+" dest: "+p.v+" weight: "+p.wsf+" path: "+p.psf);
            System.out.println();
            for(Graph i: g[p.v]){
                if(!vis[i.nbr]){
                    pq.add(new Nodes(i.nbr,p.psf+i.nbr,p.wsf+i.wt));
                }
            }
        }
    }

    private static void addEdge(int i, int j, List<Graph>[] g, int wt) {
        g[i].add(new Graph(i,j,wt));
    }
}
