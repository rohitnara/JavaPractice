package backtracking;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

//time O(n^2)
class BFS{
    int i;
    int j;
    int dist;
    BFS(int i,int j,int dist){
        this.i=i;
        this.j=j;
        this.dist=dist;
    }
}
public class ShortestDistFromSToD {
    public static int count=0;
    public static void main(String args[]){
        int maze[][]={
                {1, 0, 1, 1},
                {1, 1, 1, 1},
                {1, 0, 1, 1},
                {1, 1, 1, 1}
        };
        if(maze.length==0){
            System.out.println(0);
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
        bfs(s1,s2,d1,d2,maze,vis,m,n);
        System.out.println(count);
    }

    private static void bfs(int s1, int s2, int d1, int d2, int[][] maze, boolean[][] vis,int m,int n) {
        if(maze[s1][s2]==0){
            return;
        }
        Queue<BFS> q=new LinkedList<>();
        vis[s1][s2]=true;
        q.add(new BFS(s1,s2,1));
        while(q.size()!=0){
            BFS p=q.remove();
            if(p.i==d1&&p.j==d2){
                count=p.dist;
                return;
            }
            if(p.i-1>=0&&p.i-1<m&&p.j>=0&&p.j<n&&!vis[p.i-1][p.j]&&maze[p.i-1][p.j]==1){
                q.add(new BFS(p.i-1,p.j,p.dist+1));
                vis[p.i-1][p.j]=true;
            }
            if(p.i>=0&&p.i<m&&p.j+1>=0&&p.j+1<n&&!vis[p.i][p.j+1]&&maze[p.i][p.j+1]==1){
                q.add(new BFS(p.i,p.j+1,p.dist+1));
                vis[p.i][p.j+1]=true;
            }
            if(p.i+1>=0&&p.i+1<m&&p.j>=0&&p.j<n&&!vis[p.i+1][p.j]&&maze[p.i+1][p.j]==1){
                q.add(new BFS(p.i+1,p.j,p.dist+1));
                vis[p.i+1][p.j]=true;
            }
            if(p.i>=0&&p.i<m&&p.j-1>=0&&p.j-1<n&&!vis[p.i][p.j-1]&&maze[p.i][p.j-1]==1){
                q.add(new BFS(p.i,p.j-1,p.dist+1));
                vis[p.i][p.j-1]=true;
            }
        }
    }
}
