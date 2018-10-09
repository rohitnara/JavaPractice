package DataTypeConversion;
import java.util.*;

public class conversion {

	public static void main(String[] args) {
		int a=2;
		char b='1';
		System.out.println(a);
		System.out.println(b);
		char c = (char)(a+'0');//int to char
		int d = b-'0';			// char to int
		System.out.println(c);
		System.out.println(d);
		System.out.println(a+d);
		System.out.println(b+c);
	}

}
