package amazon;
import java.util.*;
import java.io.*;
import java.lang.*;

public class gms {
	static void fun(String s,int i,int j){
		for(int k=0;k<s.length();k++){
			if(s.charAt(k)=='U'){
				j++;
			}
			if(s.charAt(k)=='D'){
				j--;
			}
			if(s.charAt(k)=='L'){
				i--;
			}
			if(s.charAt(k)=='R'){
				i++;
			}
			
		}
		System.out.println(i+ " " + j);
	}
	public static void main(String[] args){
		String s="UDDLLRUUUDUURUDDUULLDRRRR";
		fun(s,0,0);
	}

}
