package recursion;

public class ReverseString {
    private static String s;
    public static void main(String[] args){
        s= "a";
        System.out.println(s);
        reverse();
        System.out.println(s);
    }
    static void reverse(){
        if(s==null || s.length()==0 ||s.length()==1){
            return;
        }
        char c=s.charAt(0);
        s=s.substring(1);
        reverse();
        s=s+c;
    }
}
