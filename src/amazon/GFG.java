package amazon;

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    int v;
    LinkedList<Integer> l[];
    GFG(int n){
        v=n;
        l=new LinkedList[v];
        for(int i=0;i<v;i++){
            l[i]=new LinkedList<>();
        }
    }
    void addEdge(int x,int y){
        l[x].add(y);
    }
    void fun(int s,int d){
        Queue<Integer> q=new LinkedList<>();
        int count=0;
        int parent=-1;
        q.add(s);
        while(q.size()!=0){
            int z=q.remove();
            if(z==d)
            count++;
            int c=0;
            for(Integer obj:l[z]){
                if(obj!=parent){
                    q.add(obj);
                   c++;
                   // System.out.println(obj+" "+parent);
                }
                
            }
            if(c>0)
            parent=z;
        }
        System.out.println(count);
    }
	public static void main (String[] args) {
	    int t;
	    Scanner sc=new Scanner(System.in);
	    t=sc.nextInt();
	    while(t--!=0){
	        int n,e;
	        n=sc.nextInt();
	        e=sc.nextInt();
		    GFG g=new GFG(n);
		    while(e--!=0){
		        int a=sc.nextInt();
		        int b=sc.nextInt();
		        g.addEdge(a,b);
		    }
		    int s=sc.nextInt();
		    int d=sc.nextInt();
		    g.fun(s,d);
	    }
	}
}
