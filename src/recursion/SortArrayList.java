package recursion;

import java.util.ArrayList;
import java.util.List;
// complexity (O(n2))
public class SortArrayList {
    public static void main(String args[]) {
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(7);
        l.add(20);
        l.add(2);
        l.add(5);
        sort(l);
        System.out.println(l);
    }
    public static void sort(List<Integer> l){
        if(l.size() == 0 || l.size() == 1){
            return;
        }
        int k = l.remove(l.size()-1);
        sort(l);
        insert(l,k);
    }
    public static void insert(List<Integer> l, int k){
        //sort array ascending order
/*       if(l.size() == 0 || l.get(l.size()-1) <= k){
            l.add(k);
            return;
        }*/
        //sort array descending order
        if(l.size() == 0 || l.get(l.size()-1) >= k){
            l.add(k);
            return;
        }
        int x = l.remove(l.size()-1);
        insert(l,k);
        l.add(x);
    }
}
