package amazon;
import java.util.*;

public class repeatConsChar {

	public static void main(String[] args) {
		String s="abbbcccd";
		int count=1;
		int max=0;
		char a=' ';
		for(int i=1;i<s.length();i++){
			if(s.charAt(i)==s.charAt(i-1)){
				count++;
				if(count>max){
					max=count;
					a=s.charAt(i);
				}
			}
			else{
				count=1;
			}
		}
		if(max==0){
			System.out.println(s.charAt(0));
		}
		else
			System.out.println(a);
	}

}
