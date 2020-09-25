package backtracking2;

import java.util.Arrays;

public class Print1PathAllDirection {
    public static void main(String args[]){
        int maze[][]={
                {1, 1, 1, 0},
                {1, 1, 0, 0},
                {1, 0, 0, 1},
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
        int res[][] = new int [m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(res[i],0);
        }
        if(solve(0,0,res,maze,m,n,vis)){
            print(res);
        }else {
            System.out.println("No Solution");
        }
    }
    private static boolean solve(int i,int j,int [][] res, int [][] maze, int m,int n,boolean vis[][]){
        if(i<0||i>=m||j<0||j>=n||maze[i][j]==0||vis[i][j])
            return false;
        if(i==m-1&&j==n-1){
            res[i][j]=1;
            return true;
        }
        res[i][j]=1;
        vis[i][j]=true;
        if(solve(i,j-1,res,maze,m,n,vis))
            return true;
        if(solve(i-1,j,res,maze,m,n,vis))
            return true;
        if(solve(i,j+1,res,maze,m,n,vis))
            return true;
        if(solve(i+1,j,res,maze,m,n,vis))
            return true;
        res[i][j]=0;
        return false;

    }
    private static void print(int [][] res){
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
