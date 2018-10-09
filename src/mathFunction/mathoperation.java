package mathFunction;
import java.lang.*;

public class mathoperation {

	public static void main(String[] args) {
		int a=10;
		float b=-10.5f;
		double c=20.5;
		long d=1000;
		
		System.out.println(Math.abs(a));//return what data type you pass as arg
		System.out.println(Math.abs(b));
		System.out.println(Math.abs(c));
		System.out.println(Math.abs(d));
		
		System.out.println(Math.ceil(a));//return double
		System.out.println(Math.ceil(b));
		System.out.println(Math.ceil(c));
		System.out.println(Math.ceil(d));
		//System.out.println(Math.ceil(e));
		
		System.out.println(Math.floor(a));//return double
		System.out.println(Math.floor(b));
		System.out.println(Math.floor(c));
		System.out.println(Math.floor(d));
		
		System.out.println(Math.round(a));//return int
		System.out.println(Math.round(b));
		System.out.println(Math.round(c));
		System.out.println(Math.round(d));
		
		System.out.println(Math.max(1.0,2)); //parameter may be diff i.e. int and long
		System.out.println(Math.min(d,c));
		
		System.out.println(Math.exp(b)); //e to the power parameter and parameter could be 
										//anything like int long and return double
		
		System.out.println(Math.log(d));// log base e, in case of negative arg it gives value NaN
										// arg could be anything
		
		System.out.println(Math.log10(c));//log base 10
		System.out.println(Math.sqrt(5));
		double f=Math.sqrt(5);//return double
		int g=(int)f;
		System.out.println(g);
		
		System.out.println(Math.pow(2,10));//return double
	}

}
