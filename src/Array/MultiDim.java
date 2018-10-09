package Array;

import java.util.*;
import java.io.*;
import java.lang.*;

public class MultiDim {

	public static void main(String[] args) {
		int [][]a=new int[3][4];
		System.out.println(a.length);
		System.out.println(a[0].length);
		Scanner sc=new Scanner(System.in);
/*		for(int i=0;i<3;i++){
			for(int j=0;j<4;j++){
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<4;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}*/
		System.out.println();
		System.out.println(a.length);
		System.out.println(a[0].length);
		int [][]b={{8,7,5,6},{1,8,3,4},{9,10,11,12}};
		for(int i=0;i<3;i++){
			for(int j=0;j<4;j++){
				System.out.print(b[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println(b.length);
		System.out.println(b[0].length);
		Arrays.sort(b[1]);//   important how to sort row
		for(int i=0;i<3;i++){
			for(int j=0;j<4;j++){
				System.out.print(b[i][j]+ " ");
			}
			System.out.println();
		}

	}

}
