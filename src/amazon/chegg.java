package amazon;
import java.util.*;
public class chegg {
	static boolean check(ArrayList<Integer> a){
		for(int i=1;i<a.size();i++){
			if(a.get(i-1)==a.get(i))
				return false;
		}
		return true;
	}
	static ArrayList<Integer> fun(int a[]){
		ArrayList<Integer> arr=new ArrayList<>();
		for(int i=0;i<a.length;i++){
			arr.add(a[i]);
		}
		int i;
		while(true){
			i=0;
			if(check(arr)==true)
				return arr;
			else{
				while(i<arr.size()-1){
					if(arr.get(i)==arr.get(i+1)){
						arr.set(i, arr.get(i)+arr.get(i+1));
						arr.remove(i+1);
					}
					i++;
				}
				
			}
			
		}
		//return arr;
	}
	
	
	public static void main(String[] args) {
		int a[]={2,2,2,4,4,4,8,16};
		System.out.println(fun(a));

	}

}
