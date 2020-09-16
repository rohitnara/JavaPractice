package DP;

import java.io.StringBufferInputStream;

public class PrintLCS {
    public static void main(String args[]){
        String a= "abc";
        String b="xyzb";
        int m=a.length();
        int n=b.length();
        int dp[][]=new int[m+1][n+1];
        lcs(a,b,m,n,dp);
        print(dp,m,n,a,b);
    }
    private static void lcs(String a, String b, int m,int n, int dp[][]){
        for(int i=0;i<=m;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<=n;j++){
            dp[0][j]=0;
        }
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(a.charAt(i-1)==b.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
    }
    private static void print(int dp[][],int m,int n, String a, String b){
        StringBuilder sb = new StringBuilder();
        int i=m;
        int j=n;
        while(i>0&&j>0){
            if(a.charAt(i-1)==b.charAt(j-1)){
                sb.append(a.charAt(i-1));
                i--;
                j--;
            }else {
                if(dp[i][j-1]>=dp[i-1][j]){
                    j--;
                }else {
                    i--;
                }
            }
        }
        System.out.println(sb.reverse());
    }
}
