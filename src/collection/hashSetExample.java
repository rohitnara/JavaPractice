package collection;

import java.util.*;

public class hashSetExample {

	public static void main(String[] args) {
		Set<Integer>s=new HashSet<Integer>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(60);
		s.add(10);
		for(Object obj:s){
			System.out.println(obj+" ");
		}
		System.out.println(s.contains(10));
		System.out.println(s.contains(90));
		s.remove(20);
		System.out.println(s);
		System.out.println(s.size());
		

	}

}
