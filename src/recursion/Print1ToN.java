package recursion;

public class Print1ToN {
    public static void main(String[] args){
        print(10);
    }
    public static void print(int n){
        if(n==0){
            //System.out.println(n);
            return;
        }
        print(n-1);
        System.out.println(n);
    }
}
