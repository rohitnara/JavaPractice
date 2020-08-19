package recursion;

import java.util.ArrayList;
import java.util.List;

public class ReverseArrayList {
    public static void main(String args[]) {
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(7);
        l.add(20);
        l.add(2);
        l.add(5);
        System.out.println(l);
        reverse(l);
        System.out.println(l);
    }
    public static void reverse(List<Integer> l){
        if(l.size()==0||l.size()==1){
            return;
        }
        int k=l.remove(l.size()-1);
        reverse(l);
        l.add(0,k);
    }
}
