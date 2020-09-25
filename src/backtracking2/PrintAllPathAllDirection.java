package backtracking2;

import java.util.Arrays;

public class PrintAllPathAllDirection {
    public static void main(String args[]){
        int maze[][]={
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 1, 1}
        };
        if(maze.length==0){
            System.out.println("No Solution");
            return;
        }
        int m= maze.length;
        int n=maze[0].length;
        boolean vis[][]=new boolean[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(vis[i],false);
        }
        solve(0,0,"",maze,m,n,vis);
    }
    private static void solve(int i,int j,String op, int [][] maze, int m,int n,boolean vis[][]){
        if(i<0||i>=m||j<0||j>=n||maze[i][j]==0||vis[i][j])
            return;
        if(i==m-1&&j==n-1){
            System.out.println(op);
            return;
        }
        vis[i][j]=true;
        if(i-1>=0&&i-1<m&&j>=0&&j<n&&maze[i-1][j]==1&&!vis[i-1][j]){
            solve(i-1,j,op+'U',maze,m,n,vis);
        }
        if(i>=0&&i<m&&j+1>=0&&j+1<n&&maze[i][j+1]==1&&!vis[i][j+1]){
            solve(i,j+1,op+'R',maze,m,n,vis);
        }
        if(i+1>=0&&i+1<m&&j>=0&&j<n&&maze[i+1][j]==1&&!vis[i+1][j]){
            solve(i+1,j,op+'D',maze,m,n,vis);
        }
        if(i>=0&&i<m&&j-1>=0&&j-1<n&&maze[i][j-1]==1&&!vis[i][j-1]){
            solve(i,j-1,op+'L',maze,m,n,vis);
        }
        vis[i][j]=false;
    }
}
