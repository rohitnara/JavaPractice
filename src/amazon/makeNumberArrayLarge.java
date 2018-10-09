package amazon;

public class makeNumberArrayLarge {
	static void fun(int a[]){
		int n=a.length;
		String x="";
		String y="";
		String p="";
		String q="";
		int c,d;
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
				x=String.valueOf(a[j]);
				y=String.valueOf(a[j+1]);
				p=x+y;
				q=y+x;
				c=Integer.parseInt(p);
				d=Integer.parseInt(q);
			if(d>c){
				int t=a[j];
				a[j]=a[j+1];
				a[j+1]=t;
			}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(a[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={7,776,7,7};
		fun(a);

	}

}
