package recursion;

public class FirstUpperCase {
    public static void main(String[] args){
        String s = "  hfLghj  ";
        if(s==null){
            return;
        }
        print(s,0);
    }
    static void print(String s,int i){
        if(i==s.length()){
            System.out.println("NO");
            return;
        }
        char c=s.charAt(i);
        if(c>='A'&&c<='Z'){
            System.out.println(c);
            return;
        }
        print(s,i+1);
    }
}
