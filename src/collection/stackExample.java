package collection;

import java.util.*;

public class stackExample {
	void print(Stack<Integer>s){
		for(Object obj:s){
			System.out.print(obj+" ");
		}
	}

	public static void main(String[] args) {
		stackExample a=new stackExample();
		Stack <Integer> s = new Stack<>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(60);
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		System.out.println(!s.isEmpty());
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.contains(20));
		System.out.println(s.contains(80));
		
/*		while(s.size()!=0){
			System.out.print(s.pop()+ " ");
		}*/
/*		while(!s.isEmpty()){
			System.out.print(s.pop()+ " ");
		}*/
		for(Integer i:s){
			System.out.print(i+" ");
		}
		System.out.println();
		a.print(s);

	}

}
