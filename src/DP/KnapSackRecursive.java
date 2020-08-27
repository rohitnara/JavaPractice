package DP;

import java.util.Scanner;
//time complexity O(2^n)
//space O(1)
public class KnapSackRecursive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int wt[]=new int[n];
        int val[]=new int[n];
        int w= sc.nextInt();
        for(int i=0;i<n;i++){
            val[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            wt[i]=sc.nextInt();
        }
        System.out.println(knapSack(wt,val,w,n));
    }
    static int  knapSack(int wt[], int val[], int w, int n){
        if(n==0||w==0){
            return 0;
        }
        if(wt[n-1]<=w){
            return Math.max(val[n-1]+knapSack(wt,val,w-wt[n-1],n-1), knapSack(wt,val,w,n-1));
        }else {
            return knapSack(wt,val,w,n-1);
        }
    }
}
