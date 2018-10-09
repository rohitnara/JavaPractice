package Flipkart;
import java.util.*;
import java.lang.*;
import java.io.*;

public class FibonacciGame {
	boolean check(int a,int b){
		int arr[]=new int[1000];
		arr[0]=1;
		arr[1]=1;
		int d=2;
		if(a==1 && b==1)
			return true;
		if(a==1 && b==2)
			return true;
		while(true){
			arr[d]=arr[d-1]+arr[d-2];
			if(arr[d]==a){
				if(arr[d]+arr[d-1]==b){
					return true;
				}
			}
			if(arr[d]>a){
				d++;
				continue;
			}
			if(arr[d]<a){
				return false;
			}
			
		}
		
	}
	void game(int [][]matrix, int m,int n){
		System.out.println("Enter move");
		String move;
		int p,q,r;
		Scanner in = new Scanner(System.in);
		move = in.next();
		//System.out.println(move);
		if(move.equals("up")){
			for(int j=0;j<n;j++){
				for(int i=m-1;i>=0;i--){
					
					if(matrix[i][j]!=0){
						for(int k=0;k<i;k++){
							if(matrix[k][j]==0){
								matrix[k][j]=matrix[i][j];
								matrix[i][j]=0;
								System.out.println(i+ " "+j);
								break;
							}
						else{
						if(check(matrix[i][j],matrix[k][j])){
							matrix[k][j]=matrix[k][j]+matrix[i][j];
							matrix[i][j]=0;
							break;
						}
							
						}
						}
					}
				}
			}
		}
		for(int i =0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Fill a cell with number");
		p=in.nextInt();
		q=in.nextInt();
		r=in.nextInt();
		matrix[p][q]=r;
		for(int i =0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		game(matrix,m,n);
	}

	public static void main(String[] args) {
		FibonacciGame f = new FibonacciGame();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mxn");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int a,b,c,d,x,y;
		int matrix[][] = new int[m][n];
		for(int i =0;i<m;i++){
			for(int j=0;j<n;j++){
				matrix[i][j]=0;
			}
		}
		System.out.println("Give input");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		x = sc.nextInt();
		y = sc.nextInt();
		matrix[a][b]=x;
		matrix[c][d]=y;
		for(int i =0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		f.game(matrix,m,n);
	}

}
