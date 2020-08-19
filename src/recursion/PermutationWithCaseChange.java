package recursion;
/* input: ab
output: ab,aB,Ab,AB
 */
public class PermutationWithCaseChange {
    public static void main(String[] args){
        String s="ab";
        if(s==null || s.length()==0){
            return;
        }
        String in = s;
        String op = "";
        permutationWithCaseChange(in,op);
    }
    static void permutationWithCaseChange(String in,String op){
        if(in.length()==0){
            System.out.println(op);
            return;
        }
        String op1 = op+in.charAt(0);
        String op2 = op+(String.valueOf(in.charAt(0)).toUpperCase());
        in = in.substring(1);
        permutationWithCaseChange(in,op1);
        permutationWithCaseChange(in,op2);
    }
}
