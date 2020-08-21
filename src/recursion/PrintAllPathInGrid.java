package recursion;

import java.util.*;
import java.lang.*;
import java.io.*;

class PrintAllPathInGrid {
    static int count=0;
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t--!=0){
            int m=sc.nextInt();
            int n=sc.nextInt();
            char a[][]=new char[m][n];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    a[i][j]=sc.next().charAt(0);
                }
            }
            String op= String.valueOf(a[0][0]);
            print(a,0,0,op,m,n);
            System.out.println(count);
            count=0;
        }
    }
    static void print(char[][] a, int i,int j,String op,int m,int n){
        if(i==m-1&&j==n-1){
            count++;
            System.out.println(op);
            return;
        }
        if(i>=0&&i<m&&j+1>=0&&j+1<n) {
            String op1 = op + a[i][j + 1];
            print(a, i, j + 1, op1, m, n);
        }
        if(i+1>=0&&i+1<m&&j>=0&&j<n) {
            String op2 = op + a[i + 1][j];
            print(a, i + 1, j, op2, m, n);
        }
    }
}