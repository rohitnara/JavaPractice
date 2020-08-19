package recursion;

public class ReplaceCharBy01 {
    public static void main(String[] args){
        String s=null;
        if(s==null || s.length()==0){
            return;
        }
        String in = s;
        String op = "";
        replaceCharBy01(in,op);
    }
    static void replaceCharBy01(String ip, String op){
        if(ip.length()==0){
            System.out.println(op);
            return;
        }
        if(ip.charAt(0)=='*'){
            String op1=op+'0';
            String op2=op+'1';
            ip=ip.substring(1);
            replaceCharBy01(ip,op1);
            replaceCharBy01(ip,op2);
        } else {
            op=op+ip.charAt(0);
            ip=ip.substring(1);
            replaceCharBy01(ip,op);
        }
    }
}
