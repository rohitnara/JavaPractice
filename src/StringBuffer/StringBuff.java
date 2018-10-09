package StringBuffer;
import java.util.*;
import java.lang.*;
import java.io.*;

public class StringBuff {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer("Hello Rohit");
		//StringBuffer sb1 = new StringBuffer();
		//sb1.append(sc.nextLine());
		System.out.println(sb);
		//System.out.println(sb1);
		System.out.println(sb.charAt(1));
		System.out.println(sb.length());
		sb.reverse();
		System.out.println(sb);
		System.out.println(sb.substring(1,3));
		char ch[] = sb.toString().toCharArray();
		System.out.println(ch[4]);
		Arrays.sort(ch);
		String s = String.valueOf(ch);
		sb = new StringBuffer(s);        //conversion string to stringbuffer
		System.out.println(sb);
		sb.delete(2,5);           //5 excluded
		System.out.println(sb);
		sb.replace(2, 4, "rohit"); // 4 excluded
		System.out.println(sb);
		sb.insert(2,"man");
		System.out.println(sb);
		StringBuffer sb2 = new StringBuffer("Hmanrohitloot");
		System.out.println(sb.toString().equals(sb2.toString()));
		System.out.println(sb2.charAt(5)==sb2.charAt(12));
		String a="Hi";
		StringBuffer b= new StringBuffer("Rohit");
		b.append(a);
		System.out.println(b);
		s=String.valueOf(b);
		System.out.println(s);
		
/*		sb = new StringBuffer("Hello            Rohit");
		sb.toString().trim();        this will not work since we are not storing
		System.out.println(sb);*/
		
		
	}

}
