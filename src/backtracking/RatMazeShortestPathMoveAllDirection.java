package backtracking;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class DistCalc{
    int i;
    int j;
    int dist;
    DistCalc(int i,int j,int dist){
        this.i=i;
        this.j=j;
        this.dist=dist;
    }
}
public class RatMazeShortestPathMoveAllDirection {
    static int res=0;
    public static void main(String args[]){
        int maze[][]={
                {1, 1, 1, 0},
                {1, 1, 1, 1},
                {0, 1, 0, 0},
                {1, 1, 1, 1}
        };
        if(maze.length==0){
            System.out.println(0);
            return;
        }
        int m=maze.length;
        int n=maze[0].length;
        boolean vis[][]=new boolean[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(vis[i],false);
        }
        bfs(0,0,m,n,maze,vis);
        if(res==0){
            System.out.println("Not reachable");
        }else {
            System.out.println(res);
        }
    }
    private static void bfs(int i,int j,int m,int n, int[][] maze,boolean[][]vis){
        Queue<DistCalc> q=new LinkedList<>();
        if(maze[i][j]==0){
            return;
        }
        q.add(new DistCalc(i,j,1));
        vis[i][j]=true;
        while(q.size()!=0){
            DistCalc p =q.remove();
            if(p.i==m-1&&p.j==n-1){
                res=p.dist;
                return;
            }
            if(p.i-1>=0&&p.i-1<m&&p.j>=0&&p.j<n&&maze[p.i-1][p.j]==1&&!vis[p.i][p.j]){
                q.add(new DistCalc(p.i-1,p.j,p.dist+1));
                vis[p.i-1][p.j]=true;
            }
            if(p.i>=0&&p.i<m&&p.j+1>=0&&p.j+1<n&&maze[p.i][p.j+1]==1&&!vis[p.i][p.j+1]){
                q.add(new DistCalc(p.i,p.j+1,p.dist+1));
                vis[p.i][p.j+1]=true;
            }
            if(p.i+1>=0&&p.i+1<m&&p.j>=0&&p.j<n&&maze[p.i+1][p.j]==1&&!vis[p.i+1][p.j]){
                q.add(new DistCalc(p.i+1,p.j,p.dist+1));
                vis[p.i+1][p.j]=true;
            }
            if(p.i>=0&&p.i<m&&p.j-1>=0&&p.j-1<n&&maze[p.i][p.j-1]==1&&!vis[p.i][p.j-1]){
                q.add(new DistCalc(p.i,p.j-1,p.dist+1));
                vis[p.i][p.j-1]=true;
            }
        }
    }
}
