package backtracking;

import java.util.Arrays;

public class RatMazeAllDirection {
    public static void main(String args[]){
        int maze[][]={
                {1, 0, 1, 1},
                {1, 1, 1, 1},
                {1, 0, 1, 1},
                {1, 1, 1, 1}
        };
        if(maze.length==0){
            System.out.println("No Solution");
            return;
        }
        int m=maze.length;
        int n=maze[0].length;
        int res[][]=new int[m][n];
        boolean vis[][]=new boolean[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(vis[i],false);
        }
        for(int i=0;i<m;i++){
            Arrays.fill(res[i],0);
        }
        solve(0,0,maze,m,n,res,vis);
        print(res);
    }

    private static void print(int[][] res) {
        for(int i=0;i< res.length;i++){
            for (int j=0;j<res[0].length;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static boolean solve(int i,int j, int [][]maze,int m,int n,int res[][],boolean vis[][]){
        if(i==m-1&&j==n-1&&maze[i][j]==1){
            res[i][j]=1;
            return true;
        }
        if(isSafe(i,j,m,n,maze,vis)){
            vis[i][j]=true;
            res[i][j]=1;
            if(solve(i - 1, j, maze, m, n, res, vis)) {
                vis[i][j]=false;
                return true;
            }
            if(solve(i, j+1, maze, m, n, res, vis)) {
                vis[i][j]=false;
                return true;
            }
            if(solve(i + 1, j, maze, m, n, res, vis)) {
                vis[i][j]=false;
                return true;
            }
            if(solve(i , j-1, maze, m, n, res, vis)) {
                vis[i][j]=false;
                return true;
            }
            res[i][j]=0;
            vis[i][j]=false;
            return false;
        }
        return false;
    }
    private static boolean isSafe(int i,int j,int m,int n,int[][] maze,boolean[][] vis){
        return (i>=0&&i<m&&j>=0&&j<n&&maze[i][j]==1&&!vis[i][j])?true:false;
    }
}
