package amazon;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.lang.*;
class B extends RuntimeException{
	B(String s){
		super(s);
	}
	
}
 public class A{
	 public static void main(String[] args) throws B{
		int a=5;
		if(a<20){
			throw new B("Exception occured");
		}
		else{
			System.out.println("Hello");
		}
	 }
 }
