package amazon;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.lang.*;
 class ABC{
	 int a;
	 ABC(int a){
		 this.a=a;
	 }
	 void fun(){
		 System.out.println(a);
	 }
	 public static void main(String[] args){
		 ABC x=new ABC(10);
		 x.fun();
		 x=new ABC(20);
		 x.fun();
	 }
 }

 
