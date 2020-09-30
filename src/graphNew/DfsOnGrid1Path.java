package graphNew;

import java.util.Arrays;

public class DfsOnGrid1Path {
    public static void main(String args[]){
        int m=4;
        int n=4;
        int a[][]={
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 1, 1}
        };
        int s1=0;
        int s2=0;
        int d1=3;
        int d2=3;
        boolean vis[][]=new boolean[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(vis[i],false);
        }
        System.out.println(isPathExists(s1,s2,d1,d2,a,vis,m,n));
    }

    private static boolean isPathExists(int s1, int s2, int d1, int d2, int[][] a, boolean[][] vis,int m,int n) {
        if(s1<0||s1>=m||s2<0||s2>=n||a[s1][s2]==0||vis[s1][s2]){
            return false;
        }
        if(s1==d1&&s2==d2){
            return true;
        }
        vis[s1][s2]=true;
        if(isPathExists(s1-1,s2,d1,d2,a,vis,m,n)){
            return true;
        }
        if(isPathExists(s1,s2+1,d1,d2,a,vis,m,n)){
            return true;
        }
        if(isPathExists(s1+1,s2,d1,d2,a,vis,m,n)){
            return true;
        }
        if(isPathExists(s1,s2-1,d1,d2,a,vis,m,n)){
            return true;
        }
        return false;
    }
}
