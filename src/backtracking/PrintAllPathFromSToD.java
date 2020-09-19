package backtracking;

import java.util.Arrays;

public class PrintAllPathFromSToD {
    public static void main(String args[]){
        int maze[][]={
                {1, 0, 1, 0},
                {1, 0, 1, 1},
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
        boolean [][] vis=new boolean[m][n];
        String op="";
        for(int i=0;i<m;i++){
            Arrays.fill(vis[i],false);
        }
        solve(maze,op,s1,s2,d1,d2,m,n,vis);
    }

    private static void solve(int[][] maze, String op, int s1, int s2, int d1, int d2, int m, int n,boolean [][] vis) {
        if(s1==d1&&s2==d2){
            System.out.println(op);
            return;
        }
        if(isSafe(s1,s2,m,n,maze,vis)){
            vis[s1][s2]=true;
            if(isSafe(s1,s2+1,m,n,maze,vis)){
                String op1=op+'R';
                solve(maze,op1,s1,s2+1,d1,d2,m,n,vis);
            }
            if(isSafe(s1,s2-1,m,n,maze,vis)){
                String op2=op+'L';
                solve(maze,op2,s1,s2-1,d1,d2,m,n,vis);
            }
            if(isSafe(s1-1,s2,m,n,maze,vis)){
                String op3=op+'U';
                solve(maze,op3,s1-1,s2,d1,d2,m,n,vis);
            }
            if(isSafe(s1+1,s2,m,n,maze,vis)){
                String op4=op+'D';
                solve(maze,op4,s1+1,s2,d1,d2,m,n,vis);
            }
            vis[s1][s2]=false;
        }
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
