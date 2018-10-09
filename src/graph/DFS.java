package graph;
import java.util.*;
import java.io.*;
import java.lang.*;

public class DFS {
	int v;
	LinkedList<Integer> l[];
	DFS(int n){
		v=n;
		l=new LinkedList[v];
		for(int i=0;i<v;i++){
			l[i]=new LinkedList<>();
		}
	}
	void addEdge(int u,int v){
		l[u].add(v);
	}
	void print(){
		for(int i=0;i<v;i++){
			System.out.print(i);
			for(Object obj:l[i]){
				System.out.print("->" + obj);
			}
			System.out.println();
		}
	}
	void DFSPrint(int start){
		Stack<Integer> s=new Stack<>();
		int vis[]=new int[v];
		Arrays.fill(vis,0);
		s.push(start);
		System.out.println(start);
		vis[start]=1;
		while(s.size()!=0){
			int x=s.peek();
			int count=0;
			for(Integer obj:l[x]){
				if(vis[obj]==0){
					System.out.println(obj);
					s.push(obj);
					vis[obj]=1;
					count++;
					break;
				}
			}
			if(count==0){
				s.pop();
			}
		}
	}

	public static void main(String[] args) {
		DFS d=new DFS(5);
		/*d.addEdge(0,1);
		d.addEdge(0,2);
		d.addEdge(0,3);
		d.addEdge(1,3);
		d.addEdge(2,3);
		d.addEdge(2,4);
		d.addEdge(3,4);
		d.addEdge(4,1);
		d.addEdge(1,5);
		d.addEdge(2,6);*/
		d.addEdge(0,1);
		d.addEdge(0,2);
		d.addEdge(1,0);
		d.addEdge(1,2);
		d.addEdge(1,3);
		d.addEdge(2,0);
		d.addEdge(2,1);
		d.addEdge(2,3);
		d.addEdge(2,4);
		d.addEdge(3,1);
		d.addEdge(3,2);
		d.addEdge(4,2);
		d.print();
		d.DFSPrint(0);

	}

}
