package pkg;

import java.util.*;
import java.lang.*;
import java.io.*;

class inversion {
	public static void main (String[] args) {
		//code
		Scanner in = new Scanner(System.in);
		int T=in.nextInt();
		int N;
		int[] c;
		for(int i=0;i<T;i++){
		    N=in.nextInt();
		    c=new int[N];
		    for(int j=0;j<N;j++)
		        c[j]=in.nextInt();
		    int count=0;
		    for(int j=0;j<N;j++){
		        for(int k=j+1;k<N;k++){
		            if(c[j]>c[k])
		                count++;
		        }
		    }
		    System.out.println(count);
		}
	}
}