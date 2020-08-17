package recursion;

import java.util.ArrayList;
import java.util.List;
//Complexity O(n)
public class MaximumInAnArray {
    public static void main(String args[]) {
        List<Integer> l = new ArrayList<>();
        l.add(40);
        l.add(7);
        l.add(20);
        l.add(2);
        l.add(100);
        if(l.size()==0){
            System.out.println(0);
            return;
        }
        System.out.println(max(l, l.size()-1));
    }
    public static int max(List<Integer> l, int n) {
        if(n==0){
            return l.get(n);
        }
        int k = max(l,n-1);
        return k<=l.get(n)?l.get(n):k;
        // for min element
        //return k<=l.get(n)?k:l.get(n);
    }
}
