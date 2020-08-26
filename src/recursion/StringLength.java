package recursion;

public class StringLength {
    public static void main(String[] args){
        String s = "";
        if(s==null||s.length()==0){
            System.out.println(0);
            return;
        }
        System.out.println(print(s));
    }
    static int print(String s){
        if(s.length()==1){
            return 1;
        }
        s=s.substring(1);
        return 1+print(s);
    }
}
