package backtracking;

import java.util.Arrays;
//time O(2^(n^2))
//space O(2^(n^2))
public class RatMazePrintAllPath {
    public static void main(String args[]){
        int maze[][]={
                {1, 1, 1, 1},
                {1, 1, 0, 1},
                {1, 1, 1, 1},
                {10, 1, 0, 1}
        };
        if(maze.length==0){
            System.out.println("No Solution");
            return;
        }
        String op="";
        solve(0,0,maze,maze.length,maze[0].length,op);
    }
    private static void solve(int i,int j,int[][] maze,int m,int n,String op){
        if(!isSafe(i,j,m,n,maze)){
            return;
        }
        if(i==m-1&&j==n-1){
            System.out.println(op);
            return;
        }
        //vis[i][j]=true;
        //System.out.print(vis[i][j]);
        if(isSafe(i,j+1,m,n,maze)) {
            String op1 = op + 'R';
            solve(i, j + 1, maze, m, n, op1);
        }
        if(isSafe(i+1,j,m,n,maze)) {
            String op2 = op + 'D';
            solve(i + 1, j, maze, m, n, op2);
        }
        //vis[i][j]=false;
    }
    private static boolean isSafe(int i,int j, int m,int n, int[][] maze){
        return (i>=0&&i<m&&j>=0&&j<n&&maze[i][j]==1)?true:false;
    }
}
