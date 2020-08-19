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
		String str = "    1hel l  o   ";
		str = str.trim();
		System.out.println(str);
		str = str.replaceAll("\\s+","");//do trim before split
		System.out.println(str);
		str = str.replaceAll("l","k");
		System.out.println(str);
		System.out.println(str.contains("h"));
		System.out.println(str.contains("ek"));
		System.out.println(str.contains("xy"));
		System.out.println(str.startsWith("h"));
		System.out.println(str.startsWith("he"));
		System.out.println(str.startsWith("hk"));
		System.out.println(str.endsWith("o"));
		System.out.println(str.endsWith("ko"));
		System.out.println(str.endsWith("xy"));
		System.out.println(str.indexOf("k"));
		System.out.println(str.indexOf("he"));
		System.out.println(str.lastIndexOf("k"));
		System.out.println(str.lastIndexOf("ko"));
		System.out.println(str.lastIndexOf("oo"));
		String str1 = "he he hi hi";
		String[] str2 = str1.split(" ");//do trim before split
		for(String s1: str2) {
			System.out.println(s1);
		}
		//check a character is lowercase or uppercase
		System.out.println((str.charAt(0)>='a'&&str.charAt(0)<='z')||(str.charAt(0)>='A'&&str.charAt(0)<='Z'));
		System.out.println(str);
		/*concept:
		1. only + works with character ie str.charAt(0) however toUpperCase() etc won't work
		for this we need to change String.valueOf(str.charAt(0)).toUpperCase()
		String s="a";
		s=s.substring(1)-->""
		s=s.substring(2)-->StringIndexOutOfBound exception
		 */
	}

}
