package backtracking;

import java.util.Arrays;

public class KnightAndTour {
    public static void main(String args[]){
        int n=8;
        int [][] res=new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(res[i],0);
        }
        solve(n,res,1,2,3);
        print(res,n);

    }

    private static boolean solve(int n, int[][] res,int val, int i, int j) {
        if(i<0||i>=n||j<0||j>=n||res[i][j]>0){
            return false;
        }
        if(val==n*n){
            res[i][j]=n*n;
            return true;
        }
        if(isSafe(n,i,j,res)){
            res[i][j]=val;
            if(solve(n,res,val+1,i-2,j+1)){
                return true;
            }
            if(solve(n,res,val+1,i-2,j-1)){
                return true;
            }
            if(solve(n,res,val+1,i-1,j+2)){
                return true;
            }
            if(solve(n,res,val+1,i-1,j-2)){
                return true;
            }
            if(solve(n,res,val+1,i+1,j+2)){
                return true;
            }
            if(solve(n,res,val+1,i+1,j-2)){
                return true;
            }
            if(solve(n,res,val+1,i+2,j+1)){
                return true;
            }
            if(solve(n,res,val+1,i+2,j-1)){
                return true;
            }
            res[i][j]=0;
        }
        return false;
    }

    private static boolean isSafe(int n, int i, int j, int[][] res) {
        return (i>=0&&i<n&&j>=0&&j<n&&res[i][j]==0)?true:false;
    }

    private static void print(int [][] res,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(res[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
