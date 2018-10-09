package pkg;

import java.util.*;
import java.lang.*;
import java.io.*;

class goldmine {
	public static void main (String[] args) {
		//code
		Scanner in=new Scanner(System.in);
		int T=in.nextInt();
		
		for(int i=0;i<T;i++){
		    n=in.nextInt();
		    m=in.nextInt();
		    mine= new int[n][m];
		    val= new int[n][m];
		    for(int j=0;j<n;j++){
		        for(int k=0;k<m;k++){
		            mine[j][k]=in.nextInt();
		            val[j][k]=-1;
		        }
		    }
		    int max=0;
		    int v;
		    for(int j=0;j<n;j++){
		        if(val[j][0]==-1)
		            v=f(j,0);
		        else
		            v=val[j][0];
		        if(v>max){
		            max=v;
		        }
		    }
		    System.out.println(max);
		}
	}
	
	public static int m, n;
	public static int[][] mine;
	public static int[][] val;
		
	public static int f(int row, int col){
	    if(col==m || row<0 || row>=n)
	        return(0);
	    else if(val[row][col]!=-1)
	        return(val[row][col]);

	    else{
	        int x=mine[row][col]+Math.max(Math.max(f(row-1,col+1),f(row+1,col+1)),f(row,col+1));
	        val[row][col]=x;
	        return(x);
	    }
	}
}