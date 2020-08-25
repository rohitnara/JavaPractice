package graph;

import java.util.*;
//time complexity: O(V+E)
public class Bfs {
    public static void main(String[] args){
        int n = 9;
        List<List<Integer>> g = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<Integer> l3 = new ArrayList<>();
        List<Integer> l4 = new ArrayList<>();
        List<Integer> l5 = new ArrayList<>();
        List<Integer> l6 = new ArrayList<>();
        List<Integer> l7 = new ArrayList<>();
        List<Integer> l8 = new ArrayList<>();
        List<Integer> l9 = new ArrayList<>();
        l1.add(0);
        l1.add(1);
        g.add(l1);
        l2.add(0);
        l2.add(2);
        g.add(l2);
        l3.add(0);
        l3.add(3);
        g.add(l3);
        l4.add(2);
        l4.add(4);
        g.add(l4);
        l5.add(2);
        l5.add(5);
        g.add(l5);
        l6.add(4);
        l6.add(1);
        g.add(l6);
        l7.add(6);
        l7.add(7);
        g.add(l7);
        l8.add(7);
        l8.add(8);
        g.add(l8);
        l9.add(8);
        l9.add(6);
        g.add(l9);
        bfs(g,n);
    }
    static void bfs(List<List<Integer>> g, int n){
        Set<Integer> l[]=new Set[n];
        for(int i=0;i<n;i++){       //o(v)
            l[i]=new HashSet<>();
        }
        for(List<Integer> list: g){      //o(e)
            l[list.get(0)].add(list.get(1));
        }
        boolean[] vis = new boolean[n];
        Arrays.fill(vis,false);
        for(int i=0;i<n;i++) {
            if(!vis[i]) {
                bfs(l, vis, i);
                System.out.println();
            }
        }
    }
    static void bfs(Set<Integer> l[], boolean[] vis, int start){
        Queue<Integer> q= new LinkedList<>();
        q.add(start);
        vis[start]=true;
        while(q.size()!=0){
            int p=q.remove();
            System.out.print(p+" ");
            for(Integer i : l[p]){
                if(!vis[i]) {
                    q.add(i);
                    vis[i] = true;
                }
            }
        }
    }
}
