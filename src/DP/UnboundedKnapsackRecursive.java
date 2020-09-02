package DP;

public class UnboundedKnapsackRecursive {
    public static void main(String[] args){
        int n=2;
        int wt[]={2,1};
        int val[]={1,1};
        int w=3;
        System.out.println(knapsack(val,wt,w,n));
    }

    private static int knapsack(int[] val, int[] wt, int w, int n) {
        if(n==0||w==0){
            return 0;
        }
        if(wt[n-1]<=w){
            return Math.max(val[n-1]+knapsack(val,wt,w-wt[n-1],n),knapsack(val,wt,w,n-1));
        }else {
            return knapsack(val,wt,w,n-1);
        }
    }
}
