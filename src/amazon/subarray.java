package amazon;

public class subarray {

	public static void main(String[] args) {
		int a[]={1,2,3,4};
		int n=a.length;
		int l=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n-l;j++){
				//System.out.print("{");
				for(int k=j;k<=j+l;k++){
					//if(l>0&&k<j+l)
					//	System.out.print(a[k]+",");	
					//else
					System.out.print(a[k]);
				}
				//System.out.print("}");
				System.out.println();
			}
			l++;
		}

	}

}
