package graphOld;
import java.util.*;
import java.lang.*;

public class CycleDetectUndirectedGraph {
	int v;
	LinkedList<Integer> l[];
	CycleDetectUndirectedGraph(int n){
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
	void undirectCycleDetect(){
		Stack<Integer> s=new Stack<>();
		int vis[]=new int[v];
		Arrays.fill(vis,0);
		int parent=-1;
		s.push(0);
		vis[0]=1;
		while(s.size()!=0){
			int k=s.peek();
			int count=0;
			for(Integer obj:l[k]){
				//parent=k;
				if(vis[obj]==1&&obj!=parent){
					System.out.println("Cycle Exists");
					System.exit(0);
				}
				else if(vis[obj]==0){
					count++;
					vis[obj]=1;
					s.push(obj);
					parent=k;
				}
			}
			if(count==0){
				s.pop();
				if(s.peek()!=0){
				//s.pop();
				int z=s.pop();
				parent=s.peek();
				s.push(z);
				
			}
				else if(s.peek()==0){
					parent=-1;
				}
			}
		}
		System.out.println("Cycle Does not Exists");
	}
	
	public static void main(String[] args) {
		CycleDetectUndirectedGraph d=new CycleDetectUndirectedGraph(5);
		d.addEdge(0,1);
		//d.addEdge(0,2);
		d.addEdge(1,0);
		d.addEdge(1,2);
		//d.addEdge(1,3);
		//d.addEdge(2,0);
		d.addEdge(2,1);
		d.addEdge(2,3);
		d.addEdge(2,4);
		//d.addEdge(3,1);
		d.addEdge(3,2);
		d.addEdge(4,2);
		
		d.print();
		d.undirectCycleDetect();

	}

}
