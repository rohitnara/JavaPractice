package recursion;

public class PermutationWithSpace {
    public static void main(String[] args){
        String s="abcd";
        if(s==null || s.length()==0){
            return;
        }
        String in = s.substring(1); //s.substring(1) gives "" however s.substring(2) gives null pointer exception
        String op = String.valueOf(s.charAt(0));
        permutationWithSpace(in,op);
    }
    static void permutationWithSpace(String in, String op){
        if(in.length()==0){
            System.out.println(op);
            return;
        }
        String op1 = op+" "+in.charAt(0);
        String op2 = op+in.charAt(0);
        in = in.substring(1);
        permutationWithSpace(in,op1);
        permutationWithSpace(in,op2);
    }
}
