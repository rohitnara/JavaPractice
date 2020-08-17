package recursion;

import java.util.Stack;
// complexity (O(n2))
public class ReverseStack {
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        System.out.println(s);
        reverse(s);
        System.out.println(s);
    }
    public static void reverse(Stack<Integer> s) {
        if(s.size()==0 || s.size()==1){
            return;
        }
        int k = s.pop();
        reverse(s);
        insert(s,k);
    }
    public static void insert(Stack<Integer> s, int k){
        if(s.size()==0){
            s.add(k);
            return;
        }
        int x= s.pop();
        insert(s,k);
        s.add(x);
    }
}
