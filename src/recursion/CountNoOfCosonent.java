package recursion;

public class CountNoOfCosonent {
    public static void main(String[] args){
        String s = "aeiou   xa";
        if(s==null||s.length()==0){
            System.out.println(0);
            return;
        }
        System.out.println(print(s));
    }
    static int print(String s){
        if(s.length()==1){
            if(isConsonent(s.charAt(0))){
                return 1;
            }else {
                return 0;
            }
        }
        char c=s.charAt(0);
        s=s.substring(1);
        return isConsonent(c) ? print(s)+1:print(s);
    }
    static boolean isConsonent (char c){
        if(!(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')&&c>='a'&&c<='z'){
            return true;
        }
        return false;
    }
}
