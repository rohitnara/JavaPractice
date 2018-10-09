package collection;
import java.util.*;

public class queueExample {
	public static void main(String args[]){
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		q.add(60);
		System.out.println(q.size());
		System.out.println(q.contains(10));
		System.out.println(q.contains(80));
		System.out.println(q.remove());
		System.out.println(q.peek());
		q.add(90);
		System.out.println(q);
		for(Object obj:q){
			System.out.print(obj+" ");
		}
		
	}

}
