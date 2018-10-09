package graph;
import java.util.*;
import java.io.*;
import java.lang.*;

public class CycleDetectionDirectedgraph {
	int v;
	LinkedList<Integer> l[];
	CycleDetectionDirectedgraph(int n){
		v=n;
		l=new LinkedList[v];
		for(int i=0;i<v;i++){
			l[i]=new LinkedList<>();
		}
	}
	void addEdge(int x,int y){
		l[x].add(y);
	}
	void print(){
		for(int i=0;i<v;i++){
			System.out.print(i);
			for(Integer obj:l[i]){
				System.out.print("->"+obj);
			}
			System.out.println();
		}
	}
	void cycledetect(){
		Stack<Integer> s=new Stack<>();
		int vis[]=new int[v];
		s.push(0);
		vis[0]=1;
		while(s.size()!=0){
			int k=s.peek();
			int count=0;
			for(Integer obj:l[k]){
				if(vis[obj]==1){
					if(s.contains(obj)==true){
						System.out.println("Cycle Exist");
						System.exit(0);
					}
				}
				else if(vis[obj]==0){
					s.push(obj);
					vis[obj]=1;
					count++;
				}
			}
			if(count==0){
				s.pop();
			}
		}
		System.out.println("Cycle Does not Exist");
	}

	public static void main(String[] args) {
		CycleDetectionDirectedgraph d=new CycleDetectionDirectedgraph(7);
		d.addEdge(0,1);
		d.addEdge(0,2);
		d.addEdge(0,3);
		d.addEdge(1,3);
		d.addEdge(2,3);
		d.addEdge(2,4);
		d.addEdge(3,4);
		//d.addEdge(4,1);
		d.addEdge(1,5);
		d.addEdge(2,6);
		d.print();
		d.cycledetect();
	}

}
