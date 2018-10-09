package pkg;
import java.util.*;
import java.lang.*;
import java.io.*;

class firstnonrepeating {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		int T=in.nextInt();
		int N;
		char[] unChar;
		int[] present;
		int[] count;
		int ind, curr, prevInd;
		char prev,next;
		for(int i=0;i<T;i++){
		    N=in.nextInt();
		    unChar=new char[26];
		    present=new int[26];
		    count= new int[26];
		    prev='#';
		    curr=0;
		    prevInd=-1;
		    for(int j=0;j<N;j++){
		        next=in.next().charAt(0);
		        ind=next-'a';
		        count[ind]++;
		        if(next!=prev){
		            ind=next-'a'; 
		            if(present[ind]==0){
		                present[ind]=1;
		                unChar[curr]=next;
		                curr++;
		                if(prev=='#'){
		                    prev=next;
		                    prevInd=curr-1;
		                }
		            }
		        }
		        else{
		            int k;
		            for(k=prevInd+1;k<curr;k++){
		                if(count[unChar[k]-'a']==1){
		                    prev=unChar[k];
		                    prevInd=k;
		                    break;
		                }
		            }
		            if(k==curr)
		                prev='#';
		        }
		        if(prev=='#')
		            System.out.print(-1+" ");
		        else
		            System.out.print(prev+" ");
		    }
		    System.out.println();
		}
	}
}