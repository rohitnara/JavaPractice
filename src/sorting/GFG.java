package sorting;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int res[]=new int[n];
            Stack<Integer> s= new Stack<>();
            solve(a,res,s);
            print(res);
            System.out.println();
        }
    }
    private static void solve(int a[], int res[], Stack<Integer>s){
        int k=0;
        res[k++]=1;
        s.add(0);
        for(int i=1;i<a.length;i++){
            while(s.size()!=0){
                if(a[s.peek()]>a[i]){
                    res[k++]=i-s.peek();
                    s.add(i);
                    break;
                }else {
                    s.pop();
                }
            }
            if(s.size()==0){
                res[k++]=i+1;
                s.add(i);
            }
        }
    }
    private static void print(int[] res){
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
