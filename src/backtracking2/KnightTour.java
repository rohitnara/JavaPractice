package backtracking2;

import java.util.Arrays;

public class KnightTour {
    public static void main(String args[]){
        int n=8;
        int [][] res=new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(res[i],0);
        }
        solve(n,res,1,2,3);
        print(res,n);

    }

    private static void solve(int n, int[][] res,int val, int i, int j) {
        if(i<0||i>=n||j<0||j>=n||res[i][j]>0){
            return;
        }
        if(val==n*n){
            res[i][j]=val;
            print(res,n);
            res[i][j]=0;
            return;
        }
            res[i][j]=val;
            solve(n,res,val+1,i-2,j+1);
            solve(n,res,val+1,i-2,j-1);
            solve(n,res,val+1,i-1,j+2);
            solve(n,res,val+1,i-1,j-2);
            solve(n,res,val+1,i+1,j+2);
            solve(n,res,val+1,i+1,j-2);
            solve(n,res,val+1,i+2,j+1);
            solve(n,res,val+1,i+2,j-1);
            res[i][j]=0;
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
