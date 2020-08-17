package recursion;

import java.util.Stack;
//complexity O(n)
public class DeleteMiddleStack {
    public static void main(String[] args){
        Stack<Integer> s = new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        //s.add(5);
        System.out.println(s);
        int mid = (s.size()/2)+1;
        if(s.size()==0){
            return;
        }
        delete(s,mid);
        System.out.println(s);
    }
    public static void delete(Stack<Integer> s, int mid){
        if(mid==1){
            s.pop();
            return;
        }
        int k=s.pop();
        delete(s,mid-1);
        s.add(k);
    }
}
