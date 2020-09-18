package backtracking;

import java.util.LinkedList;
import java.util.Queue;
//time O(n^2)
class Dist {
    int i;
    int j;
    Dist(int i,int j){
       this.i=i;
       this.j=j;
    }
}
public class RatMazeTotalNoOfPath {
    static int count=0;
    public static void main(String args[]){
        int maze[][]={
                {1, 1, 1, 1},
                {0, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}
        };
        if(maze.length==0){
            System.out.println(0);
            return;
        }
        bfs(0,0,maze,maze.length,maze[0].length);
        System.out.println(count);
    }
    private static void bfs(int i,int j, int[][] maze, int m,int n){
        Queue<Dist> q= new LinkedList<>();
        if(!isSafe(i,j,maze,m,n)){
            //System.out.print(0);
            return;
        }
        q.add(new Dist(i,j));
        while(q.size()!=0){
            Dist p=q.remove();
            if(p.i==m-1&&p.j==n-1){
                count++;
            }
            if(isSafe(p.i,p.j+1,maze,m,n)){
                q.add(new Dist(p.i,p.j+1));
            }
            if(isSafe(p.i+1,p.j,maze,m,n)){
                q.add(new Dist(p.i+1,p.j));
            }
        }


    }
    private static boolean isSafe(int i,int j,int[][] maze, int m,int n) {
        return (i>=0&&i<m&&j>=0&&j<n&&maze[i][j]==1)?true:false;
    }
}
