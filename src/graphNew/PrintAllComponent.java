package graphNew;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 0--------1-----2     6
// |        |           |
// 3--------4-----5     7

public class PrintAllComponent {
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
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(!vis[i]){
                List<Integer> op = new ArrayList<>();
                printComponents(i,g,vis,n,op);
                res.add(op);
            }
        }
        for(List<Integer> l: res){
            System.out.println(l);
        }
    }

    private static void printComponents(int src, List<Graph>[] g, boolean[] vis, int n, List<Integer> op) {
        if(vis[src]){
            return;
        }
        op.add(src);
        vis[src]=true;
        for(Graph i : g[src]){
            printComponents(i.nbr,g,vis,n,op);
        }
    }

    private static void addEdge(int i,int j,List<Graph> g[], int wt){
        g[i].add(new Graph(i,j,wt));
    }
}
