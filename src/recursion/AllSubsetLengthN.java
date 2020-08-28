package recursion;
//time complexity O(2^n)
public class AllSubsetLengthN {
    public static void main(String[]args){
        String s="1234";
        int k=2;
        if(s==null || k>s.length()){
            return;
        }
        String op="";
        print(s,op,k);
    }
    static void print(String ip,String op,int k){
        if(ip.length()==0&&op.length()!=k){
            return;
        }
        if(ip.length()==0&&op.length()==k){
            System.out.println(op);
            return;
        }
        String op1=op+ip.charAt(0);
        ip=ip.substring(1);
        print(ip,op1,k);
        print(ip,op,k);
    }
}
