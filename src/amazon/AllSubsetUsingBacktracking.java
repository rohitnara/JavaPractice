package amazon;

import java.util.ArrayList;
import java.util.List;

class AllSubsetUsingBacktracking {

    public static void main(String args[]){
        int a[]={1,2,3};
        combinationSum(a);
    }
    public static List<List<Integer>> combinationSum(int[] a) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        solve(res,curr,0,a.length,a);
        for(List<Integer> l: res){
            System.out.println(l);
        }
        return res;
    }

    private static void solve(List<List<Integer>> res,List<Integer> curr,int start,int end,int[] candidates){
        res.add(new ArrayList<>(curr));
        for(int i=start;i<end;i++){
            curr.add(candidates[i]);
            solve(res,curr,i+1,end,candidates);
            curr.remove(curr.size()-1);
        }
    }
}
