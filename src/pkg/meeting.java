package pkg;

import java.util.*;
import java.lang.*;
import java.io.*;

class meeting {static int s[],f[],o[];
	public static void main (String[] args) {
	    
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n=sc.nextInt();
		    s=new int[n];
		    f=new int[n];o=new int[n];
		    for(int j=0;j<n;j++)
		        {s[j]=sc.nextInt();o[j]=j+1;}
		    for(int j=0;j<n;j++)
		        f[j]=sc.nextInt();
		  sort(s,f);
		        //System.out.println(Arrays.toString(s)+" "+Arrays.toString(f));
		    
		    int count=1,in=0;System.out.print(o[0]+" ");
		    for (int j = 1; j < n; j++)
    {
      if (s[j] >= f[in])
      {
          System.out.print((o[j])+" ");
          in = j;count++;
      }
    }
		    System.out.println();
		}
	}
	static void sort(int []s,int[]f)
	{
	     for (int n = 0; n < s.length; n++) {
        for (int m = 0; m < s.length-1 - n; m++) {
            if ((f[m]-(f[m + 1])) > 0) {
                int swapString = f[m];
                f[m] = f[m + 1];
                f[m + 1] = swapString;
                int swapInt = s[m];
                s[m] = s[m + 1];
                s[m + 1] = swapInt;
                int swap = o[m];
                o[m] = o[m + 1];
                o[m + 1] = swap;
            }
        }
    }
	}
}