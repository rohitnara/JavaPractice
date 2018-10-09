package pkg;

import java.util.*;
import java.lang.*;
import java.io.*;

class kthElementoftwosortedarray {
	public static void main (String[] args) {
		//code
		Scanner in = new Scanner(System.in);
		int T;
		T=in.nextInt();
		int p1, p2;
		int n, m, k;
		int[] a1;
		int[] a2;
		int count;
		for(int i=0;i<T;i++){
		    n=in.nextInt();
		    m=in.nextInt();
		    k=in.nextInt();
		    a1=new int[n];
		    a2=new int[m];
		    for(int j=0;j<n;j++)
		        a1[j]=in.nextInt();
		    for(int j=0;j<m;j++)
		        a2[j]=in.nextInt();
		    p1=0;
		    p2=0;
		    count=0;
		    while(count!=k-1 && p1<n && p2<m){
		        if(a1[p1]<a2[p2]){
		            p1++;
		        }
		        else{
		            p2++;
		        }
		        count++;
		    }
		    if(p1>=n){
		        System.out.println(a2[k-n-1]);
		    }
		    else if(p2>=m){
		        System.out.println(a1[k-m-1]);
		    }
		    else if(a1[p1]<a2[p2])
		        System.out.println(a1[p1]);
		    else
		        System.out.println(a2[p2]);
		  
		}
	}
}