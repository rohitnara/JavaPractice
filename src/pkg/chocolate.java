package pkg;

import java.util.*;
import java.lang.*;
import java.io.*;

class chocolate {
	public static void main (String[] args) {
		int t,n,m;
		Scanner scan = new Scanner(System.in);
		t=scan.nextInt();
		while(t--!=0){
		    n=scan.nextInt();
		    int[] arr = new int[n];
		    for(int i=0;i<n;i++) arr[i]=scan.nextInt();
		    m=scan.nextInt();
		    Arrays.sort(arr);
		    int min=arr[n-1]-arr[0];
		    for(int i=0;i<n-m+1;i++){
		        if(min>arr[i+m-1]-arr[i]) min = arr[i+m-1]-arr[i];
		    }
		    System.out.println(min);
		}
	}
}