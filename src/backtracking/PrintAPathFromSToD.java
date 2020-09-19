package backtracking;

import java.util.Arrays;
//time O(4^n^2)
public class PrintAPathFromSToD {
    public static void main(String args[]){
        int maze[][]={
                {1, 1, 1, 0},
                {1, 0, 0, 1},
                {1, 0, 0, 1},
                {1, 1, 1, 1}
        };
        if(maze.length==0){
            System.out.println("No Solution");
            return;
        }
        int m=maze.length;
        int n=maze[0].length;
        int s1=0;
        int s2=2;
        int d1=1;
        int d2=0;
        int [][] res=new int[m][n];
        boolean [][] vis=new boolean[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(res[i],0);
        }
        for(int i=0;i<m;i++){
            Arrays.fill(vis[i],false);
        }
        if(solve(maze,res,s1,s2,d1,d2,m,n,vis)) {
            printSol(res);
            return;
        }else {
            System.out.println("No Solution");
            return;
        }
    }

    private static boolean solve(int[][] maze, int[][] res, int s1, int s2, int d1, int d2, int m, int n,boolean [][] vis) {
        if(s1==d1&&s2==d2&&maze[s1][s2]==1){
            res[s1][s2]=1;
            return true;
        }
        if(isSafe(s1,s2,m,n,maze,vis)){
            res[s1][s2]=1;
            vis[s1][s2]=true;
            if(solve(maze,res,s1,s2+1,d1,d2,m,n,vis)){
                vis[s1][s2]=false;
                return true;
            }
            if(solve(maze,res,s1+1,s2,d1,d2,m,n,vis)){
                vis[s1][s2]=false;
                return true;
            }
            if(solve(maze,res,s1-1,s2,d1,d2,m,n,vis)){
                vis[s1][s2]=false;
                return true;
            }
            if(solve(maze,res,s1,s2-1,d1,d2,m,n,vis)){
                vis[s1][s2]=false;
                return true;
            }
            res[s1][s2]=0;
            vis[s1][s2]=false;
            return false;
        }
        return false;
    }

    private static boolean isSafe(int i,int j,int m,int n,int[][] maze,boolean [][] vis){
        return (i>=0&&i<m&&j>=0&&j<n&&maze[i][j]==1&&!vis[i][j])? true:false;
    }
    private static void printSol(int [][] res){
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
