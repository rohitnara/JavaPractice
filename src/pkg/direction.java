package pkg;

import java.util.*;
import java.lang.*;
import java.io.*;

class direction {
	public static void main (String[] args) {
		//code
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    String s = sc.next();
	      
	      int count[] = new int[4];
	      
	      for(int i=0;i<s.length();i++)
	      {
	          
	          switch(s.charAt(i))
	          {
	              case 'E':
	                  count[0] = count[0]+1;
	               break;
	               case 'N':
	                    count[1] = count[1]+1;
	               break;
	               
	               case 'S':
	                    count[2] = count[2]+1;
	               break;
	               case 'W':
	                    count[3] = count[3]+1;
	               break;
	           
	          }
	      }
	      
	      if(count[0] >= count[3])
	      {
            count[0] = count[0] - count[3];
	        count[3] = 0;
	          
	      }else{
	          count[3] = count[3] - count[0];
	        count[0] = 0;
	      }
	      
	      if(count[1] >= count[2])
	      {
            count[1] = count[1] - count[2];
	        count[2] = 0;
	          
	      }else{
	          count[2] = count[2] - count[1];
	        count[1] = 0;
	      }
	      
	      while(count[0]>0){System.out.print("E");
	          count[0] = count[0] - 1;
	      }
	      while(count[1]>0){System.out.print("N");
	           count[1] = count[1] - 1;
	      }
	      while(count[2]>0){System.out.print("S");
	           count[2] = count[2] - 1;
	      }
	      while(count[3]>0){System.out.print("W");
	           count[3] = count[3] - 1;
	      }
	      
	      System.out.println();
	      
		}
		
	}
}