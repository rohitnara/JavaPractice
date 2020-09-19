package amazon;

import java.util.ArrayList;
import java.util.List;

public class Sol {
    public static void main(String args[]){
        int a[]={1,2,3};
        if(a.length==0){
            return;
        }
        List<Integer> op=new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        solve(a,0,op,res);
        printSol(res);
    }

    private static void printSol(List<List<Integer>> res) {
        for(List<Integer> l: res){
            System.out.println(l);
        }
    }

    private static void solve(int []a,int i,List<Integer> op,List<List<Integer>> res){
        if(i==a.length){
            res.add(op);
            return;
        }
        List<Integer> op1=new ArrayList<>();
        op1.addAll(op);
        op1.add(a[i]);
        List<Integer> op2=new ArrayList<>();
        op2.addAll(op);
        solve(a,i+1,op1,res);
        solve(a,i+1,op2,res);
    }
}
