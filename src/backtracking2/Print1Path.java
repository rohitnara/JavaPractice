package backtracking2;

public class Print1Path {
    public static void main(String args[]){
        int maze[][]={
                {1, 1, 1, 0},
                {0, 1, 1, 0},
                {0, 1, 0, 1},
                {1, 1, 1, 1}
        };
        if(maze.length==0){
            System.out.println("No Solution");
            return;
        }
        int result[][] = new int [maze.length][maze[0].length];
        if(solve(0,0,result,maze,maze.length,maze[0].length)){
            print(result);
        }else {
            System.out.println("No Solution");
        }
    }
    private static boolean solve(int i,int j,int [][] res, int [][] maze, int m,int n){
        if(i<0||i>=m||j<0||j>=n||maze[i][j]==0)
            return false;
        if(i==m-1&&j==n-1){
            res[i][j]=1;
            return true;
        }
        res[i][j]=1;
        if(solve(i+1,j,res,maze,m,n))
            return true;
        if(solve(i,j+1,res,maze,m,n))
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
