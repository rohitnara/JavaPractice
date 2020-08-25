package recursion;

public class BinaryStringWithoutConsecutive1 {
    public static void main(String[]args){
        int n=4;
        String op="";
        generate(n,op);
    }
    static void generate(int n,String op){
        if(n==0){
            System.out.println(op);
            return;
        }
        if(op.length()==0||op.charAt(op.length()-1)=='0'){
            String op1=op+'0';
            generate(n-1,op1);
            String op2=op+'1';
            generate(n-1,op2);
        } else if(op.charAt(op.length()-1)=='1'){
            String op1=op+'0';
            generate(n-1,op1);
        }
    }
}
