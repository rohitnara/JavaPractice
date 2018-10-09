package amazon;

public class sumZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,0,5,8,13};
		int n=a.length;
		int l=0,i,j,k;
		int sum=0;
		int count=0;
		for(i=0;i<n;i++){
			//sum=0;
			for(j=0;j<n-l;j++){
				sum=0;
				for(k=j;k<=j+l;k++){
					sum=sum+a[k];
				}
				if(sum==0)
				{
					System.out.println(j+" "+(j+l));
					count++;
					//return;
				}
			}
			l++;
		}
		if(count==0){
			System.out.println("No subarray exists");
		}
	}

}
