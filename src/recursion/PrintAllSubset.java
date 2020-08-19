package recursion;

import java.util.*;

public class PrintAllSubset {
    public static void main(String[] args){
        Set<String> l = new TreeSet<>();
        String s="abc";
        String in = s;
        String op = "";
        if(s==null){
            return;
        }
        calculateSubSet(l,in,op);
        //Collections.sort(l,(x,y)->x.compareTo(y));
        System.out.println(l);
    }
    static void calculateSubSet(Set<String> l,String in,String op){
        if(in.length()==0){
            l.add(op);
            return;
        }
        String op1=op;
        String op2=op+in.charAt(0);
        in=in.substring(1);
        calculateSubSet(l,in,op1);
        calculateSubSet(l,in,op2);
    }
}
