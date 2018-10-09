package pkg;

import java.util.*;
import java.lang.*;
import java.io.*;
class keypad
{
    static HashMap<Integer, String> h = new HashMap<>();
    
	public static void main (String[] args)
	 {
	 Scanner sc = new Scanner(System.in);
	 int tc = sc.nextInt();
	 for(int i = 0 ; i < tc ; i++){
	    int n = sc.nextInt();

	    int arr[] = new int[n];
	    
	    for(int j = 0 ; j < n ; j++){
	     arr[j] = sc.nextInt();
	    }
	    
	    h.put(1,"");
        h.put(2,"abc");
        h.put(3,"def");
        h.put(4,"ghi");
        h.put(5,"jkl");
        h.put(6,"mno");
        h.put(7,"pqrs");
        h.put(8,"tuv");
        h.put(9,"wxyz");    
        
	    find(arr , 0 , n, "");
	    
	    System.out.println();
	  }
    }
    
    static void find(int d[] , int pos , int n, String out){
        if(pos > n)
        return;
        
        if(pos == n){
            System.out.print(out + " ");
            return;
        }
        int curr = d[pos];
        String s = h.get(curr);
        
        for(int k = 0 ; k < s.length() ; k++){
            find(d , pos+1 , n , out + s.charAt(k));
        }
    }
}