package String;
import java.util.*;
import java.lang.*;
import java.io.*;

public class substr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		int n=sc.nextInt();
		for(int i=0;i<s.length()-n+1;i++){
			System.out.println(s.substring(i,i+n));
		}
	}

}
