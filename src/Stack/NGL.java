package Stack;

import java.util.Stack;

public class NGL {
    public static void main(String[] args){
        int a[]={2,1,8,7,9,10,8,9};
        if(a.length==0){
            return;
        }
        int res[]=new int[a.length];
        Stack<Integer> s = new Stack<>();
        nextGreaterToLeft(a,res,s);
        print(res);
    }
    private static void nextGreaterToLeft(int a[], int res[],Stack<Integer> s){
        int k=0;
        res[k++]=-1;
        s.add(a[0]);
        for(int i=1;i<a.length;i++){
            while(s.size()!=0){
                if(a[i]<s.peek()){
                    res[k++]=s.peek();
                    s.add(a[i]);
                    break;
                }else {
                    s.pop();
                }
            }
            if(s.size()==0){
                res[k++]=-1;
                s.add(a[i]);
            }
        }
    }
    private static void print(int [] res){
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
