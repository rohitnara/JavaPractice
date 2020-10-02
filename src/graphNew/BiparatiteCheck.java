package graphNew;

import java.util.*;

// 0------1
// |\     |
//   \    |
//    \   |
//     \  |
//      \ |
//       \2

//A graph is not biparatite only if it has odd length cycle.
//Biparatite---> all acyclic, cyclic(even length)
class Node {
    int val;
    int lev;
    Node(int val,int lev){
        this.val=val;
        this.lev=lev;
    }
}
public class BiparatiteCheck {
    public static void main(String args[]){
        int n=3;
        List<Graph> g[]=new ArrayList[n];
        for(int i=0;i<n;i++){
            g[i]=new ArrayList<>();
        }
        addEdge(0,1,g,10);
        addEdge(0,2,g,10);
        addEdge(1,0,g,10);
        addEdge(1,2,g,10);
        addEdge(2,1,g,10);
        addEdge(2,0,g,10);
        int vis[]=new int[n];
        Arrays.fill(vis,0);
        if(n==0){
            System.out.println("Empty graph");
        }
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                if(isBiParatite(i,g,n,vis,1)){
                    System.out.print("No");
                    return;
                }
            }
        }
        System.out.print("Yes");
    }

    private static boolean isBiParatite(int src, List<Graph>[] g, int n, int[] vis, int level) {
        Queue<Node> q=new LinkedList<>();
        q.add(new Node(src,level));
        while(q.size()!=0){
            Node p=q.remove();
            if(vis[p.val]>0){
                if(vis[p.val]!=p.lev){
                    return true;
                }
                continue;
            }
            vis[p.val]=p.lev;
            for(Graph i:g[p.val]){
                if(vis[i.nbr]==0){
                    q.add(new Node(i.nbr, p.lev+1));
                }
            }
        }
        return false;
    }

    private static void addEdge(int i, int j, List<Graph>[] g, int wt) {
        g[i].add(new Graph(i,j,wt));
    }
}
