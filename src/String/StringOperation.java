package String;
import java.util.*;

public class StringOperation {

	public static void main(String[] args) {
		String s="Hello";
		String st;
		Scanner sc= new Scanner(System.in);
		st=sc.nextLine();
		System.out.println(s+","+st);
		char ch[]=st.toCharArray();
		System.out.println(ch[0]);
		System.out.println(s.length());
		System.out.println(ch.length);
		System.out.println(st);
		//Arrays.sort(ch);
		st=String.valueOf(ch);
		System.out.println(st);
		System.out.println(s+st);//concatanation
		boolean b=s.equals(st); //compare
		System.out.println(b);
		System.out.println(st.substring(2, 5));
		//System.out.println(st.substring(5));
		//st=st.trim();
		System.out.println(st);

	}

}
