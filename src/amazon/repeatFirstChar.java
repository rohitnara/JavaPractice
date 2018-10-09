package amazon;
import java.util.*;

public class repeatFirstChar {

	public static void main(String[] args) {
		String s="ks";
		int k=0;
		Map<Character,Integer> m=new HashMap<>();
		for(int i=0;i<s.length();i++){
			if(m.containsKey(s.charAt(i))==false){
				m.put(s.charAt(i), 1);
			}
			else{
				k=m.get(s.charAt(i))+1;
				m.put(s.charAt(i), k);
			}
		}
		for(int i=0;i<s.length();i++){
			if(m.get(s.charAt(i))>1){
				System.out.println(s.charAt(i));
				return;
			}
		}
		System.out.println(s.charAt(0));
	}

}
