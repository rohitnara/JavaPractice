package pkg;
import java.util.*;
import java.lang.*;
import java.io.*;

class stock {
	public static void main (String[] args) {
		//code
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		int n,a[];
		while (t-- > 0) {
			n=s.nextInt();
			a=new int[n];
			for(int i=0;i<n;i++)a[i]=s.nextInt();
			int si=0,ei=n-1;
			boolean found=false;
			for(int i=0;i<n-1;) {
				while((i<n-1)&&a[i]>=a[i+1])
					i++;
				if(i==n-1) {
				    if(!found)
					System.out.print("No Profit");
					break;
				}
				si=i;
				i++;
				while((i<n)&&a[i]>=a[i-1])
					i++;
					found=true;
				System.out.print("("+si+" "+(i-1)+") "); 
				
				
			}
			System.out.println();
		}
	}
}