package collection;

import java.util.*;

public class hashMapExample {
	void print(Map<Integer,String>m){
		for(Integer i:m.keySet()){
			System.out.print(i +" "+m.get(i));
		}
	}
	public static void main(String[] args) {
		hashMapExample a = new hashMapExample();
		Map<Integer,String>m=new HashMap<Integer,String>();
		 	m.put(1, "Ram");
		 	m.put(2, "Ram");
		 	m.put(3, "Rohit");
		 	m.put(4, "Mohan");
		 	m.put(5, "Shyam");
		 	m.put(1, "Hi");
		 	for(Integer i:m.keySet()){
		 		System.out.print(i +" "+m.get(i));
		 		System.out.println();
		 	}
		 	System.out.println(m.size());
		 	System.out.println(m.containsKey(1));
		 	System.out.println(m.containsValue("Ram"));
		 	System.out.println(m.containsKey(10));
		 	System.out.println(m.containsValue("Ra"));
		 	System.out.println();
		 	a.print(m);
		 	System.out.println();
		 	System.out.println(m);
		 	m.remove(1);
		 	System.out.println(m);
		 	m.values().remove("Rohit");
		 	System.out.println(m);
	}

}
