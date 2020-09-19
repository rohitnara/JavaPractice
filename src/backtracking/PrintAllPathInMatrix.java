package backtracking;

import java.util.Arrays;

public class PrintAllPathInMatrix {
    public static void main(String args[]){
        int maze[][]={
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        if(maze.length==0){
            System.out.println("No path");
            return;
        }
        int m=maze.length;
        int n=maze[0].length;
        String op=""+maze[0][0];
        solve(maze,op,0,0,m,n);
    }

    private static void solve(int[][] maze, String op, int i, int j, int m, int n) {
        if(i==m-1&&j==n-1){
            System.out.println(op);
            return;
        }
        if(i>=0&&i<m&&j+1>=0&&j+1<n){
            solve(maze,op+maze[i][j+1],i,j+1,m,n);
        }
        if(i+1>=0&&i+1<m&&j>=0&&j<n){
            solve(maze,op+maze[i+1][j],i+1,j,m,n);
        }
    }
}
