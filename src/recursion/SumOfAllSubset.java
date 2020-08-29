package recursion;

import java.util.ArrayList;
import java.util.List;

public class SumOfAllSubset {
    public static void main(String[]args){
        List<Integer> ip = new ArrayList<>();
        ip.add(2);
        ip.add(4);
        ip.add(5);
       // ip.add(5);
        String in = "";
        for(Integer i : ip){
            in = in+i;
        }
        String op="";
        print(in,op);
    }
    static void print(String ip, String op){
        if(ip.length()==0){
            //System.out.println(op);
            printArraySum(op);
            return;
        }
        String op1=op;
        String op2 = op+ip.charAt(0);
        ip=ip.substring(1);
        print(ip,op1);
        print(ip,op2);
    }
    static void printArraySum(String op){
        int sum=0;
        for(int i=0;i<op.length();i++){
            sum +=op.charAt(i)-'0';
        }
        System.out.print(sum+ " ");
    }
}