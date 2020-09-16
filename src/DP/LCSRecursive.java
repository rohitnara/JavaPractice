package DP;

public class LCSRecursive {
    public static void main(String []args){
        String first="a";
        String second="";
        int m=first.length();
        int n=second.length();
        System.out.println(lcs(first,second,m,n));
    }
    private static int lcs(String a, String b, int m, int n){
        if(m==0||n==0){
            return 0;
        }
        return a.charAt(m-1)==b.charAt(n-1)?1+lcs(a,b,m-1,n-1):Math.max(lcs(a,b,m-1,n),lcs(a,b,m,n-1));
    }
}
