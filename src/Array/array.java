package Array;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class array {

	public static void main(String[] args) {
/*		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []a1=new int[n];
		char c1[]=new char[n];
		String []s1=new String[n];
		float f1[]=new float[n];
		double d1[]=new double[n];*/
		int []a2={6,4,2,8,4,0,1,5,3};
		char[] c2={'d','c','b','a','g'};
		String s2[]={"Ram","Shyam","Xohan","Rohit","papya"};
		float f2[]={8.0f,2f,6f,1f,3f};
		double d2[]={7.0,4,2,1,6};
		//System.out.println(a2.length+" "+" "+s2.length+" "+" "+c2.length);
		//System.out.println();
/*		for  (int i=0;i<n;i++){
			a1[i]=sc.nextInt();
		}
		for  (int i=0;i<n;i++){
			c1[i]=sc.next().charAt(0);
		}
		for  (int i=0;i<n;i++){
			s1[i]=sc.next();
		}
		for  (int i=0;i<n;i++){
			f1[i]=sc.nextFloat();
		}
		for  (int i=0;i<n;i++){
			d1[i]=sc.nextDouble();
		}
		for  (int i=0;i<n;i++){
			System.out.print(a1[i]);
		}
		System.out.println();
		for  (int i=0;i<n;i++){
			System.out.print(c1[i]);
		}
		System.out.println();
		for  (int i=0;i<n;i++){
			System.out.print(s1[i]);
		}
		System.out.println();
		for  (int i=0;i<n;i++){
			System.out.print(f1[i]);
		}
		System.out.println();
		for  (int i=0;i<n;i++){
			System.out.print(d1[i]);
		}
		System.out.println();*/
		//Arrays.sort(a2);
		Arrays.sort(c2);
		Arrays.sort(s2);
		Arrays.sort(f2);
		Arrays.sort(d2);
		for  (int i=0;i<a2.length;i++){
			System.out.print(a2[i]);
		}
		System.out.println();
		for  (int i=0;i<c2.length;i++){
			System.out.print(c2[i]);
		}
		System.out.println();
		for  (int i=0;i<s2.length;i++){
			System.out.print(s2[i]);
		}
		System.out.println();
		for  (int i=0;i<f2.length;i++){
			System.out.print(f2[i]);
		}
		System.out.println();
		for  (int i=0;i<d2.length;i++){
			System.out.print(d2[i]);
		}
		System.out.println();
		Arrays.sort(a2,1,4);
		for  (int i=0;i<a2.length;i++){
			System.out.print(a2[i]);
		}
		System.out.println();
		System.out.println(Arrays.binarySearch(a2, 4));
		System.out.println(Arrays.binarySearch(c2, 'c'));
		System.out.println(Arrays.binarySearch(s2, "Rohit"));
		System.out.println(Arrays.binarySearch(f2, 10.0f));
		System.out.println(Arrays.binarySearch(d2, 3.0));
		Arrays.sort(a2,5,8);
		for  (int i=0;i<a2.length;i++){
			//System.out.print(a2[i]);
		}
		
	
	}

}
