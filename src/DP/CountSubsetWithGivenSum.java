package DP;

import java.util.Scanner;

public class CountSubsetWithGivenSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int a[]=new int[n];
        int sum= sc.nextInt();
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        System.out.println(getSum(a,sum,n));
    }
    static int getSum(int a[], int sum, int n){
        int dp[][]=new int [n+1][sum+1];
        for(int i=0;i<=sum;i++){
            dp[0][i]=0;
        }
        for(int i=0;i<=n;i++){
            dp[i][0]=1;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=sum;j++){
                if(a[i-1]<=j){
                    dp[i][j]=dp[i-1][j]+dp[i-1][j-a[i-1]];
                }else {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
}
