package backtracking;

import java.util.Arrays;

public class NQueen {
    public static void main(String args[]){
        int n=8;
        int [][] res=new int[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(res[i],0);
        }
        if(solve(n,res,0))
            print(res,n);
        else
            System.out.println("No Sol");
    }
    private static boolean solve(int n,int[][] res,int j){
        if(j==n){
            return true;
        }
        for(int i=0;i<n;i++){
            if(isSafe(res,i,j,n)){
                res[i][j]=1;
                if(solve(n,res,j+1)){
                    return true;
                }
                res[i][j]=0;
            }
        }
        return false;
    }
    private static void print(int [][] res,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
    private static boolean isSafe(int[][] res,int i,int j,int n){
        if(!left(res,i,j-1,n))
            return false;
/*        if(!right(res,i,j+1,n))
            return false;
        if(!up(res,i-1,j,n))
            return false;
        if(!down(res,i+1,j,n))
            return false;*/
        if(!leftUp(res,i-1,j-1,n))
            return false;
/*        if(!rightUp(res,i-1,j+1,n))
            return false;
        if(!rightDown(res,i+1,j+1,n))
            return false;*/
        if(!leftDown(res,i+1,j-1,n))
            return false;
        return true;
    }
    private static boolean left(int[][] res,int i,int j,int n){
        if(j==-1)
            return true;
        if(i>=0&&i<n&&j>=0&&j<n&&res[i][j]==1){
            return false;
        }
        return left(res,i,j-1,n);
    }
    private static boolean right(int[][] res,int i,int j,int n){
        if(j==n)
            return true;
        if(i>=0&&i<n&&j>=0&&j<n&&res[i][j]==1){
            return false;
        }
        return right(res,i,j+1,n);
    }
    private static boolean up(int[][] res,int i,int j,int n){
        if(i==-1)
            return true;
        if(i>=0&&i<n&&j>=0&&j<n&&res[i][j]==1){
            return false;
        }
        return up(res,i-1,j,n);
    }
    private static boolean down(int[][] res,int i,int j,int n){
        if(i==n)
            return true;
        if(i>=0&&i<n&&j>=0&&j<n&&res[i][j]==1){
            return false;
        }
        return down(res,i+1,j,n);
    }
    private static boolean leftUp(int[][] res,int i,int j,int n){
        if(i==-1||j==-1)
            return true;
        if(i>=0&&i<n&&j>=0&&j<n&&res[i][j]==1){
            return false;
        }
        return leftUp(res,i-1,j-1,n);
    }
    private static boolean rightUp(int[][] res,int i,int j,int n){
        if(i==-1||j==n)
            return true;
        if(i>=0&&i<n&&j>=0&&j<n&&res[i][j]==1){
            return false;
        }
        return rightUp(res,i-1,j+1,n);
    }
    private static boolean rightDown(int[][] res,int i,int j,int n){
        if(i==n||j==n)
            return true;
        if(i>=0&&i<n&&j>=0&&j<n&&res[i][j]==1){
            return false;
        }
        return rightDown(res,i+1,j+1,n);
    }
    private static boolean leftDown(int[][] res,int i,int j,int n){
        if(i==n||j==-1)
            return true;
        if(i>=0&&i<n&&j>=0&&j<n&&res[i][j]==1){
            return false;
        }
        return leftDown(res,i+1,j-1,n);
    }
}
