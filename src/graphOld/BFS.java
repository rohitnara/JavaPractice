package graphOld;
import java.util.*;
import java.lang.*;

public class BFS {
	int v;
	LinkedList<Integer> l[];
	BFS(int n){
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
	void BFSFind(int start){
		Queue<Integer> q=new LinkedList<>();
		int vis[]=new int[v];
		Arrays.fill(vis,0);
		q.add(start);
		vis[start]=1;
		while(q.size()!=0){
			int k=q.peek();
			System.out.println(q.remove());
			for(Integer obj:l[k]){
				if(vis[obj]==0){
				q.add(obj);
				vis[obj]=1;
				}
			}
		}
		
	}

	public static void main(String[] args) {
		BFS d=new BFS(5);
		//directed graph
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
		//undirected graph
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
		d.BFSFind(1);

	}

}
