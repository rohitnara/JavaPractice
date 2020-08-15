package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args){
        List<Integer> l = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        System.out.println(l);
        System.out.println(l.size());
        l.remove(0);
        System.out.println(l);
        l1.add(100);
        l1.add(200);
        l.addAll(l1);
        System.out.println(l);
        l.add(2,60);
        System.out.println(l);
        l.set(1,70);
        System.out.println(l);
        System.out.println(l.contains(60));
        System.out.println(l.indexOf(70));
        l.add(70);
        System.out.println(l.indexOf(70));
        System.out.println(l.lastIndexOf(70));
        Collections.sort(l,(x,y)->x-y);
        System.out.println(l);
        Collections.sort(l,(x,y)->y-x);
        System.out.println(l);
        Collections.reverse(l);
        System.out.println(l);
        List<String> s = new ArrayList<>();
        s.add("hi");
        s.add("hello");
        s.add("yo");
        Collections.sort(s,(x,y)->x.length()-y.length()==0?x.compareTo(y):x.length()-y.length());
        System.out.println(s);
        for(int i=0;i<l.size();i++){
            System.out.print(l.get(i)+" ");
        }
        System.out.println();
        for(Integer i: l){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println(l.indexOf(700));
        System.out.println(Collections.binarySearch(l,700));
    }
}
