package backtracking2;

public class PrintAllPath {
    public static void main(String args[]){
        int maze[][]={
                {1, 1, 1, 0},
                {0, 1, 1, 1},
                {0, 1, 0, 1},
                {1, 1, 1, 1}
        };
        if(maze.length==0){
            System.out.println("No Solution");
            return;
        }
        String op="";
        solve(0,0,op,maze,maze.length,maze[0].length);
    }
    private static void solve(int i,int j,String op, int [][] maze, int m,int n){
        if(i<0||i>=m||j<0||j>=n||maze[i][j]==0)
            return;
        if(i==m-1&&j==n-1){
            System.out.println(op);
            return;
        }
        if(i+1>=0&&i+1<m&&j>=0&&j<n&&maze[i+1][j]==1){
            solve(i+1,j,op+'D',maze,m,n);
        }
        if(i>=0&&i<m&&j+1>=0&&j+1<n&&maze[i][j+1]==1){
            solve(i,j+1,op+'R',maze,m,n);
        }
    }
}
