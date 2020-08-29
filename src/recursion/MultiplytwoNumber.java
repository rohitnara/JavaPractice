package recursion;

public class MultiplytwoNumber {
    public static void main(String[]args){
       int x=10;
        int y=10;
        if(x==0||y==0){
            System.out.println(0);
            return;
        }
       System.out.println(print(x,y));
    }
    static int print(int x,int y){
        if(y==1){
            //System.out.println(x);
            return x;
        }
        return print(x,y-1)+x;
    }
}
