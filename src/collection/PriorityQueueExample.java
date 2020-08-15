package collection;

import java.util.*;

public class PriorityQueueExample {
    public static Map<String, Integer> m = new HashMap<>();
    public static void main(String[] args){
        List<String> l = new ArrayList<>();
        l.add("ram");
        l.add("ram");
        l.add("hi");
        l.add("hi");
        l.add("hi");
        l.add("hello");
        l.add("yes");
        l.add("yes");
        l.add("yes");
        l.add("yes");
        l.add("am");
        l.add("am");
        for(String s : l){
            m.put(s, m.getOrDefault(s, 0) + 1);
        }
        //PriorityQueue<String> pq = new PriorityQueue<>((x,y)->m.get(y)-m.get(x)==0?x.compareTo(y):m.get(y)-m.get(x));
        PriorityQueue<String> pq = new PriorityQueue<>((x,y)->fun(x,y));
        for(String s: m.keySet()){
            pq.add(s);
        }
        System.out.println(pq.size());
        System.out.println(pq.contains("yes"));
        System.out.println(pq.contains("no"));
        System.out.println(pq.peek());
        System.out.println(pq.remove());
        while(pq.size()!=0){
            System.out.println(pq.remove());
        }
    }
    static int fun (String x, String y){
        return m.get(y)-m.get(x)==0?y.compareTo(x):m.get(x)-m.get(y);
    }
}
